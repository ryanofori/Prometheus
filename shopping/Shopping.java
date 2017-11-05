package shopping;

public class Shopping {
	
	public void store(){
		System.out.println("Welcome to the store");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}

}
