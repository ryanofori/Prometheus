package character;

import java.util.Scanner;

import enemy.Enemy_Giant;
import enemy.Enemy_Goblin;
import enemy.Enemy_Grunt;
import enemy.Enemy_Halfling;
import enemy.Enemy_Necromancer;
import enemy.Enemy_Scorpion;
import enemy.Enemy_Shapeshifter;
import enemy.Enemy_Siren;
import enemy.Enemy_Troll;

public class Character_Select {
	static int response = 0;
	static Scanner input = new Scanner(System.in);

	public static Character_Class character_Select(){
		
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
				Character_Warrior character = new Character_Warrior();
				System.out.println("You have chosen to be a Warrior");
				return character;
			}
			else if(response == 2) {
				Character_Orc character = new Character_Orc();
				System.out.print("You have chosen to be an Orc");
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
			}
		}
	public static Character_Class randomEnemy(){
		Enemy_Giant giant = new Enemy_Giant();
		Enemy_Goblin goblin = new Enemy_Goblin();
		Enemy_Grunt grunt = new Enemy_Grunt();
		Enemy_Halfling halfling = new Enemy_Halfling();
		Enemy_Necromancer necromancer = new Enemy_Necromancer();
		Enemy_Scorpion scorpion = new Enemy_Scorpion();
		Enemy_Shapeshifter shapeshifter = new Enemy_Shapeshifter();
		Enemy_Siren siren = new Enemy_Siren();
		Enemy_Troll troll = new Enemy_Troll();
		int rand = 0;
		
		Object[] enemy_object = {giant,goblin,grunt,halfling,necromancer,scorpion,shapeshifter,siren,troll};
		
		for(int counter = 0; counter < 1;counter++){
			rand = (int) (Math.random() * enemy_object.length);
		}
		
		return (Character_Class) enemy_object[rand];
	}
}
