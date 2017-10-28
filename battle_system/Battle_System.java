package battle_system;

import java.util.Scanner;
import java.util.Random;
import character.Character_Orc;
import enemy.Enemy_Quotes;
import character.Character_Warrior;
import enemy.Enemy_Class;
import character.Weapons;
	public class Battle_System {
		Character_Orc Orc = new Character_Orc(); // Bringing in all of the Orc's information. 
		Enemy_Quotes enemyQuotes = new Enemy_Quotes();
		Character_Warrior Warrior = new Character_Warrior(); // Bringing in all of the Warriors information. 
		Enemy_Class Enemy = new Enemy_Class();
		Weapons  weapon = new Weapons();
		Magic magic_attacks = new Magic();
		String user,enemyName;
	
		private int damage, health, enemy, boost,melee;
		private int magic;
		//private int sword_attack_left=5,punch_attack_left=5;
		public int getFlameBall(){
			return magic_attacks.Flameball();
		}
		
		public int getLightningBolt(){
			return magic_attacks.lightning_Bolt();
		}
		
		public int getWeapon_Rusty_Axe(){
			return  weapon.getRusty_Axe_Damage();
		}
		
		public String getGoblinName(){
			return enemyName = Enemy.getGoblinName();
		}
		
		public String getTrollName(){
			return enemyName = Enemy.getTrollsName();
		}
		
		public String getGruntName(){
			return enemyName = Enemy.getGruntName();
		}
		
		public String getHalflingName(){
			return enemyName = Enemy.getHalflingName();
		}
		
		public String getScorpionName(){
			return enemyName = Enemy.getScorpionName();
		}
		
		public String getUserOrc(){
			return user =  Orc.getUserOrc();
		}
		
		public int getOrcHealth(){
			return health = Orc.healthOrc();
		}
				
		public String getUserWarrior(){  
			return user =  Warrior.getUserWarrior();
		}
		
		public int getHealthWarrior(){
			return health = Warrior.getHealthWarrior();
		}
		
		public int getGoblinHealth(){
			return Enemy.getGoblinHealth();	
		}
		
		public int getHalfling(){
			return Enemy.getHalfling();
		}
		
		public int getTrollsHealth(){
			return Enemy.getTrollsHealth();
		}
		
		public int getScorpionHealth(){
			return Enemy.getScorpionHealth();
		}
		
		public int getGruntHealth(){
			return Enemy.getGruntHealth();
		}
			
		public int boostOrc(){
			return boost = Orc.boostOrc();
		}
		
		public int boostWarrior(){
			return boost =  Warrior.boostWarrior();
		}
		

		public void BattleSystem(){
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			Random number = new Random();
			int action,magic_options=0,physical_options=0;
			double r = Math.random();
			
			/*The eName array and the selection array are in a random. 
			 * I assigned each method with health and a name. 
			 * I then assign enemy to which ever enemy method is chosen in the array. 
			 * enemyName is assigned to the same thing as enemy.*/
			
			String [] eName ={getGruntName(),getGoblinName(),getTrollName(),getScorpionName(),getHalflingName()};		
			int [] selection = {getGruntHealth(),getGoblinHealth(),getTrollsHealth(),getScorpionHealth(),getHalfling()};
			for(int counter = 0; counter < 1;counter++){
				int rand = (int) (Math.random() * selection.length);
				enemy = selection[rand];
				enemyName = eName[rand];
			}
		
			while(health > 0){ //If your health is greater than 0, keep going through the loop.
				System.out.println("\nChoose an Action:  Melee(1)/Magic(2): ");
				action = input.nextInt();
				if(action == 2){
					System.out.println("Choose a Magic Attack: Flame_Ball(1)/Lightning_Bolt(2): ");
					magic_options = input.nextInt();
				}
				
				if(action == 1){
					System.out.println("Choose a Physical Attack: Punch(1)/Rusty_Axe(2): ");
					physical_options = input.nextInt();
					
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
					damage = 1+number.nextInt(10);
					if(action == 1 && physical_options == 1){
						melee = 1+number.nextInt(10);
					}
					if(action == 1 && physical_options == 2){
						melee = 1+number.nextInt(getWeapon_Rusty_Axe());
					}
					
					if(action == 2 && magic_options == 2){
						magic = 1+number.nextInt(getLightningBolt());
					}
					if(action == 2 && magic_options == 1){
						magic = 1+number.nextInt(getFlameBall());
					}
//					if(action == 0){
//						break;
//					}
				}
					
				if(physical_options == 1 && r <= .30 || physical_options == 2 && r <= .30){
					health-=damage;
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
					enemy-=melee;
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
						health-=damage;
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
						enemy-=magic;
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
					System.out.print("You - "+user+" HP"+" - "+health+" "+"\n"); System.out.println("Enemy - "+enemyName+" HP - "+enemy);
					 r= Math.random(); //Refreshes after each loop
					
					if(health <= 0){
						System.out.println("You are Dead");
						System.out.print(enemyName+" ");enemyQuotes.winningQuote();
						break;
					}
					else if(enemy <= 0){
						 System.out.println("The Enemy Has Been Defeated!\n");
						 enemyQuotes.deathQuote();
						 break; //Stops the while-loop if your enemies health is less than or = 0
					 }		
			} //End of While loop.
			if( enemy> health){ // If the enemies health is more than yours before it reaches 0, it wins. 
				 System.out.println("The Enemy Has Killed You.\n");
				 
			 }
		 
		 else if(health > enemy){ // If the your health is more than the enemies before it reaches 0, you win. 
				 try{
					 Thread.sleep(2000);
				 }
				 catch
					 (InterruptedException ie){
						 ie.printStackTrace(); 
					 }
				 
				 /*Displays the remaining health after battle is over. */
				 System.out.println("You Have "+health+" Health Points Remaining.\n ");
				
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
				 
				 /*The boost works according to how much health you have at the end of the battle. If you have between 30 and 40 health, 
				  * you gain 40 health points. If you have between 20 and 30, you gain 50, and finally if you have greater than 40, 
				  * you gain 30 health points. */
				 
				 System.out.println("You have earned boost points towards your health.\n ");
				 
				 if(health > 30 && health <= 40){
					 boostOrc();
					 System.out.println(boost+" Has Been Added");
					 System.out.println(health+boost+" Is Your New Health Points.\n ");
				 }
				 else if(health > 20 && health <= 30){
					 boostOrc();
					 System.out.println(boost+" Has Been Added");
					 System.out.println(health+boost+" Is Your New Health Points.\n "); 
				 }
				 
				 else if(health > 40){
					    boostWarrior();
					 	System.out.println(boost+" Has Been Added");
					 	System.out.println(health+boost+" Is Your New Health Points.\n");
				 }
				 
				 else{
					 System.out.println(boost+" Has Been Added");
					 System.out.println(health+boost+" Is Your New Health Points.\n");
				 }
				 try{
					 Thread.sleep(1000);
				 }
				 catch
					 (InterruptedException ie){
						 ie.printStackTrace(); 
					 } 
		}	//End of health points system. 
	}	//End of BattleSystem method. 	 
}	//public class battle_SystemTest