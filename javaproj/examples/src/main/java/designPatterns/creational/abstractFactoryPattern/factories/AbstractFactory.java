package designPatterns.creational.abstractFactoryPattern.factories;

import designPatterns.creational.abstractFactoryPattern.banks.Bank;
import designPatterns.creational.abstractFactoryPattern.loans.Loan;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
