package shopping;
//import character.Items;	//uncomment when Items class is made
import character.Weapons;
import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {
	
	
	
	//private Weapons[] weaponsStock = {new Weapons(), new Weapons(), new Weapons(), new Weapons(), new Weapons()};
	//private Items[] ItemsStock = {new Items(), new Items(), new Items(), new Items(), new Items()};	//when Items class is created, uncomment
	static Scanner input = new Scanner(System.in);
	private String response = null;
	private boolean currentlyHere, browsing = false; //using it for while loop so I don't have to use recursion
	
	
	public void store(){
		if (currentlyHere == false){
			System.out.println("Welcome to my store. Take a look at my wares.");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		
		stockShop();
		
		currentlyHere = true;
		while (currentlyHere == true){
			System.out.println("Weapons (1) / Consumables (2) / Exit Store (3)");
			
			if (response == "1")
				browseWeapons();
			else if (response == "2")
				browseItems();
			else if (response == "3")
				exitStore();
			else
				System.out.println("Invalid input.");
			
		}
		
	}
	
	/*
	 *  Stock Shop
	 */
	
	public void stockShop(){
		setWeaponsStock();
		setItemsStock();
	}
	
	/*
	 * Browse
	 */
	
	//Displays weapons then switch statement to handle player choices
	public void browseWeapons(){
		System.out.println("Weaponss:\n"); // (Number to Type) [Weapon] - [Price]
		displayWeapons();
		browsing = true;
		response = input.nextLine();
			
		while (browsing == true){    //using placeholder strings for parameters
			switch (response){
				case "0":	buyItem("Sword");
							break;
				case "1":	buyItem("Knife");
							break;
				case "2":	buyItem("Dagger");
							break;
				case "3":	buyItem("Mace");
							break;
				case "4":	buyItem("Club");
							break;
				case "9":
				case "exit":
				case "back": browsing = false;
							break;
				default: System.out.println("Invalid input.");
			}
		}	
			
		
	}
	
	//Displays weapons then switch statement to handle player choices
	public void browseItems(){
		System.out.println("Items:\n"); // (Number to Buy) Item - $Price
		displayItems();
		response = input.nextLine();
		
		while (browsing == true){   //using placeholder strings for parameters
			switch (response){
				case "0":	buyItem("Health Potion");
							break;
				case "1":	buyItem("Mana Potion");
							break;
				case "2":	buyItem("Poison");
							break;
				case "3":	buyItem("Energy Restore");
							break;
				case "4":	buyItem("Burn Repel");
							break;
				case "9":
				case "exit":
				case "back": browsing = false;
							break;
				default: System.out.println("Invalid input.");
			}	
		}
		
	}
	
	/*
	 * Display
	 */
	
	public void displayWeapons(){
		//for(int index = 0; i < weaponsStock.size(); i++){
		//	System.out.println("("index+") "+ weaponsStock[index].getName() + " - "+ weaponsStock[index].getPrice());
		//}
	}
	
	public void displayItems(){
	/*	
		for(int index = 0; i < weaponsStock.size(); i++){
		System.out.println("("index+") "+ itemsStock[index].getName() +" - "+ itemsStock[index].getPrice());
		}
	*/	 
	}
	
	/*
	 * Buy Item
	 */
	
	public void buyItem(String item){ //change String item to shopstock or whatever when I figure out how to implement.
		/*	if (money >= price){
		 * 		money -= price
		 * 		//add item to inventory
		 * 		System.out.println("Here's your " + item.getName() + ".");
		 *  }
		 *  else {
		 *  	System.out.println("Not enough gold. \nMaybe try farming a local dungeon. Probably some thieves still around.");
		 *  }
		 * 
		 */
	}
	
	/*
	 * Leave store (exit shopping)
	 */
	
	public void exitStore(){
		currentlyHere = false;
	}
	
	public void setWeaponsStock(){
		//foreach normal weapon
		//	add weapon to weaponsStock arraylist
	}
	
	public void setItemsStock(){
		
	}
	
	/*
	public Weapons[] getWeaponsStock(){
		return weaponsStock;
	}
	
	public Items[] getItemsStock(){
		return itemsStock;
	}
	*/
	
	/*
	public void selectOption(String choice){
		if (choice == "1")		//Weapons selection
			System.out.println();
		else if (choice == "2")	//Items selection
			System.out.println();
		else if (choice == "3")	//Back to main selection
			System.out.println();
	}	
	*/
}
