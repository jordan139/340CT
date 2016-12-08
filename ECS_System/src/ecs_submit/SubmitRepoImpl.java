/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs_submit;

import Utilities.FileUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeamathu
 */
public class SubmitRepoImpl {

    String connectionURL = "jdbc:derby://localhost:1527/COURSEWORK";
    String uName = "jey";
    String uPass = "123";

    public ArrayList getCourseworkTitles() {
        ArrayList<String> coursetitles = new ArrayList<>();
        String temp;
        //ConnectionURL, username and password should be specified in getConnection()       
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);

            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = "SELECT COURSE_TITLE FROM COURSEWORK";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    temp = rs.getString("COURSE_TITLE");
                    coursetitles.add(temp);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return coursetitles;
    }

    public String updateAttempt(String coursetitle) {
        String temp = "";
        
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);

            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = " SELECT ATTEMPT_NUMBER FROM COURSEWORK WHERE COURSE_TITLE = '" + coursetitle + "'";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    temp = rs.getString("ATTEMPT_NUMBER");
                    
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return temp;
    }
    public String updateSStatus(String coursetitle) {
        String temp1 = "";
        
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);

            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = " SELECT SUB_STATUS, GRADE_STATUS, COURSE_DUE, TIME_REMAIN, COURSE_CREATION FROM COURSEWORK WHERE COURSE_TITLE = '" + coursetitle + "'";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    temp1 = rs.getString("SUB_STATUS");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return temp1;
    }
    public String updateGStatus(String coursetitle) {
        String temp2 = "";
        
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);

            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = " SELECT  GRADE_STATUS FROM COURSEWORK WHERE COURSE_TITLE = '" + coursetitle + "'";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    temp2 = rs.getString("GRADE_STATUS");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return temp2;
    }
    public String updateDue(String coursetitle) {
        String temp3 = "";
        
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);

            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = " SELECT  COURSE_DUE FROM COURSEWORK WHERE COURSE_TITLE = '" + coursetitle + "'";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    temp3 = rs.getString("COURSE_DUE");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return temp3;
    }
    public String updateRemain(String coursetitle) {
        String temp4 = "";
        
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);

            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = " SELECT TIME_REMAIN FROM COURSEWORK WHERE COURSE_TITLE = '" + coursetitle + "'";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    temp4 = rs.getString("TIME_REMAIN");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return temp4;
    }
    public String updateCreate(String coursetitle) {
        String temp5 = "";
        
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);

            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = " SELECT  COURSE_CREATION FROM COURSEWORK WHERE COURSE_TITLE = '" + coursetitle + "'";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    temp5 = rs.getString("COURSE_CREATION");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return temp5;
    }

    public String ChooseFile() {
        String temp = "";
        String[] res = FileUtils.readIntoArray("submission.csv");
        for (int i = 0; i < res.length; i++) {
            temp += res[i] + "\n";
        }
        return temp;
    }

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

    public int submitCourseworkCoursework(String filetyp, String subtitle, String content, boolean status) {
        boolean submitted = true;
        int reference = 0;
        if (status) {
            try {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                String submitinfo = dtf.format(now);
                Random rnd = new Random();
                reference = 100000 + rnd.nextInt(900000);

                Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
                String sql = "INSERT INTO SUBMIT VALUES ('" + subtitle + "', '" + filetyp + "', '" + content + "', " + reference + ", '" + submitinfo + "')";
                Statement st = conn.createStatement();
                ResultSet rs = null;
                st.executeUpdate(sql);
                Submited4 a = new Submited4(content, reference);
                SubmitFile3 b = new SubmitFile3();
                b.setVisible(false);
                a.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Data format is not matching!", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            Submited6 a = new Submited6();
            SubmitFile3 b = new SubmitFile3();
            a.setVisible(true);
            b.setVisible(false);
        }
        return reference;
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
