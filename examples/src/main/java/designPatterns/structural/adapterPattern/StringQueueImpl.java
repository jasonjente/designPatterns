package designPatterns.structural.adapterPattern;

public class StringQueueImpl implements StringQueue {
    private Queue queue = new Queue();

    @Override
    public String peek() {
        return queue.peek();
    }

    @Override
    public void enqueue(String s) {
        System.out.println("ENQUEUING "+ s);
        queue.enqueue(s);
    }

    @Override
    public String dequeue() {
        String ret = queue.dequeue();
        System.out.println("DEQUEUED " + ret);
        return ret;
    }

    @Override
    public void print() {
        int i = 1;
        for(String item:queue.getQueue()){
            System.out.println("Printing from the Queue, item: " + i + " contains: " + item);
            i++;
        }
    }

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }


}