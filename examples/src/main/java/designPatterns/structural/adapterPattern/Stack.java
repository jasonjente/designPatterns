package designPatterns.structural.adapterPattern;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<String> stack;

    public String peek(){
        return stack.get(stack.size()-1);
    }

    public void push(String s) {
        if (stack == null) {
            stack = new ArrayList<>();
        }
        stack.add(s);

    }
    public List<String> getStack() {
        return stack;
    }

    public void setStack(List<String> queue) {
        this.stack = queue;
    }


    public String pop() {
        if (stack == null) {
            System.out.println("EMPTY ALREADY");
            return "";
        } else {
            String ret = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return ret;
        }
    }

}