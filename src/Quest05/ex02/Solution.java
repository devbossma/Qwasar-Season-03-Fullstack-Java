package Quest05.ex02;

import java.util.*;

public class Solution {
    public  static void my_java_journey_print_int_list(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int item = iterator.next(); // Get the current element and advance the iterator
            System.out.println(item);
        }
    }
}