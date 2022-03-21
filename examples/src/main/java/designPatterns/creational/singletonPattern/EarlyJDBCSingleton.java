package designPatterns.creational.singletonPattern;

import java.io.Serializable;

public class EarlyJDBCSingleton implements Serializable {
    private static EarlyJDBCSingleton singleton = new EarlyJDBCSingleton();

    private EarlyJDBCSingleton(){}

    public static EarlyJDBCSingleton getSingleton(){
        return singleton;
    }

    public void action(){
        System.out.println("EARLY SINGLETON SET.");
    }

}
