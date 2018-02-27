/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.GameControl;
import game.EscapeFromInsanityIsland;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainMenuView {

    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                +   "\n--------------------------------------------------"
                +   "\n |||||||||||||||||| MAIN MENU ||||||||||||||||||||"
                +   "\n--------------------------------------------------"
                +   "\nN - Begin the Insanity"
                +   "\nH - Help (because you'll need it)"
                +   "\nL - Load an insane game, because you're... insane"
                +   "\nS - Save your insane game, because you're insane "
                +   "\n    to want to go back"
                +   "\nQ - Quit (Probably a good idea. Give up now.)"
                +   "\n--------------------------------------------------";
        
        
        
    }
    public void displayMainMenuView() {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
      
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1 ) { // value is blank
                System.out.println("\nTry a letter on your keyboard before you press ENTER.");
                continue;
            }
            break; // end the loop
        }
 
        return value; // return the value entered
    }
    

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "N": // Begin the insanity (or a new game)
                this.startNewGame();
                break;
            case "H": // Help (on how to play)
                this.displayHelpMenu();
            case "L": // Load game
                this.startExistingGame();
                break;
            case "S": // Save game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** What game are you playing? Try a different key.");
                break;                
        }
        
        return false;
    }

    private void startNewGame() {
                // create a new game
        GameControl.createNewGame(EscapeFromInsanityIsland.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }    
        
    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
        
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
}
