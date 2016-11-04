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
    private int count = 0;

    public studentList() {

        sList = new student[100];
        for (int i = 0; i < sList.length; i++) {
            sList[i] = new student();
        }

    }

    public student[] getList() {
        return sList;
    }

    // new object 
    public void add() {
        student newStudent = new student();
        newStudent.setID(count);
        sList[count] = newStudent;
        count++;
    }

    public void view(int ref) {
        if ((find(ref) == true) && (ref != -1)) {
            System.out.println("Student ID: " + sList[ref].getID());
            System.out.println("Student Username: " + sList[ref].getStudentUsername());
            System.out.println("Student Password: " + sList[ref].getStudentPassword());

        } else {
            System.out.println("not found ");
        }
    }

    public boolean find(int ref) {
        boolean found = false;
        int i = 0;
        do {
            if (sList[i].getID() == ref) {
                found = true;
            }
            i++;
        } while ((i < sList.length) && (!found));
        return found;
    }

    public void delete(int reff) {
        student[] tempList = new student[100];
        for (int i = 0; i < sList.length; i++) {
            sList[i] = new student();

        }

        int counr = 0;
        for (int i = 0; i < sList.length; i++) {
            if (sList[i].getID() != reff) {
                tempList[count] = sList[i];
                count++;
            }
        }
        sList = tempList;
    }

    public void update(int reff, String pass) {
        for (int i = 0; i < sList.length; i++) {
            if (sList[i].getID() == reff) {
                sList[i].setStudentPassword(pass);
            }
        }
    }

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
