package Model;

public class Bear extends Toy{
    protected double chance = 0.7;
    public Bear(String name) {
        super(name);
        super.chance = chance;
    }

    public Bear(String name, int count) {
        super(name, count);
        super.chance = chance;
    }
}
