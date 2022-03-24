package designPatterns.behavioral.observer;

public interface Observer {
    void update(String dec);
    void subscribe();
    void unsubscribe();
}
