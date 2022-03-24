package designPatterns.behavioral.dependencyInjection.model;

import designPatterns.misc.daoPattern.Database;

public class User extends Account {
    private String username;
    private Database<Message> messages = new Database<>();

    public User(String username) {
        super(username);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Database<Message> getMessages() {
        return messages;
    }

    public void setMessages(Database<Message> messages) {
        this.messages = messages;
    }

    public void addMessage(Message message){
        messages.addToDb(message);
    }

    public void printMessages(){
        for(Message message:messages.getAll()){
            System.out.println(message);
        }
    }
}
