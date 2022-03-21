package designPatterns.structural.adapterPattern;

public class AdapterDemo {
    public static void main(String[] args) {
        demoQueue();
        demoStack();
    }

    public static void demoQueue(){
        StringQueueImpl demo = new StringQueueImpl();
        demo.enqueue("a");
        demo.enqueue("b");
        demo.enqueue("c");
        demo.enqueue("d");
        demo.enqueue("e");

        demo.peek();

        demo.print();

        demo.dequeue();
        demo.dequeue();
        demo.dequeue();
        demo.dequeue();
        demo.dequeue();

        System.out.println("dequeued");
        demo.print();
        System.out.println("dequeued");
    }
    public static void demoStack(){
        StringStackImpl demo = new StringStackImpl();
        demo.push("a");
        demo.push("b");
        demo.push("c");
        demo.push("d");
        demo.push("e");

        demo.peek();

        demo.print();

        demo.pop();
        demo.pop();
        demo.pop();
        demo.pop();
        demo.pop();

        System.out.println("popped");
        demo.print();
        System.out.println("popped");}
}
