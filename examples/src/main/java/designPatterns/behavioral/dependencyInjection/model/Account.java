package designPatterns.behavioral.dependencyInjection.model;

import designPatterns.misc.daoPattern.Database;

import java.util.Objects;

public class Account {
    private Database<Message> messages = new Database<>();
    private String email;

    public Account(String email) {
        this.email = email;
    }

    public Account(Database<Message> messages, String email, String password, Long id) {
        this.messages = messages;
        this.email = email;
    }

    public Database<Message> getMessages() {
        return messages;
    }

    public void setMessages(Database<Message> messages) {
        this.messages = messages;
    }

    public String getUsername() {
        return email;
    }

    public void setUsername(String username) {
        this.email = username;
    }


    public void addMessage(Message message){
        messages.addToDb(message);
    }

    public void printMessages(){
        for(Message message:messages.getAll()){
            System.out.println(message);
        }
    }

    @Override
    public String toString() {
        return "Account{\n" +
                "\temail = '" + email + '\'' +
                "\n\t}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return email.equals(account.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
