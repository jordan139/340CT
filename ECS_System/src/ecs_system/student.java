/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs_system;

/**
 *
 * @author dayj13
 */
public abstract class student {
    
    String studentUsername;
    String studentPassword;
    
    
    public String getStudentUsername(){
        return studentUsername;
    }
    
    public void setStudentUsername(String studentUsername) {
        this.studentUsername = studentUsername;
    }
    
    public String getStudentPassword(){
        return studentPassword; 
    }
    
    public void setStudentPassword(String studentPassword){
        this.studentPassword = studentPassword;
    }
    
}