package battle_system;

import java.util.Scanner;
import java.util.Random;
import enemy.*;
import character.*;
import shopping.Inventory;
	
public class Battle_System {
		Enemy_Quotes enemyQuotes = new Enemy_Quotes();
		Enemy_Giant giant = new Enemy_Giant();
		Enemy_Goblin goblin = new Enemy_Goblin();
		Enemy_Grunt grunt = new Enemy_Grunt();
		Enemy_Halfling halfling = new Enemy_Halfling();
		Enemy_Necromancer necromancer = new Enemy_Necromancer();
		Enemy_Scorpion scorpion = new Enemy_Scorpion();
		Enemy_Shapeshifter shapeshifter = new Enemy_Shapeshifter();
		Enemy_Siren siren = new Enemy_Siren();
		Enemy_Troll troll = new Enemy_Troll();
		
		Character_Class c = new Character_Class();
		Weapons  weapon = new Weapons();
		Magic magic_attacks = new Magic();
		Inventory inventory = new Inventory();
		private String user,enemyName;
		private int magic, enemy_health, magic_options, physical_options, damage, melee, character_health, boost;
		
		/*
		 * We should re-adjust the entire battle system 
		 * 
		 * */
		
		/** Enemy List
		 * -------------
		 * Giant
		 * Goblin
		 * Grunt
		 * Halfing
		 * Necromancer
		 * Scorpion
		 * Shapeshifter
		 * Siren
		 * Troll
		 * -------------
		 * */
		
		public void random_Enemy(){
			String [] eName ={giant.getName(),goblin.getName(),grunt.getName(),halfling.getName(),necromancer.getName(),scorpion.getName(),shapeshifter.getName(),siren.getName(),troll.getName()};		
			int [] selection = {giant.getHealth(),goblin.getHealth(),grunt.getHealth(),halfling.getHealth(),necromancer.getHealth(),scorpion.getHealth(),shapeshifter.getHealth(),siren.getHealth(),troll.getHealth()};
			for(int counter = 0; counter < 1;counter++){
				int rand = (int) (Math.random() * selection.length);
				enemy_health = selection[rand];
				enemyName = eName[rand];
			}
			
		}
		
		
		public void battleSystem(int choice) throws Exception{
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			Random number = new Random();
			int action;
			//char type;
			double r = Math.random();
			//boolean temp;
			
			if(choice == 1){
				Character_Warrior character  = new Character_Warrior();
				character_health = character.getHealth();
				user = character.getName();
			}
			else if(choice == 2){
				Character_Orc character = new Character_Orc();
				character_health = character.getHealth();
				user = character.getName();
			}
				
			
			/*The eName array and the selection array are in a random. 
			 * I assigned each method with health and a name. 
			 * I then assign enemy to which ever enemy method is chosen in the array. 
			 * enemyName is assigned to the same thing as enemy.*/
			

			/* ------------------------------------------
			NEW BATTLE SYSTEM PROPOSAL: The following is a possibility for how the battle system can be altered.


			while (health > 0 && enemy > 0) { // Loop continues until player or enemy health is 0.
				// Potential statement for determining whether or not the character or enemy moves first could be implemented here.

				public void player_Attack() {
					System.out.println("Choose your action:" +
							"\n\t1. Physical Attack" +
							"\n\t2. Magic Attack" +
							"\n\t3. Use Item");
					action = input.nextInt();
					temp = true;

					while (temp == true) { // Gets further user input for action or initiates.
						if (action == 1) {
							System.out.println("Chosse your attack:" +
									"\n\t1. Punch" +
									"\n\t2. Weapon");
							attack = input.nextInt();
							type = 'p';
							temp = false
						} else if (action == 2) {
							System.out.println("Chosse your spell:" +
									"\n\t1. Lightning Bolt" +
									"\n\t2. Flameball");
							attack = input.nextInt();
							type = 'm';
							temp = false;
						} else if (action == 3) {
							// Method to open character inventory.
							System.out.println("Inventory closed. Choose your action:" +
									"\n\t1. Physical Attack" +
									"\n\t2. Magic Attack" +
									"\n\t3. Use Item");
							action = input.nextInt();
						} else {
							System.out.println("Invalid response. Please pick a number from the list above.");
							action = input.nextInt();
						}
					}

					// Physical Attack:

					if (type = 'p') {
						if (attack == 1) {
							// Method in Forumulas class for determining punch damage.
							// Deal X damage to enemy if attack hits.
							// Report damage information to player.
						}
					}
					else {
						// Method for determining which weapon to use, could be a method in the inventory class.
						// Method in Formulas class for determining weapon damage.
						// Deal X damage to enemy if attack hits.
						// Report damage information to player.
					}

					// Magic Attack:

					if (type = 'm') {
						// Method to check how much magic power the player has left.
						if (magic_power > 0) {
							// Method that checks the attack variable to what's in the magic class.
							// If the character's remaining magic_power is greater than what's needed for that spell, the spell is cast.
							// If there is not enough magic_power left, the player will have to choose another spell or action.
							// OR... the spell is cast, but is much weaker depending on the difference.
							// Deal X damage to enemy if attack hits.
							// Report damage information to player.
						}
						else {
							System.out.println("You do not have any magic left!");
						}
					}
				}

				public void enemy_Attack() {
				// Methods for enemy attack calculations from enemy classes, possibly sent to Forumlas class.
				health -= damage; // Decrease player health if attack hits.
				}
			}

			public void battle_End() {
				if (health > enemy) {
					System.out.println("You are victorious!");
					// Methods for winning bonuses.
				}
				else {
					System.out.println("You have been defeated!");
					// Sends player back to the main menu.
				}
			}


			END NEW BATTLE SYSTEM
			------------------------------------------ */
			
			/*
			 * New Battle System Menu
			 *  
			 * */
			
			/*
			 * while(true) {perform battle system}
			 * I believe that before a battle the user should choose 2 magic attacks and 2 physical attacks
			 * to use before each battle. 
			 * 
			 * [Menu Example]
			 * 
			 * Display Character Stats(1) | Display Enemy Stats(2) | Choose Weapons/Abilities(3) | Start Battle(4)
			 * 
			 * [Selecting Character Stats]
			 * eg.
			 * Character: Warrior
			 * Health: 100
			 * Magic: 60
			 * Physical Damage = 0;
			 * Defense = 30
			 * Armor = 50
			 * Intelligence = 80
			 * Speed = 20
			 * Strength = 30
			 * Resistance = 60
			 * 
			 * Press Enter To Return To Menu
			 * 
			 * [Selecting Enemy Stats]
			 * 
			 * Character: Halfling
			 * Health: 100
			 * Magic: 60
			 * Physical Damage = 60
			 * Defense = 30
			 * Armor = 50
			 * Armor = 40
			 * Intelligence = 80
			 * Speed = 20
			 * Strength = 20
			 * Resistance = 49
			 * 
			 * Press Enter To Return To Menu
			 * 
			 * [Choose Weapons/Abilities]
			 * 
			 * Select Physical Attacks(1) | Select Magic(2) | Confirm(3)
			 * 
			 * [Select Physical Attack] 
			 * 1. Dagger
			 * 2. Sword
			 * 3. Knife
			 * .
			 * .
			 * .
			 * Type 'quit' to exit or 'remove' to remove weapons
			 * eg. [Error Prompt] - User cannot have more than 2 physical attacks
			 * eg. [Remove Weapons]
			 * 1. Knife
			 * 2. Dagger
			 * 
			 * Type 'quit' to exit
			 * 
			 * [Select Magic Abilities]
			 * 1. Flameball
			 * 2. Lightning Bolt
			 * .
			 * .
			 * .
			 * Type 'quit' to exit or 'remove' to change items
			 * eg. [Error Prompt] - User cannot have more than 2 magic abilities
			 * eg. [Remove Magic Abilities]
			 * 1. Flameball
			 * 2. Lightning Bolt
			 * 
			 * 
			 * [Confirm] - Inventory Saved
			 * 
			 * [Start Battle]
			 * Choose an Action: Melee(1) | Magic(2) 
			 * */
			
			random_Enemy(); //chooses a random enemy to fight
		
			while(true){ //If your health is greater than 0, keep going through the loop.
				System.out.println("\nChoose an Action:  Melee(1)/Magic(2): ");
				action = input.nextInt();
				if(action == 2){
					System.out.println("Choose a Magic Attack: "+magic_attacks.get_Flameball_Name()+"(1) "+magic_attacks.get_Lightning_Bolt_Name()+"(2)");
					magic_options = input.nextInt();
				}
				
				else if(action == 1){
					System.out.println("Choose a Physical Attack: "+weapon.getPunch_Name()+"(1) "+weapon.getRustyAxe_Name()+"(2)");
					physical_options = input.nextInt();
					
				}
				
				else {
					System.out.println("Please choose a valid response");
				}
//				if(physical_options == 1 && punch_attack_left == 0){
//					action = 0;
//				}
				
//				if(action == 0){
//				System.out.println("You can't use this Punch Attack anymore.");
//				melee = 0;
//				}
//				if(physical_options == 1 ){
//					punch_attack_left--;
//				}
//				if(physical_options == 2 ){
//					sword_attack_left--;
//				}
					
				for(int counter=0; counter<1;counter++){  
					damage = 1+number.nextInt(10); //default enemy damage
					if(action == 1 && physical_options == 1){
						melee = 1+number.nextInt(weapon.getPunch_Damage());
					}
					if(action == 1 && physical_options == 2){
						melee = 1+number.nextInt(weapon.getRusty_Axe_Damage());
					}
					
					if(action == 2 && magic_options == 2){
						magic = 1+number.nextInt(magic_attacks.get_Lightning_Bolt());
					}
					if(action == 2 && magic_options == 1){
						magic = 1+number.nextInt(magic_attacks.get_Flameball());
					}
//					if(action == 0){
//						break;
//					}
				}
					
				if(physical_options == 1 && r <= .30 || physical_options == 2 && r <= .30){
					character_health-=damage;
					System.out.println("*The Enemy Has Dealt "+damage+" Hit Point Damage To You.*\n ");
						try {
						      Thread.sleep(500);
						  }
						  catch (InterruptedException ie) { //Sleep timer for .5 seconds
						    ie.printStackTrace();
						  } 
						}
				
//				if(physical_options == 2 && sword_attack_left == 0){
//					System.out.println("You can't use this Punch Attack anymore.");
//					damage = 0;
//				}
				
					/* if the user chooses melee and it's attack has a percent of 60. It will execute
					 * the following. 
					 */
					
				if(physical_options == 1 && r <= .70 || physical_options == 2 && r <= .70){
					enemy_health-=melee;
//					if(punch_attack_left == 0){
//						  melee = 0;
//						  }
//					if(sword_attack_left == 0){
//						melee = 0;
//					}
					if(melee > 15){
						System.out.println("Critical Damage!");
					}
						System.out.println("*You Have Dealt "+melee+" Hit Point Damage To Your Enemy.*\n ");
						try {
						      Thread.sleep(500);
						  }
						  catch (InterruptedException ie) {
						    ie.printStackTrace();
						  }
					}
					
					else if (magic_options == 1 && r <= .30 || magic_options == 2 && r <= .30){ //Magic Attack
						character_health-=damage;
						System.out.println("*The Enemy Has Dealt "+damage+" Hit Point Damage To You.*\n ");
						 try {
						       Thread.sleep(500);
						   }
						   catch (InterruptedException ie) { //Sleep timer for .5 seconds
						     ie.printStackTrace();
						   }
//						 enemyQuotes.dyingQuote(); // say's a random dying quote from the enemy_Class
					}
					else if(magic_options == 1 && r <= .70 || magic_options == 2 && r <= .70){	//Magic Attack
						enemy_health-=magic;
						if(magic > 25){
							System.out.println("Critical Damage!"); 
						}
						System.out.println("*You Have Dealt "+magic+" Hit Point Damage To Your Enemy.*\n ");
						 try {
						       Thread.sleep(500);
						   }
						   catch (InterruptedException ie) { //Sleep timer for .5 seconds
						     ie.printStackTrace();
						   }	
					}
					else{
						System.out.println("You have missed.\n");
					}
					System.out.print("You - "+user+" HP"+" - "+character_health+" "+"\n"); System.out.println("Enemy - "+enemyName+" HP - "+enemy_health);
					 r= Math.random(); //Refreshes after each loop
					
					if(character_health <= 0){
						System.out.println("You are Dead");
						System.out.print(enemyName+" ");enemyQuotes.winningQuote();
						break;
					}
					else if(enemy_health <= 0){
						 System.out.println("The Enemy Has Been Defeated!\n");
						 enemyQuotes.deathQuote();
						 break; //Stops the while-loop if your enemies health is less than or = 0
					 }		
			} //End of While loop.
			if( enemy_health> character_health){ // If the enemies health is more than yours before it reaches 0, it wins. 
				 System.out.println("The Enemy Has Killed You.\n");
				 
			 }
		 
		 else if(character_health > enemy_health){ // If the your health is more than the enemies before it reaches 0, you win. 				 
				 /*Displays the remaining health after battle is over. */
				 System.out.println("You Have "+character_health+" Health Points Remaining.\n ");
				
				 try{
					 Thread.sleep(3000); //Sleep timer of 3 seconds. 
				 }
				 catch
					 (InterruptedException ie){
						 ie.printStackTrace(); 
					 }
				 
				 System.out.println("As A Reward For Your Accomplishment... ");
				 try{
					 Thread.sleep(500); //Sleep timer of .5 seconds. 
				 }
				 catch
					 (InterruptedException ie){
						 ie.printStackTrace(); 
					 }
				 boost_Health();
				 inventory.addToInventory("Health Potion", 1);
				 //inventory.viewInventory();
		}
	}	//End of BattleSystem method.
	
		
		
		/*
		 * Here is the method that controls how much boosted health we provide the user after each battle
		 * Values are completely random. These values should be adjusted. 
		 * */
		private void boost_Health(){
		 System.out.println("You have earned boost points towards your health.\n ");
		 if(character_health > 30 && character_health <= 40){
			 c.setBoost(20);
			 boost = c.getBoost();
			 System.out.println(boost+" Has Been Added");
			 System.out.println(character_health+boost+" Is Your New Health Points.\n ");
		 }
		 else if(character_health > 20 && character_health <= 30){
			 c.setBoost(30);
			 boost = c.getBoost();
			 System.out.println(boost+" Has Been Added");
			 System.out.println(character_health+boost+" Is Your New Health Points.\n "); 
		 }
		 
		 else if(character_health > 40){
			    c.setBoost(40);
			    boost = c.getBoost();
			 	System.out.println(boost+" Has Been Added");
			 	System.out.println(character_health+boost+" Is Your New Health Points.\n");
		 }
		 
		 else{
			 c.setBoost(60);
			 boost = c.getBoost();
			 System.out.println(boost+" Has Been Added");
			 System.out.println(character_health+boost+" Is Your New Health Points.\n");
		 }
		 try{
			 Thread.sleep(1000);
		 }
		 catch
			 (InterruptedException ie){
				 ie.printStackTrace(); 
			 } 	
	}
}	//public class battle_SystemTest