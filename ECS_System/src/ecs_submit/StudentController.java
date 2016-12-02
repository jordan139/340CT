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
    
    SubmitRepoImpl c = new SubmitRepoImpl();

    public ArrayList getCourseworkList() {
        return c.getAll();
    }

    public void submitCoursework(Submit cw) {
     //   c.submitCourseworkCoursework(cw);
    }
    
    public void digitalReceipt(Submit dr) {
        c.digitalReceipt(dr);
    }

    public void downloadCoversheet(String TextArea) {
        ArrayList<String> res = new ArrayList();
        res.add(TextArea);
        FileUtils.writeListToFile(res, "Coursework.doc");
    }
}
