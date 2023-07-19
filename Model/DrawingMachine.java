package Model;

import java.util.ArrayList;

public class DrawingMachine {
    private static int ID = 0;
    protected int id = 0;
    protected ArrayList<Toy> list_toys = new ArrayList<Toy> ();
    protected ArrayList<Toy> prize_toys = new ArrayList<Toy> ();

    public DrawingMachine (Toy toy){
        this.list_toys.add(toy);
        this.id = ID++;
    }
    public DrawingMachine (ArrayList<Toy> toys){
        this.list_toys = toys;
        this.id = ID++;
    }

    public void Drawing(){
        double maxChance = 0;
        Toy prize = null;
        for (Toy toy:this.list_toys) {
            if (toy.getChance() > maxChance){
                maxChance = toy.getChance();
                prize = toy;
            }
        }
        this.prize_toys.add(prize);
        this.list_toys.remove(prize);
    }
}
