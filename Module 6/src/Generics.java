import java.util.Arrays;

public class Generics{
	
	public static <T,V> int position ( T[] array, V search) {
		int index;
		index =  Arrays.binarySearch(array, search);
		
		return index;
		
		
	}
		

}

