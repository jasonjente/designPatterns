package designPatterns.creational.abstractFactoryPattern.factories;

import designPatterns.creational.abstractFactoryPattern.loans.Loan;
import designPatterns.creational.abstractFactoryPattern.banks.ABank;
import designPatterns.creational.abstractFactoryPattern.banks.BBank;
import designPatterns.creational.abstractFactoryPattern.banks.Bank;
import designPatterns.creational.abstractFactoryPattern.banks.CBank;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        if(bank == null){
            return null;
        }
        if("a".equalsIgnoreCase(bank)){
            return new ABank(bank);
        } else if("b".equalsIgnoreCase(bank)){
            return new BBank(bank);
        } else if("c".equals(bank)){
            return new CBank(bank);
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
//        if(loan == null){
//            return null;
//        }
//        if("a".equalsIgnoreCase(loan)){
//            return new ALoan(loan);
//        } else if("b".equalsIgnoreCase(loan)){
//            return new BLoan(loan);
//        } else if("c".equals(loan)){
//            return new CLoan(loan);
//        }
        return null;
    }
}
