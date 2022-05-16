
import java.util.Scanner;

public class part1{
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.print("Enter first value: ");
		int x = s.nextInt();
		System.out.print("Enter second value: ");
		int y =s.nextInt();
		
		try{
				float z= (float)x/y;
				System.out.println(x+" / "+y+" ="+z);
			}
		catch (ArithmeticException e) {
			System.out.println("Exception caught :Denominator cannot be zero.");
		}
		
		
		s.close();
	
	}
}