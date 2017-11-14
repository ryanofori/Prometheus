package character;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Character_Select {
	static int response = 0;
	static Scanner input = new Scanner(System.in);

	public static Character_Class character_Select(){
		
		/*Here I am asking you which character you would like to be. */
		while (true) {
			try{
				System.out.println("Which character class would you like to play as for this session?:"
					+ "\n\t1.) Warrior"
					+ "\n\t2.) Orc"
					+ "\n\t3.) Wizard"
					+ "\n\t4.) Elf"
					+ "\n\t5.) Dwarf");
			    response = input.nextInt();	
			    if (response >=1 && response <=5){
			    	break;
			    }
			    else{
			    	System.out.println("Please enter a number between 1-5");
			    }
				}catch(InputMismatchException e){
					System.out.println("Please enter a valid response");
					}input.nextLine();
			}
			if(response == 1) {
				Character_Warrior character = new Character_Warrior();
				System.out.println("You have chosen to be a Warrior");
				return character;
			}
			else if(response == 2) {
				Character_Orc character = new Character_Orc();
				System.out.println("You have chosen to be an Orc");
				return character;
			}
			else if(response == 3) {
				Character_Wizard character = new Character_Wizard();
				System.out.println("You have chosen to be a Wizard");
				return character;
			}
			else if(response == 4) {
				Character_Elf character = new Character_Elf();
				System.out.println("You have chosen to be an Elf");
				return character;
			}
			else if(response == 5) {
				Character_Dwarf character = new Character_Dwarf();
				System.out.println("You have chosen to be a Dwarf");
				return character;
			}
			else {
				System.out.println("Invalid Response. Please enter a number from the list above.");
				response = input.nextInt();
				}
			return null;
			}
		}
