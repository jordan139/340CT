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
public class Submit {
    String SIDnumber;
    String firstname;
    String lastname;
    String subtitle;
    
     

    public Submit(String SIDnumber, String firstname, String lastname, String subtitle) {
        this.firstname = firstname;
        this.SIDnumber = SIDnumber;
        this.lastname = lastname;
        this.subtitle = subtitle;        
    }
    
    public String getSIDNumber() {
        return SIDnumber;
    }

    public void setSIDNumber(String SIDnumber) {
        this.SIDnumber = SIDnumber;
    }
    
    public String getgetFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setgetLastName(String issue) {
        this.lastname = issue;
    }
    
    public String getSubTitle() {
        return subtitle;
    }

    public void setSubTitle(String subtitle) {
        this.subtitle = subtitle;
    }
    
    public int getRefNumber() {
        return 0;
    }

    public void setRefNumber(int refnumber) {

    }
    
    public String getDueDate() {
        return null;
    }

    public void setDueDate(String duedate) {
       
    }
    
    public String getTimeRemain() {
        return null;
    }

    public void setTimeRemain(String timeremain) {
        
    }
    
    public String getCourseTitle() {
        return null;
    }

    public void setCourseTitle(String cousetitle) {
        
    }
    
    public String getModuleTitle() {
        return null;
    }

    public void setModuleTitle(String moduletitle) {
       
    }
    
    public String getCourseType() {
        return null;
    }

    public void setCourseType(String coursetype) {
    }
    
    
    public String getFile() {
        return null;
    }

    public void setFile(String file) {
    
    }
}
