package tournament;
import java.util.Scanner;
import battle_system.Battle_System;
import character.Character_Class;
import enemy.Enemy;

public class Tournament_Mode {
	Scanner input = new Scanner(System.in);
	Battle_System battle = new Battle_System();
	private Enemy enemy = Enemy.randomEnemy();
	private int fee = 0;
	
	public void fight(Character_Class player)throws Exception{
		System.out.println("Welcome to Tournament Mode");
		fee = 200; //Tournament fee
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("Pay $"+fee+" to enter the Tournament: Yes/No");
		String ans = input.nextLine();
		
		if(ans.equalsIgnoreCase("Yes")) {
			if(player.getMoney() >= fee) {
				player.setMoney(player.getMoney() - fee);
				System.out.println("You have entered the Tournament");
				Battle(player);
			}
			else {
				System.out.println("Not enough money!");
			}
		}
		System.out.println("Now leaving Tournament Mode\n");		
	}
	/**
	 * Method to enter player into tournament
	 * Currently has infinite loop on purpose until 
	 * reward and tournament battle system is implemented
	 * @param player - User character
	 * @throws Exception
	 */
	public void Battle(Character_Class player) throws Exception
	{
		while(true)
		{
			battle.battleSystem(player, enemy);//Enter battle
			enemy = Enemy.randomEnemy(); //Random next enemy
			/*
			 * Will need a second version of battle system
			 * It must return true if the player wins the battle
			 * False if the player lost
			 * 
			 *  Winning = Continue to next round w/ health fully restored
			 *  Losing = Determine how far & what reward player will be given
			 */
			
		}
		//Method for calculating how far you went in tournament mode 
		//and assign won or lose status accordingly
		//Create a loop counter of how many times the keep going further in the 
		//tournament
	}
	
	/*
	 * Contributers may begin making methods here for how the Tournament mode should work
	 * 
	 * */

}
