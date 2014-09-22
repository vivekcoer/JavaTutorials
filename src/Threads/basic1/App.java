package Threads.basic1;

public class App {
	
	public static void main(String[] args){
		Thread getTimeOb = new GetTime();
		
		Object ob = new Object();
				
		Runnable getMail = new GetMail(3);		
		
		Thread getMailOb = new Thread(getMail);		
		
		getTimeOb.start();	
		getMailOb.start();
		
	}
}
