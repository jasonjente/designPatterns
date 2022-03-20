package designPatterns.structural.adapterPattern;

import java.util.ArrayList;
import java.util.List;

public class StringQueueImpl implements StringQueue {
    private Queue queue = new Queue();

    @Override
    public String peek() {
        return queue.peek();
    }

    @Override
    public void enqueue(String s) {
        queue.enqueue(s);
    }

    @Override
    public String dequeue() {
        return queue.dequeue();
    }

    @Override
    public void print() {
        for(int i = queue.getQueue().size(); i-->0;){
            System.out.println(queue.getQueue().get(i));
        }
    }

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    private static class Queue {
        private List<String> queue;

        public String peek(){
            return queue.get(queue.size()-1);
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
                System.out.println("dequing "+ ret);
                return ret;
            }
        }

    }
}