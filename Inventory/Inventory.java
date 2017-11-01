package Inventory;
import java.util.ArrayList;

public class Inventory{
    private ArrayList<String> backpack = new ArrayList<String>;
    private int backpackSize;

    /**
     * Constrcutor for Inventory
     * with a default backpack size of 20
     */
    public Inventory(){
        backpackSize = 20;
    }

    /**
     * Constrcutor for Inventory with ability
     * to set the backpack size
     * @param backpackSize
     */
    public Inventory(int backpackSize){
        this.backpackSize = backpackSize;
    }

    /**
     * Gets the size of the backpack
     */
    public int sizeOfInventory{
        return backpackSize;
        //Will add ability to increase size later on
    }

    /**
     * Method to add items to Inventory
     * @param itemToAdd - Name of the Weapon/Potion to add
     */
    void addToInventory(String itemToAdd){
        if(backpack.size() <= backpackSize) {
            backpack.add(itemToAdd);
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
        for (String item: backpack){
            if(item.equalsIgnoreCase(itemToRemove)){
                backpack.remove(item);
            }
        }
    }

    /**
     * Method to view Inventory
     */
    void viewInventory(){
        int counter = 0;
        for (String item: backpack) {
            count++;
            System.out.println(counter+") "+item);
        }
    }
}