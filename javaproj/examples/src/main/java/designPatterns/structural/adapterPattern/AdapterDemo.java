package designPatterns.structural.adapterPattern;

public class AdapterDemo {
    public static void main(String[] args) {
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
}
