package designPatterns.structural.adapterPattern.generics;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> stack;

    public T peek(){
        return stack.get(stack.size()-1);
    }

    public void push(T s) {
        if (stack == null) {
            stack = new ArrayList<>();
        }
        stack.add(s);

    }
    public List<T> getStack() {
        return stack;
    }

    public void setStack(List<T> queue) {
        this.stack = queue;
    }


    public T pop() {
        if (stack == null) {
            System.out.println("EMPTY ALREADY");
            return null;
        } else {
            T ret = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return ret;
        }
    }
}
