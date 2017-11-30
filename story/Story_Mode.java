package story;
import java.util.Scanner;
import battle_system.Battle_System;
import character.*;
import enemy.*;
public class Story_Mode {
	
	static Scanner input = new Scanner(System.in);
	Battle_System battle = new Battle_System();

	
	static int number,health, place; //This controls the Scanner options. 
	String response; //These control the String versions of the scanner options. 
	static String response2, speak, speak2,speak3;
	
	/*
	 * This is the tutorial section of the story mode
	 * Any contributers to the story mode are allowed to expand the story past the tutorial
	 * 
	 * */
	
	
	/* [Random Enemy Generator]
	 * The purpose of the random enemy generator is for testing/functionality purposes only.
	 * It will not be used in the final version of the game. 
	 * 
	 * */
	Enemy enemy = Enemy.randomEnemy(); //Generates a random enemy
	
	public void tutorial(Character_Class player) throws Exception{
		System.out.println("A quick simulated battle is about to commence. ");
		System.out.println("Please pay attention as to what's going on. ");
		System.out.println("Here are 5 free levels!");
		player.levelUp(1000);
		battle.battleSystem(player,enemy); //Starts the battle class.
		tutorial2(player); 
		}
	
	/*the beginning of the 2nd tutorial */
	private void tutorial2(Character_Class player) throws Exception{
		System.out.println("As you can see, the battle system allows for you to choose your own attacks.\n");
		System.out.println("This is how all of your battles will take place.\n");
		try {
		       Thread.sleep(2000);	//Sleep timer of 2 seconds. 
		   }
		   catch (InterruptedException ie) {
		     ie.printStackTrace();
		   }
		System.out.println("Please Press Enter to Continue");
		response = input.nextLine();
		System.out.println("Are you ready to move forward? (Yes/No): ");
		response = input.nextLine();
		if(response.equalsIgnoreCase ("Yes")){
			tutorial3(player);
		}
		else if (response.equalsIgnoreCase("No")){
			endTutorial(player);	
		}
	}
	/*End of the 2nd part of the tutorial.*/
	
	/*Beginning the third part of the tutorial*/
	private void tutorial3(Character_Class player) throws Exception{
		String user;
		System.out.println("What will you name your character?");
		response2 = input.nextLine();
		user = response2;
		System.out.println("Hello! "+ user);
		System.out.println("You're about to enter a world full of adventure.");
		System.out.println("Shall I remind you again of your character choice? (Yes/No)");
		response2 = input.nextLine();
		if(response2.equalsIgnoreCase("Yes")){
			player.getSpeak();
			System.out.print("I have: ");
			player.getHealth();
			endTutorial(player);
			}
		else if(response2.equalsIgnoreCase("No")){
			System.out.println("Good Deal then!");
			System.out.println("This concludes this portion of the game. ");
			endTutorial(player);
		}
	}
	
	public void endTutorial(Character_Class player) throws Exception{
		Introduction(player);
	} 
	
	public void endStory(){
		System.out.println("Thanks for playing! ");
	}
	
	/*
	 * This concludes the tutorial session of the game. 
	 * Contributors can add new story elements below this comment section
	 * 
	 * */
	public void Introduction(Character_Class player) throws Exception{
		String user;
		System.out.println("What will you name your character?");
		response = input.nextLine();
		user = response;
		System.out.println("Hello! "+ user);
		System.out.println("Welcome to Prometheus! Are you ready for an adventure?");
		try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		System.out.println("During your journey, you will encounter 9 enemies in 5 different settings.");
		System.out.println("The 5 places you will battle will be city, forest, lake, mountain, and desert and there will be enemies in each.");	
		try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		System.out.println("If you shall lose any of these battles, it will result in GAME OVER.");
		System.out.println("If you win all of your battles, you will be rewarded with a large monetary prize that you may use to buy weapons and potions to be used in the tournament.");
		try{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		System.out.println("Are you ready to begin? (Yes/No)");
		response2 = input.nextLine();
		if(response2.equalsIgnoreCase("Yes")){
			chapter1(player);
		}
		else if (response2.equalsIgnoreCase("No")){
			endStory();
		}	
	}
  
	public void chapter1(Character_Class player) throws Exception {
		System.out.println("Welcome to the world of Prometheus!.");
		System.out.println("You are traveling down a road heading to the city and you come across a bridge leading over a river, there lives a troll that controls of the bridge that leads to a city. ");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("He is such a short ugly fellow, but seemed to be strong. His hair is curly, brown, and often is mistaken as a mop. ");
		System.out.println("As you were walking to the city, you approach a sleeping troll, and you happened to awaken him. ");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Every time someone tried to cross the bridge, the troll comes closer and closer and he jumps out in front, cross his arms and demands money ");
		System.out.println("He repeatedly says, Pay me gold and me let you pass. If you do not pay, he shoves you and says hell take what he wants. ");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("There are weapons hidden on each side of the bridge but it is going to take bravery to fight off the troll..");
		System.out.println("A storm is brewing overhead as you pull your rusty axe free.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Once you defeat the troll, you continue across the bridge and head into the city. ");
		System.out.println("You find the local inn and you ask for a room..");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("The innkeeper agrees and points you in the direction of the open room. ");
	System.out.println("You ask for some food, something simple, and take it back to your room to eat and sleep. ");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		chapter2(player);
	}

		public void chapter2(Character_Class player) throws Exception {
			System.out.println("Congratulations!.");
			System.out.println("you have made it to battle two where you will be battling within a greenery full forest.");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("Within this deep dark forest, you are looking for nourishments for yourself so you can make sure you have enough energy during your journey ");
			System.out.println("Searching the forest, you find this old creepy cabin ");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("decide to go into it, and find yourself so much food.");
			System.out.println("You grab all the food but during this you notice a Halfling hoovering you. ");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("He asks you why are you taking my food, who are you ");
			System.out.println("You answer by saying I am sorry, I am so hungry);	");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println(".I just fought a troll under a bridge within Prometheus, I need energy, I am weak! ");
			System.out.println(".This Halfling has no pity for you..");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println(". He challenges you into a battle for entering his property without permission. ");
		System.out.println("During that battle, you have seemed to defeat him because he has no strength compared to you. ");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			chapter3(player);
		}
			
public void chapter3(Character_Class player) throws Exception {
		System.out.println("As you continue along your journey, you are becoming very exhausted from traveling thus far.");
		System.out.println("You start looking for somewhere to take a break.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Walking on for miles and miles, you were losing hope of finding a location that meet your needs.");
		System.out.println("Then you finally spotted the perfect place.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("There it was a huge crystal blue lake at the edge of the woods and mountains off in the distance.");
		System.out.println("You decided to set up camp for the time being.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("After eating a hearty meal, you are sleepy so you take a nap.");
		System.out.println("When you awake, the sun is starting to set and an eerie fog is rolling in over the lake.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("At first you think nothing of it, but as the fog thickens a figure appears in the middle of the lake.");
		System.out.println("Being curious as to find out what seemed to come out of thin air, you took a boat out.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("About the time you get there, it has disappeared.");
		System.out.println("You decide to wait and see if it shows back up.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("After a few minutes, you turn around and there it is.");
		System.out.println("It is a very scaly siren ready to attack and eat you.");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		battle.battleSystem(player, enemy);  //Battle Siren
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Once the siren is defeated, you go back to the camp.");
		System.out.println("Upon arriving back, it is getting very dark so you decide to stay put for the night.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("The next morning, you are awoken by the chirping of the birds at the crack of dawn.");
		System.out.println("You pack your things and start heading for the mountain range.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("For most of the day you traveled taking in the scenery of the meadows and towns along the way with some breaks for eating and a little bit of rest.");
		System.out.println("At dusk you arrive at a meadow right before the base of the mountain range and decide to set up camp for the night.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("As you are falling asleep watching the stars, you notice that some clouds are starting to fill the sky.");
		System.out.println("Several minutes later, you have fallen fast asleep.");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		chapter4(player);
	}
	
	public void chapter4(Character_Class player) throws Exception{
		System.out.println("You wake up to it being a very dark, gloomy day.");
		System.out.println("The sky is filled with black clouds.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Not knowing what the day may hold, you decide to start your trek through the mountain range.");
		System.out.println("The trails at beginning of the climb were wide and well-defined, but as you continued they became small and rugged.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("All of a sudden it starts to rain, but you decide to trudge on.");
		System.out.println("You continue on for a few hours.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Then, it starts pouring rain, greatly decreasing your visibility.");
		System.out.println("There is a cave right up ahead off the trail.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Being the best option, you decide to take shelter in the cave until the rain stops or slackens off enough.");
		System.out.println("A very bright streak of lightning strikes several feet for the cave entrance.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("The lightning is immediately followed by super loud, booming thunder.");
		System.out.println("Suspecting the cave of being part of a secret passage network you start to explore further in.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("You are finding human bones and where something has been living.");
		System.out.println("From what you can gather about your surroundings, you assume that it must be a Giant living in this cave.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Then out of nowhere, you are grabbed by a humongous hand.");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		battle.battleSystem(player, enemy); //Battle Giant
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Fearing that there could more, you decide to leave the cave and continue toward the top of the mountain range.");
		System.out.println("Luckily, the rain had slowed down to a drizzle at this point.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("For the next several hours, you hike till you finally reach the top.");
		System.out.println("Once you reached the top, night was upon you.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("After the day you had you decide to stop and get some sleep.");
		System.out.println("You wake up to the sun shining bright.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("There is a desert at the bottom of the mountain range.");
		System.out.println("Since the weather is better, you decide to get an early start on your descent.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("About midday you stop halfway down to eat lunch.");
		System.out.println("While eating you feel like you are being watched but don't see anyone or anything.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Right as you are about to leave, you are surprise attacked by a grunt.");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		battle.battleSystem(player, enemy); //Battle Grunt
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("After defeating the grunt, you continued down the mountain range.");
		System.out.println("Several hours later you finally reach where the mountain range meets the desert.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("The sun was setting so you set up camp for the night.");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		Chapter5(player);
	}
  
  public void Chapter5(Character_Class player)throws Exception{
		System.out.println("Congratulations on making it to the last location!");
		System.out.println("You are woken by the sweltering heat beating down on your face.");
		try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		System.out.println("You have entered the desert. The only thing seen for miles is sand and one lonely pyramid.");
		System.out.println("The heat is almost too much to bear and the sunlight makes your eyes squint.");
		System.out.println("As you explore this wasteland, you encounter a large, sand-colored scorpion!");
		try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		Enemy_Scorpion scorpion = new Enemy_Scorpion();
		battle.battleSystem(player, scorpion);
		System.out.println("After defeating the scorpion, you coninue on your journey.");
		System.out.println("You continue through the desert as you see a small pyramid in the distance.");
		try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		System.out.println("You walk for what seems like a lifetime. Your feet begin to ache.");
		System.out.println("When you finally reach the pyramid you realize it was a lot bigger than you thought.");
		System.out.println("As you look up at the massive pyramid, the wind begins to blow and sand begins to whip around you.");
		try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		System.out.println("As the sand begins to setle, you notice a shadow through the haze.");
		System.out.println("When the sand finally clears your vision, you see a Necromancer ready to battle!");
		try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		Enemy_Necromancer necro = new Enemy_Necromancer();
		battle.battleSystem(player, necro);
		System.out.println("Now that you have defeated the Necromancer, you have completed your journey!");
		System.out.println("Congratulations!!");
		endStory();
  }
}
