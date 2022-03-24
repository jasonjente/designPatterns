package designPatterns.behavioral.visitor;

public interface Observer {
    void update(String dec);
    void subscribe();
    void unsubscribe();
}
