package Quest01.ex01;

public class My_java_journey_primitive_types {
    public static void main() {
        /*
        * Primitive types are the most basic data types available within the Java language.
        * There are 8: boolean, byte, char, short, int, long, float, and double.
        * */


        byte var_byte = 30;
        char var_char = 'z';
        short var_short = 30000;
        int var_int = 2000000000;
        long var_long = 9000000000000000000L;
        float var_float = 3.14f;
        double var_double = 0.0;
        boolean var_boolean_true = true;
        boolean var_boolean_false = false;
        String var_string = "";
        System.out.println("Byte -> " + (var_byte + 2));
        System.out.println("Character -> " + var_char);
        System.out.println("Short -> " + (var_short + 2000));
        System.out.println("Integer -> " + var_int);
        System.out.println("Long -> " + var_long);
        System.out.println("Float -> " + var_float);
        System.out.println("Boolean #1 -> " + var_boolean_true);
        System.out.println("Boolean #2 -> " + var_boolean_false);

        int i = Integer.MAX_VALUE;
        System.out.println(i); //2147483647
        i = i - 1;
        System.out.println(i); // 2147483646

    }
}
