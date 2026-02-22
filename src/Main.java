 import Quest01.ex00.My_java_journey_first_compilation;
 import Quest01.ex01.My_java_journey_primitive_types;
 import Quest01.ex02.My_java_journey_complex_types;
 import Quest01.ex03.My_java_journey_variadic_parameters;
 import Quest02.ex00.My_java_journey_my_first_string;
 import Quest02.ex01.My_java_journey_my_more_strings;

 import Quest03.ex01.MyFirstClass;
 import Quest03.ex02.My_java_journey_my_instance_variable;
 import Quest03.ex03.My_java_journey_my_instance_static_method;
 import Quest04.ex00.Human;
 import Quest04.ex01.Solution;
 import Quest04.ex02.Executor;
 import refreshing.Ref;


 void main() {

//     Ref.main();
     System.out.println("< ======= Quest01 Start Here ======= >");

     System.out.println("< ======= ex00 ======= >");
//    My_java_journey_first_compilation.main();

     System.out.println("< ======= ex01 ======= >");
//    My_java_journey_primitive_types.main();

     System.out.println("< ======= ex02 ======= >");
//     My_java_journey_complex_types.main();

     System.out.println("< ======= ex03 ======= >");
//     My_java_journey_variadic_parameters.main();

     System.out.println("< ======= Quest02 Start Here ======= >");

     System.out.println("< ======= ex00 ======= >");
//     My_java_journey_my_first_string.main();

     System.out.println("< ======= ex01 ======= >");
//     My_java_journey_my_more_strings.main();

     System.out.println("< ======= ex02 ======= >");
//     System.out.println(Solution.my_java_journey_my_size_string("hello"));

     System.out.println("< ======= ex03 ======= >");
//     System.out.println(Quest02.ex03.Solution.my_java_journey_concat_string("hello", " everyone!")); // using fully qualified class name here since we have the same class name in two packages or more.

     System.out.println("< ======= ex04 ======= >");
//     System.out.println(Quest02.ex04.Solution.my_java_journey_substring("hello",  1 ,  4));

     System.out.println("< ======= ex05 ======= >");
//     System.out.println(Quest02.ex05.Solution.my_java_journey_find_in_string("hello",  'l')); // Return Value: 2


     System.out.println("< ======= Quest03 Start Here ======= >");

     System.out.println("< ======= ex00 ======= >");
//     MyFirstClass my_first_class = new MyFirstClass("John");

     System.out.println("< ======= ex01 ======= >");
/*
     MyFirstClass my_first_class_with_method = new Quest03.ex01.MyFirstClass("John");
     my_first_class_with_method.hello_everybody();
*/

     System.out.println("< ======= ex02 ======= >");
/*
     My_java_journey_my_instance_variable my_class = new My_java_journey_my_instance_variable("John");
    my_class.setName("Jirra");
    String new_name = my_class.getName();
    System.out.println(new_name);
*/

     System.out.println("< ======= ex03 ======= >");
/*
      int static_value = My_java_journey_my_instance_static_method.getValue();
      System.out.println(static_value);
*/
     System.out.println("< ======= Quest04 Start Here ======= >");

     System.out.println("< ======= ex00 ======= >");
//     Human human = new Human("John");

     System.out.println("< ======= ex01 ======= >");
//     Quest04.ex01.Solution.main();

     System.out.println("< ======= ex02 ======= >");

     Executor.main();
 }