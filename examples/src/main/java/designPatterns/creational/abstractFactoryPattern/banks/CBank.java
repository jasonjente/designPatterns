package designPatterns.creational.abstractFactoryPattern.banks;

public class CBank implements Bank {
    private final String name;

    public CBank(String name) {
        this.name = name;
    }

    @Override
    public String getBankName() {
        return null;
    }
}
