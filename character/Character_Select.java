package character;

import java.util.Scanner;

public class Character_Select {
	public static Character_Class character_Select(){
		int response = 0;
		Scanner input = new Scanner(System.in);
		/*Here I am asking you which character you would like to be. */
		System.out.println("Which character class would you like to play as for this session?:"
				+ "\n\t1.) Warrior"
				+ "\n\t2.) Orc"
				+ "\n\t3.) Wizard"
				+ "\n\t4.) Elf"
				+ "\n\t5.) Dwarf");
		response = input.nextInt();
		while (true) {
			if(response == 1) {
				System.out.println("You have chosen to be a warrior!");
				Character_Warrior character = new Character_Warrior();
				return character;
				//	break;
			}
			else if(response == 2) {
				System.out.println("You have chosen to be an orc!");
				Character_Orc character = new Character_Orc();
				return character;
			//	break;
			}
			else if(response == 3) {
				System.out.println("You have chosen to be a wizard!");
				Character_Wizard character = new Character_Wizard();
				return character;
			//	break;
			}
			else if(response == 4) {
				System.out.println("You have chosen to be an elf!");
				Character_Elf character = new Character_Elf();
				return character;
			//	break;
			}
			else if(response == 5) {
				System.out.println("You have chosen to be a dwarf!");
				Character_Dwarf character = new Character_Dwarf();
				return character;
			//	break;
			}
			else {
				System.out.println("Invalid Response. Please enter a number from the list above.");
				response = input.nextInt();
				}
			}
		}

}
