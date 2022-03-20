package designPatterns.creational.prototypePattern;

public class EmployeeRecord implements Prototype{
    private String name;
    private String role;
    private int id;

    public EmployeeRecord() {
    }

    public EmployeeRecord(String name, String role, int id) {
        this.name = name;
        this.role = role;
        this.id = id;
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(name, role, id);
    }

    @Override
    public String toString() {
        return "EmployeeRecord{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", id=" + id +
                '}';
    }
}
