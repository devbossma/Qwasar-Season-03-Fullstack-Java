package Quest04.ex00;

public class Mammal {
    public int life;
    public Mammal(){
        this.life = 10;
        System.out.println("Constructor Mammal");
    }

    public int getLife(){
        return this.life;
    }
}
