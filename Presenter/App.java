package Presenter;

import Model.*;

import java.util.ArrayList;

public class App {
    Car car = new Car("Car");
    Doll doll = new Doll("Doll");
    Bear bear = new Bear("Bear");
    protected  DrawingMachine dm;
    public App() {
        this.dm = new DrawingMachine();
    }
    public void add(Toy toy){
        this.dm.addToy(toy);
    }
    public void add(ArrayList<Toy> toys){
        this.dm.addToys(toys);
    }
    public void addCar(){
        this.dm.addToy(this.car);
    }
    public void addDoll(){
        this.dm.addToy(this.doll);
    }
    public void addBear(){
        this.dm.addToy(this.bear);
    }
    public void chanceCar(double ch){
        this.car.setChance(ch);
    }
    public void chanceDoll(double ch){
        this.doll.setChance(ch);
    }
    public void chanceBear(double ch){
        this.bear.setChance(ch);
    }
    public void Draw(){
        this.dm.Drawing();
    }
    public Toy Prize(){
        return this.dm.getPrize();
    }
}
