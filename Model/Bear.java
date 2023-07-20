package Model;

public class Bear extends Toy{
    protected double chance = 0.7;
    public Bear(String name) {
        super(name);
    }

    public Bear(String name, int count) {
        super(name, count);
    }
}
