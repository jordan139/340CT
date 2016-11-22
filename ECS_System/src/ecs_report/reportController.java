package ecs_report;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class reportController {

    String connectionURL = "jdbc:derby://localhost:1527/Coursework_db1";
    String uName = "henry";
    String uPass = "123";

    public ArrayList getStudentIDs() {
        ArrayList<String> studentIDs = new ArrayList<>();
        String temp;

        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);

            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = "SELECT STUDENT_ID FROM SUBMISSION";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    temp = rs.getString("STUDENT_ID");
                    studentIDs.add(temp);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return studentIDs;
    }

    public ArrayList getCourseTitles() {
        ArrayList<String> coursetitles = new ArrayList<>();
        String temp;

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

    public String generateReport(String ID, String title) {
        String report = "";
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;
                String sql = "SELECT * FROM SUBMISSION WHERE STUDENT_ID = " + ID;
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    report = "Student ID: " + rs.getInt("STUDENT_ID") + "\n" + "First name: " + rs.getString("FIRST_NAME") + "\n"
                            + "Last name: " + rs.getString("LAST_NAME") + "\n" + "Course detail: " + rs.getString("COVERSHEET") + "\n";
                }

                String sql1 = "SELECT * FROM COURSEWORK WHERE COURSE_TITLE = " + title;
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    report += "Module code: " + rs.getInt("MODULE_CODE") + "\t" + "Module title: " + rs.getString("MODULE_TITLE") + "\t"
                            + "Module tutor: " + rs.getString("MODULE_TUTOR") + "\t" + "Course number: " + rs.getString("COURSE_NO") + "\t"
                            + "Course title: " + rs.getString("COURSE_TITLE") + "\t" + "Course issue: " + rs.getDate("COURSE_ISSUE") + "\t"
                            + "Course due: " + rs.getDate("COURSE_DUE") + "\t" + "Course type: " + rs.getString("COURSE_TYPE") + "\t"
                            + "Course mark: " + rs.getDouble("COURSE_MARK") + "\n";
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return report;
    }
}
