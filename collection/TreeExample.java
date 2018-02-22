package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeExample {

	public static void main(String[] args) {
		// TreeMap constructor.
        Map<Double, String> rank = new TreeMap<Double, String>();
        
        // Add elements to the TreeMap via the put() method inherited from the Map class.
        rank.put(new Double(15), "Yet to be called");
        rank.put(new Double(14), "Yet to be called");
        rank.put(new Double(13), "Dale G. Renlund");
        rank.put(new Double(12), "Gary E. Stevenson");
        rank.put(new Double(11), "Ronald A. Rasband");
        rank.put(new Double(10), "Neil L. Andersen");
        rank.put(new Double(9), "D. Todd Christofferson");
        rank.put(new Double(8), "Quentin L. Cook");
        rank.put(new Double(7), "David A. Bednar");
        rank.put(new Double(6), "Dieter F. Uchtdorf");
        rank.put(new Double(5), "Jeffrey R. Holland");
        rank.put(new Double(4), "M. Russell Ballard");
        rank.put(new Double(3), "Henry B. Eyring");
        rank.put(new Double(2), "Dallin H. Oaks");
        rank.put(new Double(1), "Russell M. Nelson");
        
        // Display contents of the TreeMap.
        System.out.println(rank + "\n");
        
        // Get a set of entries from the TreeMap.
        Set<?> set = rank.entrySet();
        
        // Get an iterator from the Set.
        Iterator<?> i = set.iterator();
        
        // Display elements of the TreeMap, by referencing key and value one at a time.
        while(i.hasNext()) {
            @SuppressWarnings("unchecked")
            Map.Entry<Double, String> entry = (Map.Entry<Double, String>)i.next();
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }

	}

}
