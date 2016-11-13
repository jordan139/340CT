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
public class staffList {

    //a list which stored individual objects 
    private staff[] staffList;
    private int count = 0;

    //create the list which stores 100 staff objects
    public staffList() {

        staffList = new staff[100];
        for (int i = 0; i < staffList.length; i++) {
            staffList[i] = new staff();
        }

    }

    //return list with all objects stored within the list 
    public staff[] getList() {
        return staffList;
    }

    // add a new staff object to the list  
    public void add() {
        student newStudent = new student();
        newStudent.setID(count);
        staffList[count] = new staff();
        count++;
    }

    //view a staff object using its ref and all details related to it 
    public void view(int ref) {
        if ((find(ref) == true) && (ref != -1)) {
            System.out.println("Student ID: " + staffList[ref].getID());
            System.out.println("Student Username: " + staffList[ref].getStaffUsername());
            System.out.println("Student Password: " + staffList[ref].getStaffPassword());

        } else {
            //if ref is not found then print the following error 
            System.out.println("not found ");
        }
    }
    
    //find a staff object within the list using its refference number 
    public boolean find(int ref) {
        boolean found = false;
        int i = 0;
        do {
            //if its found return true 
            if (staffList[i].getID() == ref) {
                found = true;
            }
            i++;
        } while ((i < staffList.length) && (!found));
        return found;
    }

    //delete a staff object from the list 
    public void delete(int reff) {
        staff[] tempList = new staff[100];
        for (int i = 0; i < staffList.length; i++) {
            staffList[i] = new staff();

        }

        int count = 0;
        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i].getID() != reff) {
                tempList[count] = staffList[i];
                count++;
            }
        }
        staffList = tempList;

    }

    //update a staff object using its refference 
    public void update(int reff, String pass) {
        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i].getID() == reff) {
                staffList[i].setStaffPassword(pass);
            }
        }
    }
    
    //view all details related to a staff object 
    public void viewAll() {
        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i].getID() != -1) {
                System.out.print("Staff ID: " + staffList[i].getID() + "\t");
                System.out.print("Staff Username: " + staffList[i].getStaffUsername() + "\t");
                System.out.print("Staff PasswordS: " + staffList[i].getStaffPassword() + "\t");

            }
        }
    }

}
