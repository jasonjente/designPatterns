package designPatterns.behavioral.observer;

import designPatterns.behavioral.chainOfResponsibility.Logger;
import designPatterns.misc.daoPattern.Database;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class CommentaryObject implements Commentary, Subject, Serializable {
    private final Logger logger = Logger.createLogger();
    private Database<Observer> observers = new Database<>();
    private String description;
    private final String subjectDetails;

    public CommentaryObject(String subjectDetails) {
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setDesc(String desc) {
        logger.log(Logger.INFO,"CommentaryObject.setDesc() - ENTER");
        this.description = desc;
        notifyObservers();
        logger.log(Logger.INFO,"CommentaryObject.setDesc() - LEAVE");
    }

    @Override
    public void subscribeObserver(Observer observer) {
        logger.log(Logger.INFO,"CommentaryObject.subscribeObserver() - ENTER");
        observers.addToDb(observer);
        logger.log(Logger.INFO,"CommentaryObject.subscribeObserver() - LEAVE");
    }

    @Override
    public void unsubscribeObserver(Observer observer) {
        logger.log(Logger.INFO,"CommentaryObject.unsubscribeObserver() - ENTER");
        List<Observer> observerList = observers.getAll();
        for(Observer obs: observerList){
            if(obs.equals(observer)){
                observers.deleteEntry(observer);
            }
        }
        logger.log(Logger.INFO,"CommentaryObject.unsubscribeObserver() - LEAVE");
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers.getAll()){
            observer.update(description);
        }
    }

    @Override
    public String subjectDetails() {
        return subjectDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentaryObject that = (CommentaryObject) o;
        return description.equals(that.description) && subjectDetails.equals(that.subjectDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, subjectDetails);
    }
}
