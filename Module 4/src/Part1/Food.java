package Part1;

public class Food{
	
	 public static synchronized void eat(String name, int resttime){
		
		try {
			System.out.print(name + " begins eating. \n");
			Thread.sleep(resttime);
			
			System.out.print(name+  " finished eating. \n");
			
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		 }
	 }

	
	




