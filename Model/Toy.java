package Model;

abstract public class Toy {
    private static int ID = 0;
    protected int id = 0;
    protected String name;
    protected int count;
    protected double chance = 0.5;

    public Toy(String name){
        this.name = name;
        this.count = 1;
        this.id = ID++;
    }
    public Toy(String name, int count){
        this(name);
        this.count = count;
    }

    public double getChance() {
        return chance;
    }

    public void setChance(double chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return "Toy " + name + ", count=" + count;
    }
}
