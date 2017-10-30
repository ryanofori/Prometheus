package tournament;

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

}
