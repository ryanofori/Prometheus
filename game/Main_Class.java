package game;
import story.Story_Mode;
import character.Character_Warrior;
import character.Character_Orc;
import character.Character_Wizard;
import character.Character_Elf;
import character.Character_Dwarf;
import tournament.Tournament_Mode;
import shopping.Shopping;
import java.util.Scanner;

public class Main_Class  {
	public static void main(String [] args) throws Exception{
		Scanner input = new Scanner(System.in);
		int response = 0;
		
		System.out.println("Welcome to Prometheus!");
		
		/*
		 * There are 3 modes (Story Mode, Tournament and Shopping)
		 * Have the user select which mode he/she would like to enter
		 * 
		 * */
		
		Story_Mode story = new Story_Mode();
		Tournament_Mode tournament = new Tournament_Mode();
		Shopping shopping = new Shopping();
		
		/*Here I am asking you which character you would like to be. */
		
		System.out.println("Which character class would you like to play as for this session?:"
				+ "\n\t1.) Warrior"
				+ "\n\t1.) Orc"
				+ "\n\t1.) Wizard"
				+ "\n\t1.) Elf"
				+ "\n\t1.) Dwarf");
		response = input.nextInt();
		boolean choice = true;
		while (choice = true) {
			if(response == 1) {
				System.out.println("You have chosen to be a warrior!");
				Character_Warrior character = new Character_Warrior();
				choice = false;
			}
			else if(response == 2) {
				System.out.println("You have chosen to be an orc!");
				Character_Orc character = new Character_Orc();
				choice = false;
			}
			else if(response == 3) {
				System.out.println("You have chosen to be a wizard!");
				Character_Wizard character = new Character_Wizard();
				choice = false;
			}
			else if(response == 4) {
				System.out.println("You have chosen to be an elf!");
				Character_Elf character = new Character_Elf();
				choice = false;
			}
			else if(response == 5) {
				System.out.println("You have chosen to be a dwarf!");
				Character_Dwarf character = new Character_Dwarf();
				choice = false;
			}
			else {
				System.out.println("Invalid Response. Please enter a number from the list above.");
				response = input.nextInt();
			}
		}
		
		/* The character has been chosen and will remain the same throughout the game.
		 * Reference to the character object may need to be passed to each mode in order to save progress from each mode.
		 */
	
		while (true){
			System.out.println("Please select a mode: Story Mode(1) | Shopping(2) | Tournament(3) | Exit(4)");
			response = input.nextInt();
			if(response == 1){
				story.tutorial();
			}
			else if(response == 2){
			    shopping.store();
		    }
		    else if(response == 3){
			    tournament.fight();
		    }
		    else if(response == 4){
			    System.out.println("Thanks for playing");
			    break;
		    }
		    else{
			    System.out.println("Please enter a valid response");
		    }
		}
		input.close();
	}
}