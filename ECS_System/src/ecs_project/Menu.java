package ecs_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {
    
    private String theTitle = null;
    
    // A set of menu items
    private String[] theOptions;
    private String thePrompt = "Please enter your choice: ";
    
    // Starting menu item
    private char minimumOption;
    
    // Finishing menu item
    private char maximumOption;
    private BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // The constructor method which assigns the given values to 
    // the attributes: theTitle, theOptions and thePrompt  
    public Menu(String title, String[] options, String prompt) {
        if (title.length() > 0) {
            
            //assign the given value in title to attribute, theTitle
            theTitle = title;
        }
        theOptions = options;
        if (prompt.length() > 0) {
            thePrompt = prompt;
        }
    }

    //This method is to display menu options and get valid menu option from the user
    public char offerMenu() {
        char validResponse;
        showMenu();
        validResponse = getValidChoice();
        return validResponse;
    }

    // Displays title of the menu with options
    private void showMenu() {
        char thisOption = 'A';
        setMinimumOption(thisOption);
        showTitle();
        for (int i = 0; i < theOptions.length; i++) {
            showMenuLine(thisOption, i);
            thisOption++;
        }
        setMaximumOption(--thisOption);
    }

    // Displays title of a menu
    protected void showTitle() {
        if (theTitle != null) {
            System.out.println("\t" + theTitle + "\n");
        }
    }

    // Displays options of a menu
    protected void showMenuLine(char menuLabel, int menuText) {
        System.out.println(menuLabel + ".   " + theOptions[menuText]);
    }

    // Sets the minimum option value
    protected void setMinimumOption(char setTo) {
        minimumOption = setTo;
    }

    // Sets the maximum option value
    protected void setMaximumOption(char setTo) {
        maximumOption = setTo;
    }

    // Receives the choice of option then checks if it is valid or not
    protected char getValidChoice() {
        String fromKeyboard = null;
        char response = ' ';
        boolean invalidResponse = true;
        System.out.println(thePrompt + " ");
        
        // To flush output stream to write data out to socket    
        System.out.flush();    
        while (invalidResponse) {
            try {
                fromKeyboard = keyboard.readLine();
                if (fromKeyboard.length() > 0) {
                    response = fromKeyboard.charAt(0);
                } else {
                    response = ' ';
                }
            } catch (java.io.IOException exception) {
            }

            response = Character.toUpperCase(response);
            invalidResponse = ((response < minimumOption)
                    || (response > maximumOption));
            if (invalidResponse) {
                System.out.println("Please enter a response between "
                        + minimumOption + " and " + maximumOption + ".");
                System.out.println(thePrompt + " ");
                System.out.flush();
            }
        }
        return response;
    }
}
