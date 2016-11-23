package ecs_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CourseworkController {

    String connectionURL = "jdbc:derby://localhost:1527/Coursework_db";
    String uName = "henry";
    String uPass = "123";

    public ArrayList getAll() {
        ArrayList<String> courseworks = new ArrayList<>();
        String temp;
        //ConnectionURL, username and password should be specified in getConnection()       
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);

            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = "SELECT * FROM COURSEWORK";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    temp = rs.getInt("MODULE_CODE") + "\t" + rs.getString("MODULE_TITLE") + "\t"
                            + rs.getString("MODULE_TUTOR") + "\t" + rs.getString("COURSE_NO") + "\t" 
                            + rs.getString("COURSE_TITLE") + "\t" + rs.getDate("COURSE_ISSUE") + "\t" 
                            + rs.getDate("COURSE_DUE") + "\t" + rs.getString("COURSE_TYPE") + "\t" 
                            + rs.getDouble("COURSE_MARK") +  "\t" + rs.getString("COURSE_CREATION") + "\n";
                    courseworks.add(temp);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return courseworks;
    }

    // Adds a new group coursework object.
    public void addGroupCoursework(Group g) {
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            try {
                String sql = "INSERT INTO COURSEWORK VALUES (" + g.modulecode + ", '" + g.moduletitle + "', '" + g.moduletutor + "', " + g.coursenumber + ", '" + g.coursetitle + "', '" + g.courseissue + "', '" + g.courseissue + "', '" + g.coursetype + "', " + g.coursemark + ", '" + g.createinfo + "')";
                Statement st = conn.createStatement();
                ResultSet rs = null;
                st.executeUpdate(sql);
            } catch (NumberFormatException | IndexOutOfBoundsException exception) {
                System.out.println("Error! Check format type or empty fields.");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    // Adds a new individual coursework object.
    public void addIndividualCoursework(Individual i) {
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            try {
                String sql = "INSERT INTO COURSEWORK VALUES (" + i.modulecode + ", '" + i.moduletitle + "', '" + i.moduletutor + "', " + i.coursenumber + ", '" + i.coursetitle + "', '" + i.courseissue + "', '" + i.courseissue + "', '" + i.coursetype + "', " + i.coursemark + ", '" + i.createinfo + "')";
                Statement st = conn.createStatement();
                ResultSet rs = null;
                st.executeUpdate(sql);
            } catch (NumberFormatException | IndexOutOfBoundsException exception) {
                System.out.println("Error! Check format type or empty fields.");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void updateIndividualCoursework(Individual i) {
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            try {
                String sql = "UPDATE COURSEWORK SET MODULE_TITLE = '" + i.moduletitle + "', MODULE_TUTOR = '" + i.moduletutor + "', COURSE_NO = " + i.coursenumber + ", COURSE_TITLE = '" + i.coursetitle + "', COURSE_ISSUE = '" + i.courseissue + "', COURSE_DUE = '" + i.coursedue + "', COURSE_TYPE = '" + i.coursetype + "', COURSE_MARK = " + i.coursemark + " WHERE MODULE_CODE = " + i.modulecode;
                Statement st = conn.createStatement();
                ResultSet rs = null;
                st.executeUpdate(sql);
            } catch (NumberFormatException | IndexOutOfBoundsException exception) {
                System.out.println("Error! Check format type or empty fields.");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void updateGroupCoursework(Group g) {
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            try {
                String sql = "UPDATE COURSEWORK SET MODULE_TITLE = '" + g.moduletitle + "', MODULE_TUTOR = '" + g.moduletutor + "', COURSE_NO = " + g.coursenumber + ", COURSE_TITLE = '" + g.coursetitle + "', COURSE_ISSUE = '" + g.courseissue + "', COURSE_DUE = '" + g.coursedue + "', COURSE_TYPE = '" + g.coursetype + "', COURSE_MARK = " + g.coursemark + " WHERE MODULE_CODE = " + g.modulecode;
                Statement st = conn.createStatement();
                ResultSet rs = null;
                st.executeUpdate(sql);
            } catch (NumberFormatException | IndexOutOfBoundsException exception) {
                System.out.println("Error! Check format type or empty fields.");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void removeCoursework(int modulecode) {
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            try {
                String sql = "DELETE FROM COURSEWORK WHERE MODULE_CODE = " + modulecode;
                Statement st = conn.createStatement();
                ResultSet rs = null;
                st.executeUpdate(sql);
            } catch (NumberFormatException | IndexOutOfBoundsException exception) {
                System.out.println("Error! Check format type or empty field of Module Code.");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public String generateCoursework(String coursetitle) {
        String coversheet = "";
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = "SELECT * FROM COURSEWORK WHERE COURSE_TITLE = '" + coursetitle + "'";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    coversheet = ("Coversheet has been generated..." + "\n\n" + "Module code: " + rs.getInt("MODULE_CODE") + "\n" + "Module title: " + rs.getString("MODULE_TITLE") + "\n"
                            + "Module tutor: " + rs.getString("MODULE_TUTOR") + "\n" + "Course number: " + rs.getString("COURSE_NO") + "\n" + "Course title: " + rs.getString("COURSE_TITLE") + "\n" + "Course issue: " + rs.getDate("COURSE_ISSUE")
                            + "\n" + "Course due: " + rs.getDate("COURSE_DUE") + "\n" + "Course type: " + rs.getString("COURSE_TYPE") + "\n" + "Course mark: " + rs.getDouble("COURSE_MARK") + "\n") + "Course created: " + rs.getString("COURSE_CREATION");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return coversheet;
    }
    
    public ArrayList getCourseworkTitles () {
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
}
