package refreshing;

import java.util.Scanner;

public class Ref {
    public  static void main() {
        scan();
    }

    public static void scan() {
        // Reading User's Input.
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Your name: ");
//
//        // Reading Strings:
//        String name = input.nextLine();
//        System.out.println(name + " is Your Name?");
//        String confirmedName = input.nextLine();
//        if (confirmedName.equals("yes")){
//            System.out.println("Hello " + name+ "!");
//        }else {
//            System.out.println("Hello!");
//        }
//
//        // Reading Int values:
//
//        System.out.print("Enter Your age: ");
//        int age = input.nextInt();
//        System.out.println("Age: " + age);
//
//        System.out.print("enter a byt from -128 to 127: ");
//        byte gender = input.nextByte(); // accepts range [-128..127]
//        System.out.println(gender);
        System.out.print("Enter Your age: ");
        int age = input.nextInt();
        input.nextLine(); // storing the rtl caused by enter button when typing int values;

        System.out.println("Age: " + age);
        System.out.print("Enter Your name: ");
        String name = input.nextLine();
        System.out.println("Your name: "+ name);



        input.close();
    }
}
