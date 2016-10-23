package ecs_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CourseworkUI {
        // Runs the menu interface
    String demoOptions[] = {"Add an individual coursework", "Add a group coursework", "Delete an individual coursework", "Delete a group coursework", "View an individual coursework details", "View a group coursework details", "View all individual coursework details", "View all group coursework details", "Exit the System"};
    char demoChoice;
    Menu demoMenu = new Menu("Menu ", demoOptions, "Enter the menu option: ");
    
    // ManagerController object is being initialized
    CourseworkController control = new CourseworkController();

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
                    control.addIndividual();
                    reportResult("success");
                    //-------------------------------------------                
                    break;

                //to add a group
                case 'B':
                    control.addGroup();
                    reportResult("success");
                    //-------------------------------------------
                    break;
                
                //to delete an individual
                case 'C':
                    try {
                        System.out.println("Enter an module code:");
                        keyboard = new BufferedReader(new InputStreamReader(System.in));
                        String fromKeyboard = keyboard.readLine();
                        ref = Integer.parseInt(fromKeyboard);
                        control.deleteIndividual(ref);
                    } catch (java.io.IOException exception) {
                    }
                    //-------------------------------------------
                    break;

                //to delete a group
                case 'D':
                    try {
                        System.out.println("Enter a module code:");
                        keyboard = new BufferedReader(new InputStreamReader(System.in));
                        String fromKeyboard = keyboard.readLine();
                        ref = Integer.parseInt(fromKeyboard);
                        control.deleteGroup(ref);
                        reportResult("success");
                    } catch (java.io.IOException exception) {
                    }
                    //-------------------------------------------                
                    break;

                //to view an individual detail
                case 'E':
                    try {
                        System.out.println("Enter a module code:");
                        keyboard = new BufferedReader(new InputStreamReader(System.in));
                        String fromKeyboard = keyboard.readLine();
                        ref = Integer.parseInt(fromKeyboard);
                        control.viewIndividual(ref);
                        reportResult("success");
                    } catch (java.io.IOException exception) {
                    }
                    //-------------------------------------------                
                    break;

                 //to view a group detail
                case 'F':
                    try {
                        System.out.println("Enter an ID:");
                        keyboard = new BufferedReader(new InputStreamReader(System.in));
                        String fromKeyboard = keyboard.readLine();
                        ref = Integer.parseInt(fromKeyboard);
                        control.viewGroup(ref);
                        reportResult("success");
                    } catch (java.io.IOException exception) {
                    }
                    //-------------------------------------------                
                    break;

                //to view all individual details
                case 'G':
                    control.viewAllIndividuals();
                    //-------------------------------------------                
                    break;

                //to view all group details
                case 'H':
                    control.viewAllGroups();
                    //-------------------------------------------                
                    break;

                //to exist the system
                case 'I':
                    System.out.println("You have exited the system.");
                    exit = false;
                    System.exit(1);
                    break;
            }
        }//end while
    }//end 

    // This function simply prints out the result
    public void reportResult(String result) {
        System.out.println("Result:" + result);;
    }
}
