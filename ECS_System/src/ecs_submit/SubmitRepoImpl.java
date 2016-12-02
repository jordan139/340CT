/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs_submit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jeamathu
 */
public class SubmitRepoImpl {
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
                    temp = rs.getInt("COURSE_TITLE") + "\t" + rs.getString("MODULE_TITLE") + "\t"
                            + rs.getString("ATTEMPT_NUMBER") + "\t" + rs.getString("SUB_STATUS") + "\t"
                            + rs.getString("GRADE_STATUS") + "\t" + rs.getDate("COURSE_DUE") + "\t"
                            + rs.getDate("TIME_REMAIN") + "\t" + rs.getString("LAST_MODIFY") + "\t"
                            + rs.getDouble("SUB_COMMENT") + "\n";
                    courseworks.add(temp);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return courseworks;
        
    }

    public void submitCourseworkCoursework(Submit cw) {
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            String sql = "INSERT INTO SUBMIT VALUES (" + cw.SubmissionType + ", '" + cw.SubmissionTitle + "', '" + cw.SubmissionFile + "', " + cw.SubmissionText + "')";
            Statement st = conn.createStatement();
            ResultSet rs = null;
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

   public String digitalReceipt(Submit dr) {
        String dreceipt = "";
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = "SELECT * FROM SUMBIT";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    dreceipt = ("DigitalReceipt has been generated..." + "\n\n" + "REF_NUMBER" + rs.getInt("SUBMISSSION_TITLE") + "\n" + "SUB_DATE");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return dreceipt;
    }
}
