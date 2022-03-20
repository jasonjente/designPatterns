package designPatterns.creational.abstractFactoryPattern.banks;

public class ABank implements Bank {
    private final String name;

    public ABank(String name) {
        this.name = name;
    }

    @Override
    public String getBankName() {
        return name;
    }
}
