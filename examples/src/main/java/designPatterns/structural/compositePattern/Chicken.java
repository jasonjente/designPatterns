package designPatterns.structural.compositePattern;

public class Chicken implements Animal {
    private double energy;
    public Chicken() {
        energy = 45d;
    }

    @Override
    public void consumeEnergy() {
        energy = 0.25d*energy;
    }

    @Override
    public void drinkWater() {
        energy = 1.1d*energy;
    }

    @Override
    public void eat() {
        energy = 1.5d*energy;
    }

    @Override
    public void sleep() {
        energy = 1.75d* energy;
    }

    @Override
    public void printStatus() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "energy=" + energy +
                '}';
    }
}
