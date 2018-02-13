// This class is an implementation of the List interface in the Java Collections Framework.

package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    
    public static void main (String args[]) {
        // ArrayList constructor.
        List<String> strings = new ArrayList<String>();
        
        // Add elements to list via boolean add() method.
        strings.add("I");
        strings.add("make");
        strings.add("great");
        strings.add("and");
        strings.add("delicious");
        strings.add("meals");
        strings.add("exactly");
        strings.add("Eight to");
        strings.add("Nine");
        strings.add("P.M");

        // Display the size and contents of the list.
        System.out.println("The list is " + strings.size() + " elements long. It's contents are below:\n\n" + strings);
        
        // Modify current list elements via Object set(int index, Object element) method.
        strings.set(0, "Hey");
        strings.set(1, "Kick");
        strings.set(2, "Ready");
        strings.set(3, "Fight");
        strings.set(4, "faint");
        strings.set(5, "anticipate");
        strings.set(6, "hack");
        strings.set(7, "secure");
        strings.set(8, "begin");
        strings.set(9, "laugh");
        
        // Display contents of the list.
        System.out.println("\n\nThis is the new content of the list, after editing the existing elements:\n\n" + strings);
        
        // More documentation and ArrayList methods can be found at: https://docsoracle.com/javase/8/docs/api/java/util/ArrayList.html
    }
}