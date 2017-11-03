package game;
import story.Story_Mode;
import tournament.Tournament_Mode;
import shopping.Shopping;
import java.util.Scanner;

public class Main_Class  {
	public static void main(String [] args) throws Exception{
		Scanner input = new Scanner(System.in);
		int response = 0;
		
		/*
		 * There are 3 modes (Story Mode, Tournament and Shopping)
		 * Have the user select which mode he/she would like to enter
		 * 
		 * */
		
		Story_Mode story = new Story_Mode();
		Tournament_Mode tournament = new Tournament_Mode();
		Shopping shopping = new Shopping();
		
		/*Here I am asking you which character you would like to be. */
		while (true){
			System.out.println("Please select a mode: Story Mode(1) | Shopping(2) | Tournament(3) | Exit(4)");
			response = input.nextInt();
			if(response == 1){
				story.tutorial();
			}
			else if(response == 2){
			    shopping.store();
		    }
		    else if(response == 3){
			    tournament.fight();
		    }
		    else if(response == 4){
			    System.out.println("Thanks for playing");
			    break;
		    }
		    else{
			    System.out.println("Please enter a valid response");
		    }
		}
		input.close();
	}
}