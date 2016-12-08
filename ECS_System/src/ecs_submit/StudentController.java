package ecs_submit;

import java.util.ArrayList;
import Utilities.FileUtils;

public class StudentController {
    
    SubmitRepoImpl c = new SubmitRepoImpl();

    public ArrayList getCourseworkList() {
        return c.getCourseworkTitles();
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
