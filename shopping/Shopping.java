package shopping;
//import character.Items;	//uncomment when Items class is made
import character.Weapons;
import character.Character_Class;
import java.util.Scanner;

public class Shopping {
	
	
	//dummy data - just to use for now.
	//when Weapons class is created, change asdf to Weapons
	private asdf[] weaponsStock = {new asdf("Sword", 350, "weapon"), new asdf("Knife", 50, "weapon"), new asdf("Dagger", 125, "weapon"), new asdf("Mace", 350, "weapon"), new asdf("Broken Stick", 5, "weapon")}; 
	//when Items class is created, change asdf to Items
	private asdf[] itemsStock = {new asdf("Health Potion", 150, "item"), new asdf("Mana Potion", 150, "item"), new asdf("Antidote", 100, "item"), new asdf("Energy Restore", 225, "item"), new asdf("Burn Heal", 250, "item")};	
	
	static Scanner input = new Scanner(System.in);
	private String response = null;
	private boolean currentlyHere, browsing = false; //using it for while loop so I don't have to use recursion
	
	
	public void store(Character_Class person) throws Exception{
		if (currentlyHere == false){
			System.out.println("Welcome to my store. Take a look at my wares.\n");
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
			System.out.println("Weapons (1) / Consumables (2) / View Backpack(3) /Exit Store (4)");
			response = input.nextLine();
			
			if (response.equals("1"))
				browseWeapons(person);
			else if (response.equals("2"))
				browseItems(person);
			else if (response.equals("3"))
				person.backpack.viewInventory();
			else if (response.equals("4"))
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
	public void browseWeapons(Character_Class person) throws Exception{
		System.out.println("Weapons:"); // (Number to Type) [Price] - [Weapons]
		browsing = true;
			
		while (browsing == true){    //using placeholder strings for parameters
			displayStock(weaponsStock);
			response = input.nextLine();
			switch (response.toString()){
				case "0":	buyItem(person, weaponsStock[0].getName(), weaponsStock[0].getPrice()); //Sword
							break;
				case "1":	buyItem(person, weaponsStock[1].getName(), weaponsStock[0].getPrice()); //Knife
							break;
				case "2":	buyItem(person, weaponsStock[2].getName(), weaponsStock[0].getPrice()); //Dagger
							break;
				case "3":	buyItem(person, weaponsStock[3].getName(), weaponsStock[0].getPrice()); //Mace
							break;
				case "4":	buyItem(person, weaponsStock[4].getName(), weaponsStock[0].getPrice()); //Broken Stick
							break;
				case "9":
				case "exit":
				case "back": browsing = false;
							break;
				default: 
					System.out.println("Invalid input.");
			}
		}	
	}
	
	//Displays weapons then switch statement to handle player choices
	public void browseItems(Character_Class person) throws Exception{
		System.out.println("Items:"); // (Number to Buy) [Price] - [Item]
		browsing = true;
		
		while (browsing == true){   //using placeholder strings for parameters
			displayStock(itemsStock);
			response = input.nextLine();
			switch (response.toString()){
				case "0":	buyItem(person, itemsStock[0].getName(), itemsStock[0].getPrice()); //"Health Potion"
							break;
				case "1":	buyItem(person, itemsStock[1].getName(), itemsStock[1].getPrice()); //"Mana Potion"
							break;
				case "2":	buyItem(person, itemsStock[2].getName(), itemsStock[2].getPrice()); //"Antidote"
							break;
				case "3":	buyItem(person, itemsStock[3].getName(), itemsStock[3].getPrice()); //"Energy Restore"
							break;
				case "4":	buyItem(person, itemsStock[4].getName(), itemsStock[4].getPrice()); //"Burn Repel"
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
	 * Display Stock
	 */
	
	public void displayStock(asdf[] stock){
		System.out.println();
		for(int index = 0; index < weaponsStock.length; index++){
			System.out.println("("+ index +") "+  stock[index].getPrice() + " - "+ stock[index].getName() );
		}
		System.out.println("(9) Back to Store Menu");
	}

	/*
	 * Buy Item
	 */
	public void buyItem(Character_Class person, String item, int price) throws Exception{ //change String item to shopstock or whatever when I figure out how to implement.
		if(person.getMoney() >= price){
			person.setMoney(person.getMoney() - price);
			person.backpack.addToInventory(item, 1);//add item to inventory
			System.out.println("Here's your " + item + ". Anything else");
		//	System.out.println("You bought a " + item + ". Anything else?\n");
		}
		else {
			System.out.println("Not enough gold. \nMaybe try farming a local dungeon. Probably some thieves still around.");
		}
	}
	
	/*
	 * Leave store (exit shopping)
	 */
	
	public void exitStore(){
		currentlyHere = false;
	}
	
	/*
	 * Getters and Setters
	 */
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * JUNK CLASS FOR JUNK OBJECTS FOR JUNK INFORMATION  <-- DELETE AS SOON REAL WEAPONS AND ITEMS ARE MADE
	 */
	
	class asdf {
		private String name; //name
		private int price;   //gold price
		private String type; //item or weapon
		
		asdf(){
		}
		
		//Constructor - 3 accepted arguments
		asdf(String name, int price, String type){
			this.name = name;
			this.price = price;
			this.type = type;
		}
		
		public String getName(){
			return this.name;
		}
		
		public int getPrice(){
			return this.price;
		}
		
		public String getType(){
			return this.type;
		}
		
	}
}
