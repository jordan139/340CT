package ecs_submit;

import java.time.LocalDateTime;

public abstract class Coursework {

    String moduletitle;
    int modulecode;
    String courseissue;
    String coursedue;
    String createinfo;

    public Coursework(String moduletitle, int modulecode, String courseissue, String coursedue, String createinfo) {
        this.modulecode = modulecode;
        this.moduletitle = moduletitle;
        this.courseissue = courseissue;
        this.coursedue = coursedue;
        this.createinfo = createinfo;
    }

    public Coursework(String moduletitle, int modulecode, String courseissue, String coursedue) {
        this.modulecode = modulecode;
        this.moduletitle = moduletitle;
        this.courseissue = courseissue;
        this.coursedue = coursedue;
    }

    public String getModuleTitle() {
        return moduletitle;
    }

    public void setModuleTitle(String moduletitle) {
        this.moduletitle = moduletitle;
    }

    public String getCourseIssue() {
        return courseissue;
    }

    public void setCourseIssue(String issue) {
        this.courseissue = issue;
    }

    public int getModuleCode() {
        return modulecode;
    }

    public void setModuleCode(int modulecode) {
        this.modulecode = modulecode;
    }

    public void setCourseDue(String coursedue) {
        this.coursedue = coursedue;
    }

    public String getCourseDue() {
        return coursedue;
    }

    public String getCreateInfo() {
        return null;
    }

    public double getCourseMark() {
        return 0;
    }

    public void setCourseMark(double coursemark) {
    }

    public int getCourseNumber() {
        return 0;
    }

    public void setCourseNumber(int coursenumber) {
    }

    public String getCoursetitle() {
        return null;
    }

    public void setCoursetitle(String coursetitle) {
    }

    public String getModuleTutor() {
        return null;
    }

    public void setModuleTutor(String moduletutor) {
    }

    public String getCourseType() {
        return null;
    }

    public void setCourseType(String coursetype) {
    }
}
