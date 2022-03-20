package designPatterns.structural.adapterPattern.generics;

public class GenericStackImpl<T> implements GenericStack<T>{
    private Stack<T> stack = new Stack<>();
    @Override
    public T peek() {
        return stack.peek();
    }

    @Override
    public void push(T data) {
        stack.push(data);
    }

    @Override
    public T pop() {
        return stack.pop();
    }

    @Override
    public void print() {
        int index = 1;
        for(int i = stack.getStack().size(); i-->0;){
            System.out.println("Printing from the Stack, item : " + index + " contains: "+ stack.getStack().get(i).toString());
            index++;
        }
    }

    public Stack<T> getStack() {
        return stack;
    }

    public void setStack(Stack<T> stack) {
        this.stack = stack;
    }
}
