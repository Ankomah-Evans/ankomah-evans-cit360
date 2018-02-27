/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author StarrfoxxW8
 */
public class CombatControl {

        public int attackMob (int weapon, int damage, int defense, int health) {
        if (weapon < 5 || weapon > 20) { // weapon strength added to damage
            return -1;
        }
        if (damage < 0 || damage > 36) { // amount of damage
            return -1;
        }
        if (defense < 0 || defense > 20) { // amount of defense to subtract from damage and strength
            return -1;
        }
        if (health < 0 || health > 100) { // amount of health of a mob
            return -1;
        }
        
        int newHealth = health - ((damage + weapon) - defense);
        return newHealth;
    }   
	
        public int selfHeal (int bandage, int health, int healAmt) {
        if (bandage < 1 || bandage > 20) { // amount of bandages (stack of 20 is the max)
            return -1;
        }
        if (health < 1 || health > 85) { // the current health of the player
            return -1;
        }
        if (healAmt < 1 || healAmt > 15) { // amount of healing of the player
            return -1;
        }
        
        int healedHealth = health + healAmt;
        return healedHealth;
    }  
    
}
