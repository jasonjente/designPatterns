package designPatterns.creational.abstractFactoryPattern.banks;

public class BBank implements Bank {
    private final String name;

    public BBank(String name) {
        this.name = name;
    }

    @Override
    public String getBankName() {
        return null;
    }
}
