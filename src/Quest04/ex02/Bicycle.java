package Quest04.ex02;

public class Bicycle implements Vehicle
{
    private int gear;
    private int speed;
    public Bicycle(){
        this.gear = 0;
        this.speed = 0;
    }
    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedUp(int speed) {
        this.speed = speed;
    }

    @Override
    public void applyBrakes(int _break) {
        this.speed = this.speed - _break;
    }

    public void printStates(){
        System.out.println("speed: " + this.speed + " gear: " + this.gear);
    }
}
