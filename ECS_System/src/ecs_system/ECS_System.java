/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs_system;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dayj13
 */
public class ECS_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //sample code to demo the databaase connection and sql statements            
        String connectionURL = "jdbc:derby://localhost:1527/CourseworkDB";
        String uName = "ecsAdmin";
        String uPass = "admin";

        //ConnectionURL, username and password should be specified in getConnection()       
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            System.out.println("Connect to database...");

            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                //retrieve the sample records
                System.out.println("retrieve the sample records");
                System.out.println("---------------------------------");
                String sql = "SELECT * FROM COURSEWORK";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(rs.getInt("MODULE_CODE") + "\t" + rs.getString("MODULE_TITLE") + "\t"
                            + rs.getString("MODULE_TUTOR") + "\t" + rs.getString("COURSE_NO") + "\t" + rs.getString("COURSE_TITLE") + rs.getDate("COURSE_ISSUE") + "\t" + rs.getDate("COUSE_DUE") + "\t" + rs.getString("COURSE_TYPE") + "\t" + rs.getDouble("COURSE_MARK") + "\t");
                }

                //insert a new record
                sql = "INSERT INTO COURSEWORK VALUES (123, 'software engineering', 'Yih-Ling', 2, 'Engineering part 1','2016-10-21','2016-10-22','Group',89.23)";
                st.executeUpdate(sql);

                System.out.println("insert a sample record");
                System.out.println("---------------------------------");
                sql = "SELECT * FROM COURSEWORK";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(rs.getInt("MODULE_CODE") + "\t" + rs.getString("MODULE_TITLE") + "\t"
                            + rs.getString("MODULE_TUTOR") + "\t" + rs.getString("COURSE_NO") + "\t" + rs.getString("COURSE_TITLE") + rs.getDate("COURSE_ISSUE") + "\t" + rs.getDate("COUSE_DUE") + "\t" + rs.getString("COURSE_TYPE") + "\t" + rs.getDouble("COURSE_MARK") + "\t");
                }

                //update a record
                sql = "UPDATE COURSEWORK SET MODULE_TITLE='Test' WHERE MODULE_CODE=340";
                st.executeUpdate(sql);

                System.out.println("update the sample record");
                System.out.println("---------------------------------");
                sql = "SELECT * FROM COURSEWORK";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(rs.getInt("MODULE_CODE") + "\t" + rs.getString("MODULE_TITLE") + "\t"
                            + rs.getString("MODULE_TUTOR") + "\t" + rs.getString("COURSE_NO") + "\t" + rs.getString("COURSE_TITLE") + rs.getDate("COURSE_ISSUE") + "\t" + rs.getDate("COUSE_DUE") + "\t" + rs.getString("COURSE_TYPE") + "\t" + rs.getDouble("COURSE_MARK") + "\t");
                }

                //delete a record
                sql = "DELETE FROM COURSEWORK WHERE MODULE_CODE=341";
                st.executeUpdate(sql);

                System.out.println("delete the sample record");
                System.out.println("---------------------------------");
                sql = "SELECT * FROM COURSEWORK";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(rs.getInt("MODULE_CODE") + "\t" + rs.getString("MODULE_TITLE") + "\t"
                            + rs.getString("MODULE_TUTOR") + "\t" + rs.getString("COURSE_NO") + "\t" + rs.getString("COURSE_TITLE") + rs.getDate("COURSE_ISSUE") + "\t" + rs.getDate("COUSE_DUE") + "\t" + rs.getString("COURSE_TYPE") + "\t" + rs.getDouble("COURSE_MARK") + "\t");
                }

                rs.close();
                st.close();
                conn.close();
                System.out.println("Connection is closed.");
            } else {
                System.out.println("null");
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
