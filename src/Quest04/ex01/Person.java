package Quest04.ex01;

public class Person {
    String first_name;
    String last_name;

    Person(String _first_name, String _last_name) {
        this.first_name = _first_name;
        this.last_name  = _last_name;
    }

    String getName() {
        return this.first_name + ' ' + this.last_name;
    }
}