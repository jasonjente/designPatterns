package designPatterns.structural.adapterPattern;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<String> queue;

    public String peek(){
        return queue.get(0);
    }

    public void enqueue(String s) {
        if (queue == null) {
            queue = new ArrayList<>();
        }
        queue.add(s);

    }
    public List<String> getQueue() {
        return queue;
    }

    public void setQueue(List<String> queue) {
        this.queue = queue;
    }


    public String dequeue() {
        if (queue == null) {
            System.out.println("EMPTY ALREADY");
            return "";
        } else {
            String ret = queue.get(queue.size() - 1);
            queue.remove(queue.size() - 1);
            return ret;
        }
    }

}