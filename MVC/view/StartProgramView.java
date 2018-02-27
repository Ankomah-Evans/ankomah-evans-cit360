/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.GameControl;
import model.Player;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class StartProgramView {
    
    private String promptMessage;
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name:";
        // display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n*******************************************************"
            +   "\n*                                                     *"
            +   "\n*      Welcome to Insanity Island! We're sorry.       *"
            +   "\n*                                                     *"
            +   "\n*  You are stranded on this island with no memory     *"
            +   "\n*  on how you got here or any tools to help escape    *"
            +   "\n*  or even survive on this island.                    *"
            +   "\n*                                                     *"
            +   "\n*  Don't get comfortable, because this island isn't   *"
            +   "\n*  safe. You won't find any type of boat or raft to   *"
            +   "\n*  escape. It's up to you to craft tools, weapons,    *"
            +   "\n*  and something to help you escape this nightmare.   *"
            +   "\n*                                                     *"
            +   "\n*  You will want to start exploring the island and    *"                
            +   "\n*  finding resources to start crafting. We're not     *"
            +   "\n*  going to tell you how, either. That wouldn't be    *"
            +   "\n*  fun. We do suggest, however, that you start        *"
            +   "\n*  looking for wood. It's a pretty good idea, but     *"
            +   "\n*  you can do what you want, of course. Oh yeah,      *"
            +   "\n*  did we mention that there are mutated beasts on    *"
            +   "\n*  this island? Sorry about that. By the way,         *"
            +   "\n*  there are mutated beasts on this island. You       *"
            +   "\n*  might want to be careful -- oh and find some       *"
            +   "\n*  wood. Just sayin'.                                 *"
            +   "\n*                                                     *"
            +   "\n*  Good luck! You'll need it, ha ha...cough.. errm.   *"  
            +   "\n*                                                     *"                        
            +   "\n*******************************************************"
            
        );               
    }
    /**
     * display the start program view
     */
    public void displayStartProgramView() {
        boolean done = false; //set flag to not done
        do {
           // prompt for and get playersName
           String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quiet
                return; // exist the game
            //do requested action and display next view
            done = this.doAction(playersName);
        } while (!done);
        
    }   

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
               System.out.println("\nInvalid value: value can not be blank");
               continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered   
    }
    
    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
            // display next view
            this.displayNextView(player);
            
            return true; // success !
    }

    private void displayNextView(Player player) {
        
        // display a custom welcome message
        System.out.println("\n================================================="
                         + "\n Welcome to Insanity Island, " + player.getName()
                         + "\n At least you remember your name."
                         + "\n"
                         + "\n I suggest you get moving before a rabid beast"
                         + "\n rips you to shreads."
                         + "\n================================================="      
                         );
        // Create MainMenuView object  
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
}

