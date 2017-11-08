package shopping;
import java.util.ArrayList;

public class Inventory{
    private ArrayList<String> backpack = new ArrayList<String>();
    private int backpackSize = 0;

    /**
     * Constructor for Inventory
     * with a default backpack size of 25
     */
    public Inventory(){
        backpackSize = 25;
    }

    /**
     * Constructor for Inventory with ability
     * to set the backpack size
     * @param backpackSize - Inventory size
     */
    public Inventory(int backpackSize){
        this.backpackSize = backpackSize;
    }

    /**
     * Gets the size of the backpack
     * accounting for stacks
     */
    public int sizeOfInventory(){
        int size = 0;
        for(int i=1; i<=backpack.size(); i+=2) {
        	size += Integer.parseInt(backpack.get(i));
        }
        return size;
    }

    /**
     * Increase size of Inventory
     * @param amt - Amount to increase by
     */
    public void increaseInventorySize(int amt) {
        backpackSize += amt;
    }

    /**
     * Use method for items(Potions/boost)
     * @param itemName - Item to use
     */
    public int useItem(String itemName)throws Exception{
        if(backpack.contains(itemName)) {
        	if(itemName.endsWith("Potion")) {
        		if(itemName.startsWith("Health")) {
        			removeFromInventory(itemName); //Remove the item
        			return 20; //HP to be added since HP is handled in the battle system
        		}
        		if(itemName.startsWith("Mana")) {
        			removeFromInventory(itemName); //Remove the item
        			return 20; //Mana to be added
        		}
        	}
			if(itemName.equalsIgnoreCase("Antidote")) {
				removeFromInventory(itemName); //Remove the item
				return 1; //Use in battle system, for heal?
			}
			if(itemName.endsWith("Restore")) {
				if(itemName.startsWith("Energy")) {
					removeFromInventory(itemName); //Remove the item
					return 1; //Use in battle system, for restore energy
				}
			}
			if(itemName.endsWith("Heal")) {
				if(itemName.startsWith("Burn")) {
					removeFromInventory(itemName); //Remove the item
					return 1; //Use in battle system, for heal?
				}
			}
        }
        else {
        	throw new Exception(itemName+" is not in your inventory!");
        }
		return 0;
    }

    /**
     * Method to add items to Inventory
     * @param itemToAdd - Name of the Weapon/Potion to add
     * @param quantity - Amount to add
     * @throws Exception - Cast message inventory full
     */
    public void addToInventory(String itemToAdd, int quantity) throws Exception{
        if((sizeOfInventory() + quantity) <= backpackSize && quantity > 0) {
            if(backpack.contains(itemToAdd)) {
            	int indexOfItem = backpack.indexOf(itemToAdd);
            	int itemStack = Integer.parseInt(backpack.get(indexOfItem+1));
            	backpack.set(Math.addExact(indexOfItem, 1), Integer.toString(Math.addExact(itemStack, quantity)));
            	System.out.println("Added "+quantity+" more "+itemToAdd+" to your backpack successfully!");
            }
            else {
            	backpack.add(itemToAdd);
            	backpack.add(Integer.toString(quantity));
            	System.out.println(itemToAdd+"("+quantity+") was successfully added to your backpack!");
            }
        }
        else{
            throw new Exception("Inventory Is Full!");
        }
    }

    /**
     * Method to remove items from Inventory
     * @param itemToRemove - Item to remove from inventory
     */
    public void removeFromInventory(String itemToRemove){
        for(int i=0; i<backpack.size(); i++) {
            if(backpack.get(i).equalsIgnoreCase(itemToRemove)) {
            	if(Integer.parseInt(backpack.get(i+1)) > 1) {
            		backpack.remove(i+1);
            	}
            	else {
            		backpack.remove(i);
            		backpack.remove(i+1);
            	}
            	System.out.println(itemToRemove+" was successfully removed from backpack!");
            }
        }
    }

    /**
     * Method to view Inventory
     */
    public void viewInventory(){
        int counter = 0;
        if(backpack.size() < 1) {
        	System.out.println("No Items in backpack!\n");
        }
        else {
	        for(int i=0; i<backpack.size(); i+=2){
	            counter++;
	            System.out.println(counter+".) "+backpack.get(i)+"("+backpack.get(i+1)+")");
	            if((i+1) == (backpack.size()-1)) {
	            	System.out.println();
	            }
	        }
        }
    }
}
