package designPatterns.structural.adapterPattern.generics;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private List<T> queue;

    public T peek(){
        if(null==queue.get(0)){
            return null;
        }
        return queue.get(0);
    }

    public void enqueue(T data) {
        if (queue == null) {
            queue = new ArrayList<>();
        }
        queue.add(data);

    }
    public List<T> getQueue() {
        return queue;
    }

    public void setQueue(List<T> queue) {
        this.queue = queue;
    }


    public T dequeue() {
        if (queue == null) {
            System.out.println("EMPTY ALREADY");
            return null;
        } else {
            T ret = queue.get(queue.size() - 1);
            queue.remove(queue.size() - 1);
            return ret;
        }
    }


}
