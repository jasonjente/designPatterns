package designPatterns.structural.adapterPattern.generics;

public class CustomObject{
    private String message;
    private String recipient;
    private String sender;

    public CustomObject() {
    }

    public CustomObject(String message, String recipient, String sender) {
        this.message = message;
        this.recipient = recipient;
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "message='" + message + '\'' +
                ", recipient='" + recipient + '\'' +
                ", sender='" + sender + '\'' +
                '}';
    }
}
