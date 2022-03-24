package designPatterns.behavioral.dependencyInjection.model;

import java.io.Serializable;
import java.util.Objects;

public class Message implements Serializable {
    private Account sender;
    private Account recipient;
    private String message;

    public Message(Account sender, Account recipient, String message) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public Account getRecipient() {
        return recipient;
    }

    public void setRecipient(Account recipient) {
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{\n" +
                "sender  = " + sender +
                "\nrecipient = " + recipient +
                "\nmessage = '" + message + '\'' +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return sender.equals(message1.sender) && recipient.equals(message1.recipient) && message.equals(message1.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, recipient, message);
    }
}
