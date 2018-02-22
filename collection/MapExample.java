package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
		
		public static void main(String args[]) {
	        // HashMap constructor. It takes two arguments in the diamond operator to specify object data types.
	        Map<String, Double> map = new HashMap<String, Double>();
	        
	        // Add elements to the HashMap with the put() method inherited from the Map class.
	        map.put("Ghana Temple", new Double(2004));
	        map.put("Nigeria Temple", new Double(2005));
	        map.put("Utah", new Double(1877));
	        map.put("Paris France Temple", new Double(2017));
	        map.put("Cedar City Utah Temple", new Double(2017));
	        map.put("Provo City Center Temple", new Double(1972));
	        
	        // Display the contents of the HashMap.
	        System.out.println(map + "\n");
	        
	        // Get a set of entries from the HashMap.
	        Set<?> set = map.entrySet();
	        
	        // Get an iterator from the Set.
	        Iterator<?> i = set.iterator();
	        
	        // Display elements of the HashMap, by referencing key and value one at a time.
	        while(i.hasNext()) {
	            @SuppressWarnings("unchecked")
	            Map.Entry<String, Double> entry = (Map.Entry<String, Double>)i.next();
	            System.out.print(entry.getKey() + ": ");
	            System.out.println(entry.getValue());
	        }

	}

}
