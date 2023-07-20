package Model;

public class Car extends Toy{
    protected double chance = 0.2;

    public Car(String name, int count) {
        super(name, count);
        super.chance = chance;
    }
    public Car(String name) {
        super(name);
        super.chance = chance;
    }

}
