package designPatterns.structural.adapterPattern;

public interface StringQueue {
    String peek();
    void enqueue(String n);
    String dequeue();
    void print();
}
