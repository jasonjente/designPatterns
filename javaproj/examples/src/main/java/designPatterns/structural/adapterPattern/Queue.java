package designPatterns.structural.adapterPattern;

import java.util.ArrayList;
import java.util.List;

public class Queue{
    private List<String> queue;

    public void enqueue(String s){
        if(queue == null){
            queue = new ArrayList<>();
        }
        queue.add(s);

    }

    public String dequeue(){
        if(queue == null){
            return "";
        }else {
            String ret = queue.get(queue.size()-1);
            queue.remove(queue.size()-1);
            return ret;
        }
    }

}
