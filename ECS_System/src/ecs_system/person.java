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
public abstract class person {
    
    String username;
    String password;
    String type;
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword(){
        return password; 
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getType(){
        return type; 
    }
    
    public void setType(String type){
        this.type = type;
    }
}