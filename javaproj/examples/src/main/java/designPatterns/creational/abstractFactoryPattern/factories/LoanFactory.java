package designPatterns.creational.abstractFactoryPattern.factories;

import designPatterns.creational.abstractFactoryPattern.loans.ALoan;
import designPatterns.creational.abstractFactoryPattern.loans.BLoan;
import designPatterns.creational.abstractFactoryPattern.loans.CLoan;
import designPatterns.creational.abstractFactoryPattern.loans.Loan;
import designPatterns.creational.abstractFactoryPattern.banks.Bank;

public class LoanFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if(loan == null){
            return null;
        }
        if("a".equalsIgnoreCase(loan)){
            return new ALoan();
        } else if("b".equalsIgnoreCase(loan)){
            return new BLoan();
        } else if("c".equals(loan)){
            return new CLoan();
        }
        return null;
    }
}
