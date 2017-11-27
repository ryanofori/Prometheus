package tournament;
import java.util.InputMismatchException;
import java.util.Random;
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
		Stage(player);
		//~Skip fee and go into the welcome to Tournament 
		//~Tell user what game they will play
		//~Ask them how much many they want to give up
		//~(based on what is availble), the user plays the game
		//the user plays game, gamble win = original+ prize
		//gamble lose = orginal
		//the higher the level the harder to win
		//User is forced to go higher in gambling (they have to play money smart)
		/*fee = 200; //Tournament fee
		Pause();
		System.out.println("Pay $"+fee+" to enter the Tournament: Yes/No");
		String ans = input.nextLine();
		
		if(ans.equalsIgnoreCase("Yes")) {
			if(player.getMoney() >= fee) {
				player.setMoney(player.getMoney() - fee);
				System.out.println("You have entered the Tournament");
				//Battle(player);
				
				//After gamble prompt for next level
			}
			else {
				System.out.println("Not enough money!");
			}
		}*/
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
		int round = 0; 
		
		while(true)
		{
			battle.battleSystem(player, enemy);//Enter battle
			enemy = Enemy.randomEnemy(); //Random next enemy
			round++; 
			//player.setTournyRounds(round); 
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
	public void Stage(Character_Class player)
	{
		String ans;
		int stage = 1;
		int choice = 0;
		int withdraw;
		int prize;		
		Random rndm = new Random();
		
		System.out.println("Welcome to coin toss!");
		Pause();
		System.out.println("Bet money and pick between head or tails.");
		Pause();
		System.out.println("If your right you can keep the money and more.");
		Pause();
		System.out.println("If your wrong you lose the money and will have to pay up");
		Pause();
		System.out.println("Good Luck");
		Pause();
		while(true){
		System.out.println("You have $" + player.getMoney());
		Pause();
		System.out.println("How much money do you want to bet?");
		withdraw = input.nextInt();
		while(true){
		if(player.getMoney() <=  withdraw){
			System.out.println("Not enough money! Pick a different value.");
			Pause();
			ans = input.nextLine();
		}
			else
			break;
		}
		player.setMoney(player.getMoney() - withdraw);
		
		System.out.println("You now have $" + player.getMoney());
		Pause();
		//System.out.println("Pick: head or tails (1/2)");
		// Cannot get the thing to loop when user types in anything but 1 and 2
		
			int output = 0;
			if(output != 2 || output != 1){
				System.out.println("2Pick: head or tails (1/2)");
				Pause();
				output = input.nextInt(); 
			}
				else
				break;		
		choice = rndm.nextInt(100);
		//System.out.println(choice);
		System.out.println("Coin flip......");
		Pause();
		if(choice >= Outcome(stage)){
			System.out.println("You win!");
			prize = withdraw + Prize(stage); 
			System.out.println("You have earned: $" + prize);
			player.setMoney(player.getMoney() + prize);
		}
		else{
			System.out.println("You lose");
			prize = withdraw + Prize(stage);
			System.out.println("You have lost: $" + prize);
			}
		//while loop
		System.out.println("Do you want to continue? (y/n)");
		char c = input.next(".").charAt(0);
		if (c == 'y')
		{
			System.out.println("You are currently in stage: " + stage + "\n");
			System.out.println("Would you like to go up a stage? (y/n)");
			c = input.next(".").charAt(0);
			if (c == 'y')
			{
				stage++;
				
			}
			System.out.println("Entering stage: " + stage + "\n");}
		else;
		break;
		
		
		}
	
	/*
	 * Contributers may begin making methods here for how the Tournament mode should work
	 * 
	 * */
			}
	public void Pause()
	{
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
	public int Prize(int stage){
		Random rndm = new Random();
		if(stage == 1)
		{
			return rndm.nextInt(70) + 20;			
		}
		else if (stage == 2)
		{
			return rndm.nextInt(70) + 90;
		}
		else if (stage == 3)
		{
			return rndm.nextInt(70) + 160;
		}
		else if (stage == 4)
		{
			return rndm.nextInt(70) + 230;
		}
		else 
			return rndm.nextInt(70) + 300;		
	}
	public double Outcome(int stage)
	{
		
		if(stage == 1)
		{
			return 20;
		}
		else if (stage == 2)
		{
			return 35;
		}
		else if (stage == 3)
		{
			return 50;
		}
		else if (stage == 4)
		{
			return 65;
		}
		else 
			return 80;
	}	
}

