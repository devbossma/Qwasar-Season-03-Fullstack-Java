package Quest01.ex03;

public class My_java_journey_variadic_parameters {
    /*
     functions print()
    */

    public static void print(boolean value) {
        System.out.print(value);
    }

    public static void print(int value) {
        System.out.print(value);
    }

    public static void print(float value) {
        System.out.print(value);
    }

    public static void print(char value) {
        System.out.print(value);
    }

    public static void main() {
        int four = 4;
        char sup = '>';
        float pi_value = 3.14f;
        boolean var_true = true;
        char new_line = '\n';

        System.out.print("if (Pi == ");
        print(pi_value);
        print(')');
        System.out.print(" then ");
        print(four);
        print(' ');
        print(sup);
        System.out.print(" Pi is ");
        print(var_true);
        print('.');
        print(new_line);
    }
}
