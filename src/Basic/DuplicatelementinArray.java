package Basic;

import java.util.HashMap;

public class DuplicatelementinArray {

	public static void main(String[] args) {
		
		String names[]={"Ankur","Hero","Arun","Ankur","Hero"};
		  HashMap<String, Integer> map = new HashMap<>();
		  for (String ch : names) {
		   if (map.containsKey(ch)) {
		    int val = map.get(ch);
		    map.put(ch, val + 1);
		   } else {
		    map.put(ch, 1);
		   }
		  }
		  System.out.println(map);
		 }
		


}
