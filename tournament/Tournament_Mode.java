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
		System.out.println("Welcome to the Tournament Mode");
		fee = 200; //Fee to be paid to enter the tournament
		
		System.out.println("Pay $"+fee+" to enter the tournament: Yes/No");
		String ans = input.nextLine();
		
		if(player.getMoney() >= fee && ans.equalsIgnoreCase("Yes")) {
			player.setMoney(player.getMoney() - fee);
			System.out.println("You have entered Tournament Mode");
		}
		Battle(player);
//		try{
//			Thread.sleep(1000);
//		}
//		catch(InterruptedException ie){
//			ie.printStackTrace();
//		}
		System.out.println("You have left the tournment mode");		
	}
	public void Battle(Character_Class player) throws Exception
	{
		while(true)
		{
			int ans = 1;
			System.out.println("Do you want to continue? yes(1) no(2)");
			ans = input.nextInt();
			if (ans == 1)
			{
				battle.battleSystem(player, enemy);
				//Enter battle			
			}
			else
				break;
			/*if (0 < 2)
			{
				//create 
				System.out.println("You have " Won or lost point);
			}*/
		}
		//Method for calculating how far you went in tournment mode 
		//and assign won or lose status accordinginly
		//Create a loop counter of how many times the keep going further in the 
		//tournnament
	}
	
	/*
	 * Contributers may begin making methods here for how the Tournament mode should work
	 * 
	 * */

}
