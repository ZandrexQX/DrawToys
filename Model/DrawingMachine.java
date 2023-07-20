package Model;

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class DrawingMachine {
    private static int ID = 0;
    protected int id = 0;
    protected ArrayList<Toy> list_toys = new ArrayList<Toy> ();
    protected Queue<Toy> prize_toys = new LinkedList<Toy>() {
    };

    public DrawingMachine (){
        this.id = ID++;
    }
    public DrawingMachine (Toy toy){
        this.list_toys.add(toy);
        this.id = ID++;
    }
    public DrawingMachine (ArrayList<Toy> toys){
        this.list_toys = toys;
        this.id = ID++;
    }

    public void Drawing(){
        Random r = new Random();
        double maxChance = 0;
        Toy prize = null;
        for (Toy toy:this.list_toys) {
            // добавить рандом
            double chance = toy.getChance()* r.nextInt(100);
            if (chance  > maxChance){
                maxChance = chance;
                prize = toy;
            }
        }
        this.prize_toys.add(prize);
        this.list_toys.remove(prize);
    }
    public Toy getPrize(){
        Toy prize = this.prize_toys.remove();
        String path = "output.txt";
        try (FileWriter fileWriter = new FileWriter(path, StandardCharsets.UTF_8)) {
            fileWriter.append("Prize: " + prize);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prize;
    }
    public void addToy(Toy toy){
        this.list_toys.add(toy);
    }
    public void addToys(ArrayList<Toy> toys){
        this.list_toys.addAll(toys);
    }
}
