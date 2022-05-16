

public class Part1 extends Generics{
	
	public static void main(String[] args) {
		
// String array search
		
		String[] arraystr = { "Brandon", "Rex", "Steve", "Ford", "Adam" };
		String searchname = "Steve";
		int q = position(arraystr, searchname);
		
		System.out.printf("Array : ");
		for (String element : arraystr) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.printf("Search for : ");
		System.out.print(searchname);
		System.out.println();
		if (q==-1) {
			System.out.println("Searched object is not in the array.");
			System.out.println();
		}
		else {
			System.out.println("Searched object is at index position : " + q);
			System.out.println();
		}
		
		
// Double array search
		
		Double[] arraydub = { 2.0, 3.5, 4.7, 2.9 };
		Double searchdub = 3.5;
		int q1 = position(arraydub, searchdub);
				
		System.out.printf("Array : ");
		for (Double element : arraydub) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.printf("Search for : ");
		System.out.print(searchdub);
		System.out.println();
		if (q1==-1) {
			System.out.println("Searched object is not in the array.");
			System.out.println();
		}
		else {
			System.out.println("Searched object is at index position : " + q1);
			System.out.println();
		}
		
		
		
// integer array search
		
		Integer[] arrayint = { 1, 2, 3, 4, 5, 6, 7};
		Integer searchint = 4;
		int q2 = position(arrayint, searchint);

		System.out.printf("Array : ");
		for (int element : arrayint) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.printf("Search for : ");
		System.out.print(searchint);
		System.out.println();
		if (q2==-1) {
			System.out.println("Searched object is not in the array.");
			System.out.println();
		}
		else {
			System.out.println("Searched object is at index position : " + q2);
			System.out.println();
		}
		
				
		// PART 2
			
		
		
	}




}
