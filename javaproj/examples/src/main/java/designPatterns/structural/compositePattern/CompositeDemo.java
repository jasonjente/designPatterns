package designPatterns.structural.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeDemo {
    public static void main(String[] args) {
        Farm farm = new Farm();
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cow());
        animals.add(new Cow());
        animals.add(new Cow());
        animals.add(new Chicken());
        animals.add(new Chicken());
        animals.add(new Chicken());
        animals.add(new Pig());
        animals.add(new Pig());
        animals.add(new Pig());
        farm.setAnimals(animals);

        farm.printStatus();

        farm.eat();
        farm.printStatus();
        farm.sleep();
        farm.printStatus();
        farm.drinkWater();
        farm.printStatus();

        farm.exhaust();
        farm.printStatus();
        farm.slaughter();
        farm.printStatus();
    }
}
