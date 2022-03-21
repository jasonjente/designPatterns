package designPatterns.creational.prototypePattern;
public class PrototypeDemo {
    public static void main(String[] args){
        EmployeeRecord emp = new EmployeeRecord("name","admin", 1);

        EmployeeRecord emp2 = (EmployeeRecord) emp.getClone();

        System.out.println(emp.toString()+"\n"+emp2.toString());
    }


}
