package tournament;
import java.util.Scanner;
import battle_system.Battle_System;
import character.Character_Class;
import character.Character_Class;;

public class Tournament_Mode {
	Scanner input = new Scanner(System.in);
	Character_Class health = new Character_Class();
	Character_Class name = new Character_Class();
	Character_Class defence = new Character_Class();
	public void fight(){		
		System.out.println("Welcome to the Tournament Mode");
		while(true)
		{
			System.out.println("Pay " /*$*/ + "to enter the tournament");
			break;
		}
		System.out.println("You have enter Tournament Mode");
		//System.out.println(name.getName());
		
		System.out.println("Health: " + health.getHealth());
		System.out.println("Defence: " + defence.getDefense());
		Battle();
//		try{
//			Thread.sleep(1000);
//		}
//		catch(InterruptedException ie){
//			ie.printStackTrace();
//		}
		System.out.println("You have left the tournment mode");		
	}
	public void Battle()
	{
		while(true)
		{
			int ans = 1;
			System.out.println("Do you want to continue? yes(1) no(2)");
			ans = input.nextInt();
			if (ans == 1)
			{
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
