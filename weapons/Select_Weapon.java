package weapons;
import java.util.ArrayList;
import java.util.Scanner;

import character.Character_Class;

public class Select_Weapon {
	Scanner input = new Scanner(System.in);
	ArrayList<Character_Class> weapons = new ArrayList<Character_Class>();
	int selectOption;
	
	Rusty_Axe rusty = new Rusty_Axe();
	
	public Select_Weapon() {
		weapons.add(rusty);
	}
	
	public void selectWeapon(Character_Class player) throws Exception {
		while(true) {
			System.out.println("Weapons to select:");
			for(int i = 0; i<weapons.size(); i++) {
				System.out.println((i+1)+") "+weapons.get(i));
			}
			int response = input.nextInt();
			if(response!=0) {
				Character_Class temp = weapons.get(response-1);
				player.backpack.addToInventory(temp.getName(), 1);
				break;
			}
			else {
				System.out.println("Not a valid option\n");
			}
		}
	}
}
