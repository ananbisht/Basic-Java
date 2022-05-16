import java.util.*;


/* 'Collection' is an interface while 'Collections' is a class. 
 	Collection is used to represent a group of objects as a single unit. 
 	Collections is a utility class which contains various methods. All the methods in this class are of static type. These 
 	predefined methods make it easier for coders as they are able to use the methods instead of having to write it themselves. 
*/
/*
	An interface is an abstract type which determines the  of classes. It contains static constants and abstract methods. 
	It cannot contain any concrete methods. It cannot initiate variables or create objects. All interfaces use the 
	public specifier. While multiple inheritance is not allowed in java, multiple interfaces may be implemented together.
	
	A class is a user defined or predefined blueprint in which objects are created & initiated, and methods may be implemented.
	A class can contain concrete methods.  The specifiers a class may use are public, private, and protected. Multiple 
	classes can not be inherited.
*/

// Sources : Java,Java,Java by R.Morelli & R.Walde   and Geeksforgeeks.org

public class CollectionSort {
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Brandon");
		names.add("Rex");
		names.add("Steve");
		names.add("Tyler");
		names.add("John");
		names.add("Ford");
		names.add("Henry");
		names.add("Adam");
		
		System.out.println("The unordered array of names :- ");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("\n");
		
		
		Collections.sort(names);
		System.out.println("The sorted list :- ");
		for (String name : names) {
			System.out.println(name);
		}
		
		Collections.shuffle(names);
		System.out.println("The list after shuffling :- ");
		for (String name : names) {
			System.out.println(name);
		}
		
		Scanner x =new Scanner(System.in);
		Scanner w =new Scanner(System.in);
		System.out.println("Enter number if searches to perform : ");
		int nos = x.nextInt();
		
		int i=0;
		while (i<nos) {
			i++;
			System.out.println("Enter name to search : ");
			String search = w.nextLine();
			boolean s = names.contains(search);
			
			if (s==true) {
				System.out.println("The arraylist has the name.");
				System.out.println("The name is at position : "+ names.indexOf(search));
				
			}

			else {
				System.out.println("The arraylist doesn't contain the name");
				System.out.println("The name is at position : "+ names.indexOf(search));
			}
			
		}
		
		x.close();
		w.close();
		
		
		// Converting to array and back to list
		
		names.toArray();
		System.out.println("Printing after converting to an array.");
		System.out.println(names);
		
		List<ArrayList<String>> list= Arrays.asList(names);
		System.out.println("Printing after converting back to an list.");
		System.out.println(list);
		
	}
}