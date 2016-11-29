package ecs_project;

public class Group extends Coursework {

    int coursenumber = 0;
    String coursetitle = "";
    String moduletutor = "";
    double coursemark = 0.0;
    String coursetype = "Group";

    Group(int modulecode, String moduletitle, String moduletutor, int courseno, String coursetitle, String courseissue, String coursedue, double coursemark, String submitinfo) {
        super(moduletitle, modulecode, courseissue, coursedue, submitinfo);
        this.coursenumber = courseno;
        this.coursetitle = coursetitle;
        this.moduletutor = moduletutor;
        this.coursemark = coursemark;
    }

    Group(int modulecode, String moduletitle, String moduletutor, int courseno, String coursetitle, String courseissue, String coursedue, double coursemark) {
        super(moduletitle, modulecode, courseissue, coursedue);
        this.coursenumber = courseno;
        this.coursetitle = coursetitle;
        this.moduletutor = moduletutor;
        this.coursemark = coursemark;
    }

    @Override
    public String getCreateInfo() {
        return createinfo;
    }

    @Override
    public double getCourseMark() {
        return coursemark;
    }

    @Override
    public void setCourseMark(double coursemark) {
        this.coursemark = coursemark;
    }

    @Override
    public int getCourseNumber() {
        return coursenumber;
    }

    @Override
    public void setCourseNumber(int coursenumber) {
        this.coursenumber = coursenumber;
    }

    @Override
    public String getCourseTitle() {
        return coursetitle;
    }

    @Override
    public void setCourseTitle(String coursetitle) {
        this.coursetitle = coursetitle;
    }

    @Override
    public String getModuleTutor() {
        return moduletutor;
    }

    @Override
    public void setModuleTutor(String moduletutor) {
        this.moduletutor = moduletutor;
    }

    @Override
    public String getCourseType() {
        return coursetype;
    }

    @Override
    public void setCourseType(String type) {
        this.coursetype = type;
    }

    @Override
    public String toString() {
        System.out.println("\n" + modulecode + "," + moduletitle + "," + moduletutor + "," + coursenumber + "," + coursetitle + "," + courseissue + "," + coursedue + "," + coursetype + "," + coursemark + "\n");
        return null;
    }
}
