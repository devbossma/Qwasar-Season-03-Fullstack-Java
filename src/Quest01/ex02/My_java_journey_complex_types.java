package Quest01.ex02;

import java.util.Arrays;

public class My_java_journey_complex_types {
    public static void main() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original array: " + Arrays.toString(array));
        array[1] = 0;
        array[2] = 100;
        array[4] = -50;
        System.out.println("Changed array: " + Arrays.toString(array));
    }
}
