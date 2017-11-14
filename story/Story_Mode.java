package story;
import java.util.Scanner;
import battle_system.Battle_System;
import character.*;
import enemy.*;
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
	
	
	/* [Random Enemy Generator]
	 * The purpose of the random enemy generator is for testing/functionality purposes only.
	 * It will not be used in the final version of the game. 
	 * 
	 * */
	Enemy enemy = Enemy.randomEnemy(); //Generates a random enemy
	
	public void tutorial(Character_Class player) throws Exception{
		System.out.println("A quick simulated battle is about to commence. ");
		System.out.println("Please pay attention as to what's going on. ");
		battle.battleSystem(player,enemy); //Starts the battle class.
		tutorial2(player); 
		}
	
	/*the beginning of the 2nd tutorial */
	private void tutorial2(Character_Class player){
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
		System.out.println("Are you ready to move forward? (Yes/No): ");
		response = input.nextLine();
		if(response.equalsIgnoreCase ("Yes")){
			tutorial3(player);
		}
		else if (response.equalsIgnoreCase("No")){
			endTutorial();	
		}
	}
	/*End of the 2nd part of the tutorial.*/
	
	/*Beginning the third part of the tutorial*/
	private void tutorial3(Character_Class player){
		String user;
		System.out.println("What will you name your character?");
		response2 = input.nextLine();
		user = response2;
		System.out.println("Hello! "+ user);
		System.out.println("You're about to enter a world full of adventure.");
		System.out.println("Shall I remind you again of your character choice? (Yes/No)");
		response2 = input.nextLine();
		if(response2.equalsIgnoreCase("Yes")){
			player.getSpeak();
			System.out.print("I have: ");
			player.getHealth();
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
