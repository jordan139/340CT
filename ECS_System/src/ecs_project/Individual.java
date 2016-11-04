package ecs_project;

public class Individual extends Coursework {

    int coursenumber;
    String coursetitle;
    private String moduletitle;
    String moduletutor;
    double coursemark;
    String coursetype;

    Individual(int modulecode, String moduletitle, String moduletutor, int courseno, String coursetitle, String courseissue, String coursedue, double coursemark) {
        super(moduletitle, modulecode, courseissue, coursedue);
        this.coursenumber = courseno;
        this.coursetitle = coursetitle;
        this.moduletutor = moduletutor;
        this.coursetype = "Individual";
        this.coursemark = coursemark;
    }

    Individual() {

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
    public String getCoursetitle() {
        return coursetitle;
    }

    @Override
    public void setCoursetitle(String coursetitle) {
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
    public void setCourseType(String coursetype) {
        this.coursetype = coursetype;
    }

    @Override
    public String toString() {
        return modulecode + "," + moduletitle + "," + moduletutor + "," + coursenumber + "," + coursetitle + "," + courseissue + "," + coursedue + "," + coursetype + "," + coursemark + "\n";
    }
}
