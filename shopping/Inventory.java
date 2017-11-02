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
    int sizeOfInventory(){
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
    void increaseInventorySize(int amt) {
        backpackSize += amt;
    }

    /**
     * Use method for items
     * @param itemName
     */
    void useItem(String itemName){
        //Use function for items/weapons
        //Not 100% sure if this is a needed function
        //Left blank until answer received
    }

    /**
     * Method to add items to Inventory
     * @param itemToAdd - Name of the Weapon/Potion to add
     * @throws Exception - Cast message inventory full
     */
    void addToInventory(String itemToAdd, int quantity) throws Exception{
        if((sizeOfInventory() + quantity) <= backpackSize && quantity > 0) {
            backpack.add(itemToAdd);
            backpack.add(Integer.toString(quantity));
            System.out.println(itemToAdd+"("+quantity+") was successfully added to your backpack!");
        }
        else{
            throw new Exception("Inventory Is Full!");
        }
    }

    /**
     * Method to remove items from Inventory
     * @param itemToRemove
     */
    void removeFromInventory(String itemToRemove){
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
    void viewInventory(){
        int counter = 0;
        for(int i=0; i<backpack.size(); i+=2){
            counter++;
            System.out.println(counter+") "+backpack.get(i)+"("+backpack.get(i+1)+")");
        }
    }
}
