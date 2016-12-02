/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs_submit;

/**
 *
 * @author baheeraj
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Utilities.FileUtils;

public class StudentController {
    
    String connectionURL = "jdbc:derby://localhost:1527/COURSEWORK";
    String uName = "jey";
    String uPass = "123";
    
    public ArrayList getAll() {
        ArrayList<String> courseworks = new ArrayList<>();
        String temp;
        //ConnectionURL, username and password should be specified in getConnection()       
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            System.out.println("Connecting to database..."); //inform user trying to connect to the database
            //if a secure connection has been made 

            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = "SELECT * FROM COURSEWORK";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    temp = rs.getInt("COURSE_TITLE") + "\t" + rs.getString("MODULE_TITLE")+ rs.getString("COURSE_CREATION") + "\n";
                    courseworks.add(temp);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return courseworks;
    }
}
