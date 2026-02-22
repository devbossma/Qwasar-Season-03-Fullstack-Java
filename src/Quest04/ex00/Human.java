package Quest04.ex00;

public class Human extends  Mammal {
    public String name;
    public Human(String name){
        System.out.println("Constructor Human");
        this.name = name;
        this.life = 100;
    }

    public String getName(){
        return this.name;
    }
}
