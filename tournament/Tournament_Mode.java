package tournament;
import java.util.Scanner;
import battle_system.Battle_System;

public class Tournament_Mode {
	
	public void fight(){
		System.out.println("Welcome to the Tournament Mode");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
	public void fight(){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Tournament Mode");
		System.out.println("You have enter Tournament Mode");
		int ans = 1;
//		try{
//			Thread.sleep(1000);
//		}
//		catch(InterruptedException ie){
//			ie.printStackTrace();
//		}
		//System.out.println("Do you want to continue? yes(1) no(2)");
		
				
		while(true)
		{
			System.out.println("Do you want to continue? yes(1) no(2)");
			ans = input.nextInt();
			if (ans == 1)
			{
				//Enter battle				
			}
			else
				break;
		}
		System.out.println("You have left the tournment mode");
		
	}
	
	/*
	 * Contributers may begin making methods here for how the Tournament mode should work
	 * 
	 * */

}
