package designPatterns.structural.adapterPattern;

public class StringStackImpl implements StringStack{
    private Stack stack = new Stack();

    @Override
    public String peek() {
        return stack.peek();
    }

    @Override
    public void push(String s) {
        System.out.println("PUSHING "+ s);
        stack.push(s);
    }

    @Override
    public String pop() {
        String ret = stack.pop();
        System.out.println("POPPED "+ ret);
        return ret;
    }

    @Override
    public void print() {
        int index = 1;
        for(int i = stack.getStack().size(); i-->0;){
            System.out.println("Printing from the Stack, item : " + index + " contains: "+ stack.getStack().get(i));
            index++;
        }
    }

    public Stack getStack() {
        return this.stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }


}
