package story;
import java.util.Scanner;
import battle_system.Battle_System;
import character.Character_Orc;
import character.Character_Warrior;
public class Story_Mode extends Battle_System {
	
	Scanner input = new Scanner(System.in);
	Character_Orc Orc = new Character_Orc();
	Character_Warrior Warrior = new Character_Warrior();

	
	int number; //This controls the Scanner options. 
	String response,response2; //These control the String versions of the scanner options. 
	
	public void story(){
		System.out.println("Choose a Character: Warrior(1) or Orc(2): ");
		number = input.nextInt(); //Grabs the users input
		if(number == 1){
			number = 1;// If the user input is 1 then print out the Warrior stats and set number = to 1.		
			System.out.println("You have chosen the Warrior to take on this adventure! ");
			getUserWarrior();
			try {
			       Thread.sleep(1000);  //A sleep timer of 1 second. 
			   }
			   catch (InterruptedException ie) {
			     ie.printStackTrace();
			   }
			System.out.println(Warrior.speak()); //I am Warrior!
			System.out.println(Warrior.speak3()+getHealthWarrior()+" Health"); //I have 120 health. 
			try {
			       Thread.sleep(2000); //Sleep timer of 2 seconds. 
			   }
			   catch (InterruptedException ie) {
			     ie.printStackTrace();
			   }
			System.out.println("A quick simulated battle is about to commence. ");
			System.out.println("Please pay attention as to what's going on. ");
			try{
				Thread.sleep(2000); //Sleep timer of 2 seconds. 
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
			getHealthWarrior(); //Grabs the Warriors health. 
			BattleSystem(); //The battle_System class is now initialized. 
			story2(); //Goes to the story2 method within this class. 
			}
			
			else if(number == 2){	//If the user input is 2 then print out the Orc stats and set number = to 2. 
			number = 2;		
			System.out.println("You have chosen the Orc to take on this adventure! ");
			try {
			       Thread.sleep(2000);	//Sleep timer of 2 seconds. 
			   }
			   catch (InterruptedException ie) {
			     ie.printStackTrace();
			   }
			getUserOrc();
			System.out.println(Orc.speak());	//I am Orc! 
			System.out.println(Orc.speak3()+getOrcHealth()+" Health"); 	//I have 100 health. 
			try {
			       Thread.sleep(4000);	//Sleep timer of 4 seconds. 
			   }
			   catch (InterruptedException ie) {
			     ie.printStackTrace();
			   }
			System.out.println("A quick simulated battle is about to commence. ");
			System.out.println("Please pay attention as to what's going on. ");
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
			getOrcHealth(); //Set's the health = to 100.
			BattleSystem(); //Starts the battle class.
			story2(); //Starts the story2 method. 
			}	
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
				System.out.println("\n"+Warrior.speak());
				System.out.println(Warrior.speak3()+getHealthWarrior()+" Health");
					
		}
			if(number == 2){
				System.out.println("\n"+Orc.speak());
				System.out.println(Orc.speak3()+getOrcHealth()+" Health");
				
				}
			}
		else if(response2.equalsIgnoreCase("No")){
			System.out.println("Good Deal then!");
			System.out.println("This concludes this portion of the game. ");
		}
		}
	
	
	/*End of the story3 method. */
	
	/*Beginning of the endStory method. */
	public void endStory(){
		System.out.println("Thanks for playing! ");
	} 
	/*End of the endStory method. */
}