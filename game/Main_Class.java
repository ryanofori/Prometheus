package game;
import story.Story_Mode;
import java.util.Scanner;

public class Main_Class  {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String response;	//Response holds the users String answer. 
		
		Story_Mode Story = new Story_Mode();
		
		/*Here I am asking you which character you would like to be. */
		System.out.println("Are you ready to begin? (Yes/No): ");
		response = input.nextLine();
		
		if(response.equalsIgnoreCase ("Yes")){
			Story.tutorial();;
		}
		else{
			Story.endTutorial();
		}
		input.close();
	}
}