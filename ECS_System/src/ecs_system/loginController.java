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
public class loginController {
    
    
     // Two lists are initialised, one that stores 'Individual' class objects.
    // and the other that stores 'Group' class objects.
    private final studentList sList = new studentList();
    private final staffList staffList = new staffList();

    // Adds a new Individual object.
    public void addStaff() {
        staffList.add();
    }

    // Adds a new Group object.
    public void addStudent() {
        sList.add();
        
    }

    // Displays details of a 'Individual' object.
    public void viewStaff(int ref) {
        staffList.view(ref);
    }

    // Displays details of a 'Group' object.
    public void viewStudent(int ref) {
        sList.view(ref);
    }

    // Removes a 'Individual' object from the list.
    public void deleteStaff(int ref) {
        staffList.delete(ref);
    }

    // Removes a 'Group' object from the list.
    public void deleteStudent(int ref) {
        sList.delete(ref);
    }

    // Displays details of all the 'Individual' objects within the list.
    public void viewAllStaff() {
        staffList.viewAll();
    }

    // Displays details of all the 'Group' objects within the list.
    public void viewAllStudent() {
        sList.viewAll();
    }
    
    public void updateStaff(int reff, String pass){
        staffList.update(reff, pass);
    }
    public void updateStudent(int reff, String pass){
        sList.update(reff, pass);
}
}
