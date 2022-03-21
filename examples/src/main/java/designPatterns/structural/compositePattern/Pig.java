package designPatterns.structural.compositePattern;

public class Pig implements Animal{
    private double energy;
    public Pig() {
        energy = 90d;
    }

    @Override
    public void consumeEnergy() {
        energy = 0.75d*energy;
    }

    @Override
    public void drinkWater() {
        energy = 1.01d*energy;
    }

    @Override
    public void eat() {
        energy = 1.05d*energy;
    }

    @Override
    public void sleep() {
        energy = 1.1d* energy;
    }

    @Override
    public void printStatus() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Pig{" +
                "energy=" + energy +
                '}';
    }
}
