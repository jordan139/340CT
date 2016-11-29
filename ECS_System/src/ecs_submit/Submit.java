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
    String CourseTitle;
    String ModuleTitle;
    String AttemptNumber;
    String SubmissionStatus;
    String GradingStatus;
    String DueDate;
    String TimeRemaining;
    String LastModified;
    String Comments;
    String SubmissionType;
    String SubmissionTitle;
    String SubmissionFile;
    String SubmissionText;
    int ReferenceNumber;
    String AssignmentTitle;
    String SubmissionAuthor;
    String SubmittedDate;
    
    
     

    public Submit(String CourseTitle, String ModuleTitle, String AttemptNumber, String SubmissionStatus,String DueDate,
           String TimeRemaining, String LastModified, String Comments,String SubmissionType, String SubmissionTitle,
           String SubmissionFile, String SubmissionText, int ReferenceNumber, String AssignmentTitle, String SubmissionAuthor,
           String SubmittedDate) {
        this.CourseTitle = CourseTitle;
        this.ModuleTitle = ModuleTitle;
        this.AttemptNumber = AttemptNumber;
        this.SubmissionStatus = SubmissionStatus; 
        this.DueDate = DueDate;
        this.TimeRemaining = TimeRemaining;
        this.LastModified = LastModified;
        this.Comments = Comments; 
        this.SubmissionType = SubmissionType; 
        this.SubmissionTitle = SubmissionTitle;
        this.SubmissionFile = SubmissionFile;
        this.SubmissionText = SubmissionText;
        this.ReferenceNumber = ReferenceNumber;
        this.AssignmentTitle = AssignmentTitle; 
        this.SubmissionAuthor = SubmissionAuthor;
        this.SubmittedDate = SubmittedDate;
    }
    
    
    public String getCourseTitle() {
        return CourseTitle;
    }

    public void setCourseTitle(String CourseTitle) {
        this.CourseTitle = CourseTitle;
    }
    
    public String getModuleTitle() {
        return ModuleTitle;
    }

    public void setModuleTitle(String ModuleTitle) {
        this.ModuleTitle = ModuleTitle;
    }

    public String getAttemptNumber() {
        return AttemptNumber;
    }

    public void setAttemptNumber(String AttemptNumber) {
        this.AttemptNumber = AttemptNumber;
    }
    
    public String getSubmissionStatus() {
        return SubmissionStatus;
    }

    public void setSubmissionStatus(String SubmissionStatus) {
        this.SubmissionStatus = SubmissionStatus;
    }
    
     public String getDueDate() {
        return DueDate;
    }

    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }

    public String getTimeRemaining() {
        return TimeRemaining;
    }

    public void setTimeRemaining(String TimeRemaining) {
        this.TimeRemaining = TimeRemaining;
    }

    public String getLastModified() {
        return LastModified;
    }

    public void setLastModified(String LastModified) {
        this.LastModified = LastModified;
    }

    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    public String getComments() {
        return Comments;
    }
    
    public String getSubmissionType() {
        return SubmissionType;
    }

    public void setSubmissionType(String SubmissionType) {
        this.SubmissionType = SubmissionType;
    }

    public String getSubmissionTitle() {
        return SubmissionTitle;
    }

    public void setSubmissionTitle(String SubmissionTitle) {
        this.SubmissionTitle = SubmissionTitle;
    }
    
    public String getSubmissionFile() {
        return SubmissionFile;
    }

    public void setSubmissionFile(String SubmissionFile) {
        this.SubmissionFile = SubmissionFile;
    }

    public String getSubmissionText() {
        return SubmissionText;
    }

    public void setSubmissionText(String SubmissionText) {
        this.SubmissionText = SubmissionText;
    }
    
    public int getReferenceNumber() {
        return ReferenceNumber;
    }

    public void setReferenceNumber(int ReferenceNumber) {
        this.ReferenceNumber = ReferenceNumber;
    }

    public String getAssignmentTitle() {
        return AssignmentTitle;
    }

    public void setAssignmentTitle(String AssignmentTitle) {
        this.AssignmentTitle = AssignmentTitle;
    }
    
    public String getSubmissionAuthor() {
        return SubmissionAuthor;
    }

    public void setSubmissionAuthor(String SubmissionAuthor) {
        this.SubmissionAuthor = SubmissionAuthor;
    }

    public String getSubmittedDate() {
        return SubmittedDate;
    }

    public void setSubmittedDate(String SubmittedDate) {
        this.SubmittedDate = SubmittedDate;
    }
}
