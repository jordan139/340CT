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
public class studentList {

    //a list which stored individual objects 
    private student[] sList;
    //create an increment 
    private int count = 0;

    
    public studentList() {
        
        //initiate new list 
        sList = new student[100];
        for (int i = 0; i < sList.length; i++) {
            //add 100 new objects into the list 
            sList[i] = new student();
        }

    }

    //display the list with all current objects 
    public student[] getList() {
        return sList;
    }

    // add a new student object to the list 
    public void add() {
        //new student object created
        student newStudent = new student();
        newStudent.setID(count);
        sList[count] = newStudent;
        count++;
    }

    //view all details refering to the student object for each object within the list 
    public void view(int ref) {
        //find ref
        if ((find(ref) == true) && (ref != -1)) {
            //print student details if ref has been found 
            System.out.println("Student ID: " + sList[ref].getID());
            System.out.println("Student Username: " + sList[ref].getStudentUsername());
            System.out.println("Student Password: " + sList[ref].getStudentPassword());

        } else {
            //if no ref has been found print not found to show object with that ref is not in the list 
            System.out.println("not found ");
        }
    }

    //find a student within the list
    public boolean find(int ref) {
        boolean found = false;
        //increment
        int i = 0;
        do {
            if (sList[i].getID() == ref) {
                found = true;
            }
            i++;
        } while ((i < sList.length) && (!found));
        return found;
    }
    
    //delete a student from the list
    public void delete(int reff) {
        student[] tempList = new student[100];
        for (int i = 0; i < sList.length; i++) {
            sList[i] = new student();

        }

        int count = 0;
        for (int i = 0; i < sList.length; i++) {
            if (sList[i].getID() != reff) {
                tempList[count] = sList[i];
                count++;
            }
        }
        sList = tempList;
    }
    
    //update details related to a specific student object 
    public void update(int reff, String pass) {
        for (int i = 0; i < sList.length; i++) {
            if (sList[i].getID() == reff) {
                sList[i].setStudentPassword(pass);
            }
        }
    }
    
    //view all objects and their details within the list
    public void viewAll() {
        for (int i = 0; i < sList.length; i++) {
            if (sList[i].getID() != -1) {
                System.out.print("Module Code: " + sList[i].getID() + "\t");
                System.out.print("Module Title: " + sList[i].getStudentUsername() + "\t");
                System.out.print("Module Tutor: " + sList[i].getStudentPassword() + "\t");

            }
        }
    }
}
