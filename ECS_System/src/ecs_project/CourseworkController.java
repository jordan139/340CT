package ecs_project;

import java.util.ArrayList;
import Utilities.FileUtils;

public class CourseworkController {

    CourseworkRepoImpl c = new CourseworkRepoImpl();

    public ArrayList getCourseworkList() {
        return c.getAll();
    }

    public void submitIndividualCoursework(Individual i) {
        c.addIndividualCoursework(i);
    }

    public void submitGroupCoursework(Group g) {
        c.addGroupCoursework(g);
    }

    public void updateIndividualCoursework(Individual i) {
        c.updateIndividualCoursework(i);
    }

    public void updateGroupCoursework(Group g) {
        c.updateGroupCoursework(g);
    }

    public void deleteCoursework(int modulecode) {
        c.removeCoursework(modulecode);
    }

    public String generateCourseworkDetails(String coursetitle) {
        return c.generateCoursework(coursetitle);
    }
    
    public ArrayList getCourseworkTitles() {
        return c.getCourseworkTitles();
    }
    
    public void downloadCoversheet(String TextArea) {
        ArrayList<String> res = new ArrayList();
        res.add(TextArea);
        FileUtils.writeListToFile(res, "coversheet.csv");
    }
}
