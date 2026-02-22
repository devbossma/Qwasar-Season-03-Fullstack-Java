package Quest05.ex01;

import java.util.Iterator;
import java.util.Vector;

public class Solution {
    public  static void my_java_journey_print_vector(Vector<String> array) {
        Iterator<String> iterator = array.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next(); // Get the current element and advance the iterator
            System.out.println(item);
        }
    }
}
