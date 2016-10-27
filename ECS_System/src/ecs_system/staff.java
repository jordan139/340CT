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
public abstract class staff {
    
    String staffUsername;
    String staffPassword;
    
    
    public String getStaffUsername(){
        return staffUsername;
    }
    
    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername;
    }
    
    public String getStaffPassword(){
        return staffPassword; 
    }
    
    public void setStaffPassword(String staffPassword){
        this.staffPassword = staffPassword;
    }
    
}