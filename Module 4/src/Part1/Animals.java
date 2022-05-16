package Part1;

public class Animals implements Runnable{	
	private String name;
	private int position;
	private int speed;
	private int restMax;
	
	
	private static boolean raceover = false;
	int resttime;

	
	
	
	public Animals (String name, int speed, int restMax,int resttime) {
		this.name=name;
		this.speed=speed;
		this.restMax=restMax;
		this.position=0;
		this.resttime=resttime;
	}
	
	
	
	public void run() {
		int finish_position=120;
		
		while (this.position <= finish_position && !raceover) {
			if (this.position >= finish_position) {
				raceover = true;
				System.out.println(this.name + " wins the race!!!");
				break;
			}
			System.out.println(this.name + " is at :" + this.position + " yards");
			
			try{
				if (this.resttime<=this.restMax) {
					this.position = this.position + this.speed;
					System.out.println("Current position of " + this.name + ":" + this.position);
					Food.eat(this.name, this.resttime);
					
					
				}
				else
					System.out.println("Sleep time is over the max period allowed for "+ this.name);
			}
			catch (Exception e){
				e.printStackTrace();
			}
			
			
			
		}
	}
	

	public static void main(String[] args) {
		 
		 Animals h= new Animals("Hare", 9, 220, 150);
		 Thread hare = new Thread(h);
		 hare.setDaemon(false);
		

		 Animals t= new Animals("Tortoise", 5, 165, 60);
		 Thread tortoise = new Thread(t);
		 tortoise.setDaemon(false);
		 
		 
		 hare.start();
		 tortoise.start();
		 
		
			 

		

	}	
}

