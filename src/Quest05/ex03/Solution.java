package Quest05.ex03;

import java.util.*;

public class Solution {
    public  static void my_java_journey_print_string_linkedlist(LinkedList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
