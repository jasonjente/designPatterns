package designPatterns.structural.adapterPattern;

public interface StringStack {
    String peek();
    void push(String n);
    String pop();
    void print();
}
