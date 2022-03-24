package designPatterns.behavioral.dependencyInjection;

import designPatterns.behavioral.dependencyInjection.consumer.Consumer;
import designPatterns.behavioral.dependencyInjection.injector.EmailServiceInjector;
import designPatterns.behavioral.dependencyInjection.injector.MessageServiceInjector;
import designPatterns.behavioral.dependencyInjection.injector.SocialMessageServiceInjector;
import designPatterns.behavioral.dependencyInjection.model.Account;
import designPatterns.behavioral.dependencyInjection.model.Message;
import designPatterns.behavioral.dependencyInjection.model.User;

public class DependencyInjectionDemo {
    public static void main(String[] args) {
        Account sender = new Account("Alice@email.com");
        Account recipient = new Account("Bob@email.com");
        User sender1 = new User("Alice");
        User recipient1 = new User("Bob");
        Message messageEmail = new Message(sender,recipient,"Hello World from email!");
        Message messageSocial = new Message(sender1,recipient1,"Hello World from Social Media!");

        Message messageResponse = new Message(recipient, sender, "Have a nice day!" );

        MessageServiceInjector injector;
        Consumer app;

        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessage(messageEmail);
        app.processMessage(messageResponse);
        recipient.printMessages();
        sender.printMessages();
        injector = new SocialMessageServiceInjector();
        app = injector.getConsumer();
        app.processMessage(messageSocial);

        recipient.printMessages();
        sender.printMessages();
        recipient1.printMessages();
        sender1.printMessages();
    }
}
