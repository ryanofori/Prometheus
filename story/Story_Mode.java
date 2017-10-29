package story;
import java.util.Scanner;
import battle_system.Battle_System;
import character.Character_Orc;
import character.Character_Warrior;
public class Story_Mode {
	
	Scanner input = new Scanner(System.in);
	Character_Orc orc = new Character_Orc();
	Character_Warrior warrior = new Character_Warrior();
	Battle_System battle = new Battle_System();

	
	int number; //This controls the Scanner options. 
	String response,response2; //These control the String versions of the scanner options. 
	
	
	/*
	 * This is the tutorial section of the story mode
	 * Any contributers to the story mode are allowed to expand the story past the tutorial
	 * 
	 * */
	public int character_Select(int choice){	
		return choice;
	}
	
	public int character_Info(){
		System.out.println("Choose a Character: Warrior(1) or Orc(2): ");
		number = input.nextInt(); //Grabs the users input
		if (number == 1){
			warrior.getUserWarrior();
			System.out.println("You have chosen the Warrior to take on this adventure! ");
			try {
			       Thread.sleep(2000);  //A sleep timer of 1 second. 
			   }
			   catch (InterruptedException ie) {
			     ie.printStackTrace();
			   }
			System.out.println(warrior.speak()); //I am Warrior!
			System.out.println(warrior.speak3()+warrior.getHealthWarrior()+" Health"); //I have 120 health.
			
		}
		else if(number == 2){
			System.out.println("You have chosen the Orc to take on this adventure! ");
			try {
			       Thread.sleep(2000); //Sleep timer of 2 seconds. 
			   }
			   catch (InterruptedException ie) {
			     ie.printStackTrace();
			   }
			System.out.println(orc.speak()); //I am Warrior!
			System.out.println(orc.speak3()+orc.getOrcHealth()+" Health"); //I have 10 health.
			
			}
		return number;
		}
	
	public void story(){
		character_Info();
		int select = character_Select(number);
		System.out.println("A quick simulated battle is about to commence. ");
		System.out.println("Please pay attention as to what's going on. ");
		battle.battleSystem(select); //Starts the battle class.
		story2(); //Starts the story2 method.
		}
	
	/*the beginning of the story2 method. */
	public void story2(){
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
			story3();
		}
		else if (response.equalsIgnoreCase("No")){
			endStory();	
		}
	}
	/*End of the story2 method.*/
	
	/*Beginning of the story3 method.*/
	public void story3(){
		String user;
		System.out.println("What will you name your character?");
		response2 = input.nextLine();
		user = response2;
		System.out.println("Hello! "+ user);
		System.out.println("You're about to enter a world full of adventure.");
		System.out.println("Shall I remind you again of your character choice? (Yes/No)");
		response2 = input.nextLine();
		if(response2.equalsIgnoreCase("Yes")){
			if(number == 1){
				System.out.println("\n"+warrior.speak());
				System.out.println(warrior.speak3()+warrior.getHealthWarrior()+" Health");
					
		}
			if(number == 2){
				System.out.println("\n"+orc.speak());
				System.out.println(orc.speak3()+orc.getOrcHealth()+" Health");
				
				}
			}
		else if(response2.equalsIgnoreCase("No")){
			System.out.println("Good Deal then!");
			System.out.println("This concludes this portion of the game. ");
		}
	}
	
	
	/*End of the story3 method. */
	/*
	 * This concludes the tutorial session of the game. 
	 * Contributors can add new story elements below this comment section
	 * 
	 * */
	
	/*Beginning of the endStory method. */
	public void endStory(){
		System.out.println("Thanks for playing! ");
	} 
	/*End of the endStory method. */
}