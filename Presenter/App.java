package Presenter;

import Model.*;

import java.util.ArrayList;

public class App {
    protected  DrawingMachine dm;
    public App(){
        this.dm = new DrawingMachine();
    }
    public void add(Toy toy){
        this.dm.addToy(toy);
    }
    public void add(ArrayList<Toy> toys){
        this.dm.addToys(toys);
    }
    public void addCar(){
        Car car = new Car("Car");
        this.dm.addToy(car);
    }
    public void addDoll(){
        Doll doll = new Doll("Doll");
        this.dm.addToy(doll);
    }
    public void addBear(){
        Bear bear = new Bear("Doll");
        this.dm.addToy(bear);
    }
    public void Draw(){
        this.dm.Drawing();
    }
    public Toy Prize(){
        return this.dm.getPrize();
    }
}
