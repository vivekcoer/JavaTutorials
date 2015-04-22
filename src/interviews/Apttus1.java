package interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Apttus1 {
	
	//find out the word which is been repeated most!
	
	private static String myStr[] = {"John", "Joshua" , "Ross", "Joey" , "John", "Dana", "Rachel" , "Joey", "Chandler", "John", "Rachel", "Monica", "Rachel", "Gunther", "John", "Dave", "Phoebe", "Dana", "Ralf", "Peter", "Ralf"};
		
	public static void main(String[] args){
		
		List<String> myList = new ArrayList<String>();
	    myList = Arrays.asList(myStr);
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		String name = "";
		
		for (String item:myList){
			Integer obj = myMap.get(item);
			if(obj!=null){
				myMap.put(item, obj.intValue() + 1);
			}else{
				myMap.put(item, 1);
			}
		}		
		
		System.out.printf("The name that has been most repeated in this array is %s" , name);
	}
}
