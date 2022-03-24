package designPatterns.behavioral.observer;

public interface Subject {
    void subscribeObserver(Observer observer);
    void unsubscribeObserver(Observer observer);
    void notifyObservers();
    public String subjectDetails();
}
