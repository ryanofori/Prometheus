package enemy;
/*This class hold the quotes for the enemies during battle. 
 * Currently, it is not yet complete, but over time I will be coming back to add more and removing
 * the not needed ones. */

public class Enemy_Quotes extends Enemy {
	
	/*I have set rand to hold the array of string and be able to
	 * spit out any string from within this method by using the
	 * Math.random() built in method. 
	 * It starts from 0 and goes to 1, meaning, it will only print out 1 quote at a time. 
	 * This same principle applies to the other methods below. */
	
	public void duringBattleQuote(){
	String [] fightingQuote = {"You don't stand a chance against me.",
				 "You really think you can beat me?!" };
	for(int counter=0; counter < 1; counter++){
		int rand = (int) (Math.random() * fightingQuote.length);	 
		System.out.println(fightingQuote[rand]);	
		}
	}
	
	public void dyingQuote(){
		String [] dyingQuote = {"You have done a great amount of damage to my health.","I have a feeling this battle won't end well."
			};	
		for(int counter=0; counter < 1; counter++){
			int rand = (int) (Math.random() * dyingQuote.length);
			System.out.println(dyingQuote[rand]);	
			}
	}
	
	public void deathQuote(){
		String [] deathQuote = {"You may have defeated me this time, but my partners will avenge my death. "};
		for(int counter=0; counter < 1; counter++){
			int rand = (int) (Math.random() * deathQuote.length);
			System.out.println(deathQuote[rand]);	
			}
	}
	
	public void winningQuote(){
		String [] winningQuote = {"I am victorious!"};
		for(int counter=0; counter < 1; counter++){
			int rand = (int) (Math.random() * winningQuote.length);
			System.out.println(winningQuote[rand]);	
			}
	}
}