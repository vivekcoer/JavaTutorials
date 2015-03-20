package interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apttus {
	
   private static String myArr[] = new String[]{"Andrew", "Deepak", "Andrew", "Raj", "Aru", "Aru","Deepak", "Deepak", "Sunil", "Ryan", "Jack"};

   public static void main(String[] args){
	   
	   List<String> myList = new ArrayList<String>();
	   myList = Arrays.asList(myArr);
	   
	   Map<String, Integer> myMap = new HashMap<String, Integer>();
	   
	   for(String str:myArr){
		   if(myMap.get(str)==null){
			   myMap.put(str, 1);
		   }else{
			   myMap.put(str, (myMap.get(str)) + 1);
		   }
	   }
   }
   
}
