package Quest03.ex03;

public class My_java_journey_my_instance_static_method {
    private String name;
    private static int value = 42;

    public My_java_journey_my_instance_static_method(String name) {
        this.name = name;
    }

    public void setName(String new_name) {
        this.name = new_name;
    }

    public String getName() {
        return this.name;
    }

    public static int getValue() {
        return value;
    }
}
