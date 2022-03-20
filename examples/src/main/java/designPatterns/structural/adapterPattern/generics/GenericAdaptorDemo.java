package designPatterns.structural.adapterPattern.generics;

import designPatterns.structural.adapterPattern.Stack;

public class GenericAdaptorDemo {
    public static void main(String[] args) {
        GenericQueue<CustomObject> genericQueue = new GenericQueueImpl<>();
        GenericStack<CustomObject> genericStack = new GenericStackImpl<>();

        CustomObject obj1 = new CustomObject("message1","recipient1","sender1");
        CustomObject obj2 = new CustomObject("message2","recipient2","sender2");
        CustomObject obj3 = new CustomObject("message3","recipient3","sender3");
        CustomObject obj4 = new CustomObject("message4","recipient4","sender4");
        CustomObject obj5 = new CustomObject("message5","recipient5","sender5");
        CustomObject obj6 = new CustomObject("message6","recipient6","sender6");

        genericQueue.enqueue(obj1);
        genericQueue.enqueue(obj2);
        genericQueue.enqueue(obj3);
        genericQueue.enqueue(obj4);
        genericQueue.enqueue(obj5);
        genericQueue.enqueue(obj6);

        genericQueue.print();
        System.out.println();

        genericQueue.dequeue();
        genericQueue.dequeue();
        genericQueue.dequeue();
        genericQueue.dequeue();
        genericQueue.dequeue();
        genericQueue.dequeue();

        genericStack.push(obj1);
        genericStack.push(obj2);
        genericStack.push(obj3);
        genericStack.push(obj4);
        genericStack.push(obj5);
        genericStack.push(obj6);

        genericStack.print();

        genericStack.pop();
        genericStack.pop();
        genericStack.pop();
        genericStack.pop();
        genericStack.pop();
        genericStack.pop();

        System.out.println();

        GenericQueueImpl<Stack> queueWithStacks = new GenericQueueImpl<>();
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        Stack stack3 = new Stack();
        Stack stack4 = new Stack();
        Stack stack5 = new Stack();

        stack1.push("String 1");
        stack1.push("String 2");
        stack1.push("String 3");
        stack1.push("String 4");
        stack1.push("String 5");

        stack2.push("String 1");
        stack2.push("String 2");
        stack2.push("String 3");
        stack2.push("String 4");
        stack2.push("String 5");

        stack3.push("String 1");
        stack3.push("String 2");
        stack3.push("String 3");
        stack3.push("String 4");
        stack3.push("String 5");

        stack4.push("String 1");
        stack4.push("String 2");
        stack4.push("String 3");
        stack4.push("String 4");
        stack4.push("String 5");

        stack5.push("String 1");
        stack5.push("String 2");
        stack5.push("String 3");
        stack5.push("String 4");
        stack5.push("String 5");

        queueWithStacks.enqueue(stack1);
        queueWithStacks.enqueue(stack2);
        queueWithStacks.enqueue(stack3);
        queueWithStacks.enqueue(stack4);
        queueWithStacks.enqueue(stack5);

        queueWithStacks.print();
    }

}
