package story;
import java.util.Scanner;
import battle_system.Battle_System;
import character.Character_Orc;
import character.Character_Warrior;
import character.Character_Dwarf;
import character.Character_Elf;
import character.Character_Wizard;
import enemy.Enemy_Giant;
import enemy.Enemy_Goblin;
import enemy.Enemy_Grunt;
import enemy.Enemy_Halfling;
import enemy.Enemy_Necromancer;
import enemy.Enemy_Scorpion;
import enemy.Enemy_Shapeshifter;
import enemy.Enemy_Siren;
import enemy.Enemy_Troll;
public class Story_Mode {
	
	static Scanner input = new Scanner(System.in);
	Battle_System battle = new Battle_System();

	
	static int number,health, place; //This controls the Scanner options. 
	String response; //These control the String versions of the scanner options. 
	static String response2, speak, speak2,speak3;
	
	/*
	 * This is the tutorial section of the story mode
	 * Any contributers to the story mode are allowed to expand the story past the tutorial
	 * 
	 * */
	
	
	
	private int character_Select(int choice){	
		return choice;
	}
	
	private int character_Info(){
		System.out.println("Choose a Character: Warrior(1), Orc(2), Dwarf(3), Elf(4), or Wizard(5): ");
		number = input.nextInt(); //Grabs the users input
		if (number == 1){
			Character_Warrior character = new Character_Warrior();
			System.out.println("You have chosen the Warrior to take on this adventure! ");
			try {
			       Thread.sleep(2000);  //A sleep timer of 2 second. 
			   }
			   catch (InterruptedException ie) {
			     ie.printStackTrace();
			   }
			speak = character.getSpeak();
			speak2 = character.getSpeak2();
			speak3 = character.getSpeak3();
			health = character.getHealth();
			System.out.println(speak); //I am Warrior!
			System.out.println(speak3+" "+health+" Health"); //I have 100 health.
			
		}
		else if(number == 2){
			Character_Orc character = new Character_Orc();
			System.out.println("You have chosen the Orc to take on this adventure! ");
			try {
			       Thread.sleep(2000); //Sleep timer of 2 seconds. 
			   }
			   catch (InterruptedException ie) {
			     ie.printStackTrace();
			   }
			speak = character.getSpeak();
			speak2 = character.getSpeak2();
			speak3 = character.getSpeak3();
			health = character.getHealth();
			System.out.println(speak);
			System.out.println(speak3+" "+health+" Health");
			
			}
		else if(number == 3){
			Character_Dwarf character = new Character_Dwarf();
			System.out.println("You have chosen the Dwarf to take on this adventure! ");
			try {
			       Thread.sleep(2000); //Sleep timer of 2 seconds. 
			   }
			   catch (InterruptedException ie) {
			     ie.printStackTrace();
			   }
			speak = character.getSpeak();
			speak2 = character.getSpeak2();
			speak3 = character.getSpeak3();
			health = character.getHealth();
			System.out.println(speak);
			System.out.println(speak3+" "+health+" Health");
		}
		else if(number == 4){
			Character_Elf character = new Character_Elf();
			System.out.println("You have chosen the Elf to take on this adventure! ");
			try {
			       Thread.sleep(2000); //Sleep timer of 2 seconds. 
			   }
			   catch (InterruptedException ie) {
			     ie.printStackTrace();
			   }
			speak = character.getSpeak();
			speak2 = character.getSpeak2();
			speak3 = character.getSpeak3();
			health = character.getHealth();
			System.out.println(speak);
			System.out.println(speak3+" "+health+" Health");
		}
		else if(number == 5){
			Character_Wizard character = new Character_Wizard();
			System.out.println("You have chosen the Wizard to take on this adventure! ");
			try {
			       Thread.sleep(2000); //Sleep timer of 2 seconds. 
			   }
			   catch (InterruptedException ie) {
			     ie.printStackTrace();
			   }
			speak = character.getSpeak();
			speak2 = character.getSpeak2();
			speak3 = character.getSpeak3();
			health = character.getHealth();
			System.out.println(speak);
			System.out.println(speak3+" "+health+" Health");
		}
		else{
			System.out.println("Please select a valid response");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
			character_Info();
		}
		return number;
	}
	
	public void tutorial() throws Exception{
		character_Info();
		int select = character_Select(number);
		System.out.println("A quick simulated battle is about to commence. ");
		System.out.println("Please pay attention as to what's going on. ");
		battle.battleSystem(select); //Starts the battle class.
		tutorial2(); //Starts the story2 method.
		}
	
	/*the beginning of the 2nd tutorial */
	private void tutorial2(){
		System.out.println("As you can see, the battle system allows for you to choose your own attacks.\n");
		System.out.println("This is how all of your battles will take place.\n");
		try {
		       Thread.sleep(2000);	//Sleep timer of 2 seconds. 
		   }
		   catch (InterruptedException ie) {
		     ie.printStackTrace();
		   }
		System.out.println("Please Press Enter to Continue");
		response = input.nextLine();
		response = input.nextLine();
		System.out.println("Are you ready to move forward? (Yes/No): ");
		response = input.nextLine();
		if(response.equalsIgnoreCase ("Yes")){
			tutorial3();
		}
		else if (response.equalsIgnoreCase("No")){
			endTutorial();	
		}
	}
	/*End of the 2nd part of the tutorial.*/
	
	/*Beginning the third part of the tutorial*/
	private void tutorial3(){
		String user;
		System.out.println("What will you name your character?");
		response2 = input.nextLine();
		user = response2;
		System.out.println("Hello! "+ user);
		System.out.println("You're about to enter a world full of adventure.");
		System.out.println("Shall I remind you again of your character choice? (Yes/No)");
		response2 = input.nextLine();
		if(response2.equalsIgnoreCase("Yes")){
			System.out.println("\n"+speak);
			System.out.println(speak3+" "+health+" Health");
			endTutorial();
			}
		else if(response2.equalsIgnoreCase("No")){
			System.out.println("Good Deal then!");
			System.out.println("This concludes this portion of the game. ");
			endTutorial();
		}
	}
	
	public void endTutorial(){
		System.out.println("Thanks for playing! ");
	} 
	
	public void endStory(){
		System.out.println("Thanks for playing! ");
	}
	
	/*
	 * This concludes the tutorial session of the game. 
	 * Contributors can add new story elements below this comment section
	 * 
	 * */
	public void Introduction(){
		String user;
		System.out.println("What will you name your character?");
		response = input.nextLine();
		user = response;
		System.out.println("Hello! "+ user);
		System.out.println("Welcome to Prometheus! Are you ready for an adventure?");
		try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		System.out.println("During your journey, you will encounter 9 enemies in 5 different settings.");
		System.out.println("The 5 places you will battle will be city, forest, lake, mountain, and desert and there will be enemies in each.");	
		try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		System.out.println("If you shall lose any of these battles, it will result in GAME OVER.");
		System.out.println("If you win all of your battles, you will be rewarded with a large monetary prize that you may use to buy weapons and potions to be used in the tournament.");
		try{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		System.out.println("Are you ready to begin? (Yes/No)");
		response2 = input.nextLine();
		if(response2.equalsIgnoreCase("Yes")){
		//	Chapter1();
		}
		else if (response2.equalsIgnoreCase("No")){
			endStory();
		}	
	}
}
