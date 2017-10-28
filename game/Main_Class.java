package game;
import java.util.Scanner;
import story.Story_Mode;
public class Main_Class  {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String response;	//Response holds the users String answer. 
		
		Story_Mode Story = new Story_Mode();	//The start and end of the story_Method  
		
		/*Here I am asking you which character you would like to be. */
		System.out.println("Are you ready to begin? (Yes/No): ");
		response = input.nextLine();
		
		if(response.equalsIgnoreCase ("Yes")){
			Story.story();
		}
		else{
			Story.endStory();
		}
		input.close();
	}
}