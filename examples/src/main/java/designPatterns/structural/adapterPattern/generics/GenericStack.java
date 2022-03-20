package designPatterns.structural.adapterPattern.generics;

public interface GenericStack<T> {
    T peek();
    void push(T data);
    T pop();
    void print();
}
