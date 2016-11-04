/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs_system;

import ecs_system.loginController;
import ecs_system.menu;
import ecs_system.loginController;
import ecs_system.menu;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author dayj13
 */
public class loginUI {
    String demoOptions[] = {"Add Staff", "Add Student", "Delete Staff", "Delete Student", "View Staff Details", "View Student Details", "Exit the System"};
    char demoChoice;
    menu demoMenu = new menu("Menu ", demoOptions, "Enter the menu option: ");
    loginController control = new loginController();

    
    public void displayMenu() {
        boolean exit = true;
        while (exit) {
            System.out.println("----------------------------------------------");
            demoChoice = demoMenu.offerMenu();
            int ref = 0;

            // Stores the user's input in a String format
            BufferedReader keyboard;
            
            // Checks the user's input
            switch (demoChoice) {
                //to add an individual
                case 'A':
                    control.addStaff();
                    reportResult("success");
                    //-------------------------------------------                
                    break;

                //to add a group
                case 'B':
                    control.addStudent();
                    reportResult("success");
                    //-------------------------------------------
                    break;
                
                //to delete an individual
                case 'C':
                    try {
                        System.out.println("Enter an ID for a staff member to delete: ");
                        keyboard = new BufferedReader(new InputStreamReader(System.in));
                        String fromKeyboard = keyboard.readLine();
                        ref = Integer.parseInt(fromKeyboard);
                        control.deleteStaff(ref);
                    } catch (java.io.IOException exception) {
                    }
                    //-------------------------------------------
                    break;

                //to delete a group
                case 'D':
                    try {
                        System.out.println("Enter an ID for a student to delete: ");
                        keyboard = new BufferedReader(new InputStreamReader(System.in));
                        String fromKeyboard = keyboard.readLine();
                        ref = Integer.parseInt(fromKeyboard);
                        control.deleteStudent(ref);
                        reportResult("success");
                    } catch (java.io.IOException exception) {
                    }
                    //-------------------------------------------                
                    break;

                //to view an individual detail
                case 'E':
                    try {
                        System.out.println("Enter an ID for a staff to view: ");
                        keyboard = new BufferedReader(new InputStreamReader(System.in));
                        String fromKeyboard = keyboard.readLine();
                        ref = Integer.parseInt(fromKeyboard);
                        control.viewStaff(ref);
                        reportResult("success");
                    } catch (java.io.IOException exception) {
                    }
                    //-------------------------------------------                
                    break;

                 //to view a group detail
                case 'F':
                    try {
                        System.out.println("Enter an ID for a student to view: ");
                        keyboard = new BufferedReader(new InputStreamReader(System.in));
                        String fromKeyboard = keyboard.readLine();
                        ref = Integer.parseInt(fromKeyboard);
                        control.viewStudent(ref);
                        reportResult("success");
                    } catch (java.io.IOException exception) {
                    }
                    //-------------------------------------------                
                    break;

                //to exist the system
                case 'G':
                    System.out.println("You have exited the system.");
                    exit = false;
                    System.exit(1);
                    break;
            }
        }
        
      
    }  public void reportResult(String result) {
        System.out.println("Result:" + result);
        
   }
}
    
    
    
