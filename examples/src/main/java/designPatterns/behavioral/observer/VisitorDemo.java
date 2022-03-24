package designPatterns.behavioral.observer;

public class VisitorDemo {
    public static void main(String[] args) {
        CommentaryObject object = new CommentaryObject("SUBJECT 1");
        Notifier observer1 = new Notifier(object, "DESCRIPTION FOR BOB", "BOB");
        Notifier observer2 = new Notifier(object, "DESCRIPTION FOR ALICE", "ALICE");

        observer1.subscribe();
        observer2.subscribe();

        object.setDesc("BOB SAYS HI");
        object.setDesc("ALICE SAYS HI TOO");

        observer1.unsubscribe();

        object.setDesc("BOB SAYS WHERE DID YOU GO");
        object.setDesc("ALICE ALSO SAYS WHERE DID YOU GO");
    }
}
