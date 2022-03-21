package designPatterns.structural.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Animal{
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void exhaust(){
        for(Animal animal:animals){
            animal.consumeEnergy();
            animal.consumeEnergy();
            animal.consumeEnergy();
            animal.consumeEnergy();
        }
    }
    public void slaughter(){
       animals.clear();
    }
    public Animal removeAnimal(Animal animal){
        animals.remove(animal);
        return animal;
    }
    @Override
    public void consumeEnergy() {
        for(Animal animal:animals){
            printStatus();
            animal.consumeEnergy();
            printStatus();
        }
    }

    @Override
    public void drinkWater() {
        for(Animal animal:animals){
            printStatus();
            animal.drinkWater();
            printStatus();
        }
    }

    @Override
    public void eat() {
        for(Animal animal:animals){
            printStatus();
            animal.eat();
            printStatus();
        }
    }

    @Override
    public void sleep() {
        for(Animal animal:animals){
            printStatus();
            animal.sleep();
            printStatus();
        }
    }

    @Override
    public void printStatus() {
        System.out.println(this.toString());
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Animal animal:animals){
            sb.append(animal.toString()+"\n");
        }
        return sb.toString();
    }
}
