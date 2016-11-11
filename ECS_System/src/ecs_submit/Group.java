package ecs_submit;

public class Group extends Submit {

    String file = "";
    int refnumber = 0;
    String duedate = "";
    String timeremain = "";
    String moduletitle = "";
    String coursetype = "Group";

    Group(String SIDnumber, String firstname, String lastname, String subtitle ,String file, 
            int refnumber, String moduletitle, String duedate, String timeremain){
        super(SIDnumber, firstname, lastname, subtitle);
        this.refnumber = refnumber;
        this.file = file;
        this.duedate = duedate;
        this.timeremain = timeremain;
        this.file = file;
        this.moduletitle = moduletitle;
    }

    @Override
    public String getCourseTitle() {
        return file;
    }

    @Override
    public void setCourseTitle(String file) {
        this.file = file;
    }

    @Override
    public String getModuleTitle() {
        return moduletitle;
    }

    @Override
    public void setModuleTitle(String moduletitle) {
        this.moduletitle = moduletitle;
    }

    @Override
    public String getFile() {
        return file;
    }

    @Override
    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public int getRefNumber() {
        return refnumber;
    }

    @Override
    public void setRefNumber(int refnumber) {
        this.refnumber = refnumber;
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
    public String getDueDate() {
        return duedate;
    }

    @Override
    public void setDueDate(String duedate) {
        this.duedate = duedate;
    }
    
    @Override
    public String getTimeRemain() {
        return timeremain;
    }

    @Override
    public void setTimeRemain(String timeremain) {
        this.timeremain = timeremain;
    }

}
