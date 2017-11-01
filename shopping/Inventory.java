package shopping;
import java.util.ArrayList;
import java.util.Iterator;

public class Inventory{
    private ArrayList<String> backpack = new ArrayList<String>;
    private ArrayList<int> itemQuantity = new ArratList<int>;
    private int backpackSize;
    private Iterator bkIt = backpack.iterator();
    private Iterator quanIt = itemQuantity.iterator();

    /**
     * Constrcutor for Inventory
     * with a default backpack size of 25
     */
    public Inventory(){
        backpackSize = 25;
    }

    /**
     * Constrcutor for Inventory with ability
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
        for(int i=0; i<=itemQuantity.size(); i++) {
            size += itemQuantity.get(i);
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
        //Not 100% sure if this is a needef function
        //Left blank until answer received
    }

    /**
     * Method to add items to Inventory
     * @param itemToAdd - Name of the Weapon/Potion to add
     */
    void addToInventory(String itemToAdd, int quantity){
        if((sizeOfInventory() + quantity) <= backpackSize && quantity > 0) {
            backpack.add(itemToAdd);
            itemQuantity.add(quantity);
            System.out.println(itemToAdd+" was successfully added to your backpack!");
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
        for(int i=0; i<=backpack.size(); i++)
            if(backpack.get(i).equalsIgnoreCase(itemToRemove)){
                backpack.remove(i);
                itemQuantity.remove(i);
                System.out.println(itemToRemove+" was successfully removed form backpack!");
            }
        }
    }

    /**
     * Method to view Inventory
     */
    void viewInventory(){
        int counter = 0;
        while(bkIt.hasNext() && quanIt.hasNext()){
            counter++;
            System.out.println(counter+") "+bkIt.next()+"("+quanIt.next()+")");
        }
    }
}