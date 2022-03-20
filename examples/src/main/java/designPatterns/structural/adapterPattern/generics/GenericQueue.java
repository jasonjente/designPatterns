package designPatterns.structural.adapterPattern.generics;

public interface GenericQueue<T> {
    T peek();
    void enqueue(T data);
    T dequeue();
    void print();
}
