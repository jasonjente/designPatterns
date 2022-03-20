package designPatterns.structural.adapterPattern.generics;

public class GenericQueueImpl<T> implements GenericQueue<T>{
    private Queue<T> queue = new Queue<>();
    @Override
    public T peek() {
        return queue.peek();
    }

    @Override
    public void enqueue(T data) {
        queue.enqueue(data);
    }

    @Override
    public T dequeue() {
        return queue.dequeue();
    }

    @Override
    public void print() {
        int i = 0;
        for(T item: queue.getQueue()){
            i++;
            System.out.println("Printing from the Queue, item: " + i + " contains: " + item.toString());
        }
    }

    public Queue<T> getQueue() {
        return queue;
    }

    public void setQueue(Queue<T> queue) {
        this.queue = queue;
    }

}
