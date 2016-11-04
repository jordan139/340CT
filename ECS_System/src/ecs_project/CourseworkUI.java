package ecs_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CourseworkUI {

    // Runs the menu interface
    String demoOptions[] = {"Add an individual coursework", "Add a group coursework", "Delete an individual coursework", "Delete a group coursework", "View an individual coursework details", "View a group coursework details", "Exit the System"};
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
                    try {
                        keyboard = new BufferedReader(new InputStreamReader(System.in));

                        //receving all the required inputs
                        System.out.println("Please enter module code(integer):");
                        String temp = keyboard.readLine();
                        int modulecode = Integer.parseInt(temp);

                        System.out.println("Please enter module title:");
                        String moduletitle = keyboard.readLine();

                        System.out.println("Please enter module tutor:");
                        String moduletutor = keyboard.readLine();

                        System.out.println("Please enter course number(integer):");
                        String temp1 = keyboard.readLine();
                        int courseno = Integer.parseInt(temp1);

                        System.out.println("Please enter course title:");
                        String coursetitle = keyboard.readLine();

                        System.out.println("Please enter course issue:");
                        String courseissue = keyboard.readLine();

                        System.out.println("Please enter course due:");
                        String coursedue = keyboard.readLine();

                        System.out.println("Please enter course mark(Double):");
                        String temp2 = keyboard.readLine();
                        Double coursemark = Double.parseDouble(temp2);

                        control.addIndividual(modulecode, moduletitle, moduletutor, courseno, coursetitle, courseissue, coursedue, coursemark);
                        reportResult("success");
                    } catch (NumberFormatException ex) {
                        System.out.println("Wrong data type input detected please try again.");
                    } catch (java.io.IOException exception) {
                        System.out.println("Empty or wrong data type input detected please try again.");
                    }
                    //-------------------------------------------                
                    break;

                //to add a group
                case 'B':
                    try {
                        keyboard = new BufferedReader(new InputStreamReader(System.in));

                        //receving all the required inputs
                        System.out.println("Please enter module code(integer):");
                        String temp = keyboard.readLine();
                        int modulecode = Integer.parseInt(temp);

                        System.out.println("Please enter module title:");
                        String moduletitle = keyboard.readLine();

                        System.out.println("Please enter module tutor:");
                        String moduletutor = keyboard.readLine();

                        System.out.println("Please enter course number(integer):");
                        String temp1 = keyboard.readLine();
                        int courseno = Integer.parseInt(temp1);

                        System.out.println("Please enter course title:");
                        String coursetitle = keyboard.readLine();

                        System.out.println("Please enter course issue:");
                        String courseissue = keyboard.readLine();

                        System.out.println("Please enter course due:");
                        String coursedue = keyboard.readLine();

                        System.out.println("Please enter course mark(Double):");
                        String temp2 = keyboard.readLine();
                        Double coursemark = Double.parseDouble(temp2);

                        control.addGroup(modulecode, moduletitle, moduletutor, courseno, coursetitle, courseissue, coursedue, coursemark);
                        reportResult("success");
                    } catch (NumberFormatException ex) {
                        System.out.println("Wrong data type input detected please try again.");
                    } catch (java.io.IOException exception) {
                    }
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
                    } catch (NumberFormatException ex) {
                        System.out.println("Wrong data type input detected please try again.");
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
                    } catch (NumberFormatException ex) {
                        System.out.println("Wrong data type input detected please try again.");
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
                    } catch (NumberFormatException ex) {
                        System.out.println("Wrong data type input detected please try again.");
                    } catch (java.io.IOException exception) {
                    }
                    //-------------------------------------------                
                    break;

                //to view a group detail
                case 'F':
                    try {
                        System.out.println("Enter a module code:");
                        keyboard = new BufferedReader(new InputStreamReader(System.in));
                        String fromKeyboard = keyboard.readLine();
                        ref = Integer.parseInt(fromKeyboard);
                        control.viewGroup(ref);
                        reportResult("success");
                    } catch (NumberFormatException ex) {
                        System.out.println("Wrong data type input detected please try again.");
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
        }//end while
    }//end 

    // This function simply prints out the result
    public void reportResult(String result) {
        System.out.println("Result:" + result);;
    }
}
