package designPatterns.behavioral.dependencyInjection.service;

import designPatterns.behavioral.chainOfResponsibility.Logger;
import designPatterns.behavioral.dependencyInjection.model.Message;
import designPatterns.behavioral.dependencyInjection.model.User;
import designPatterns.misc.daoPattern.Database;

public class SocialMessageServiceImpl implements MessageService {

    Logger logger = Logger.createLogger();
    private static Database<Message> messages = new Database<>();
    private static Database<User> accounts = new Database<>();

    @Override
    public void send(Message message) {
        logger.log(Logger.INFO,"SocialMessageServiceImpl.SendMessage() - ENTER");
        messages.addToDb(message);
        accounts.addToDb(((User) (message.getRecipient())));
        //lazy find because I have not made any fast search for specific
        // queries like select * from foo where accountName='bar'
        for(User user: accounts.getAll()){
            if((message.getRecipient().getUsername()).equals(user.getUsername())){
                logger.log(Logger.DEBUG,"SocialMessageServiceImpl.SendMessage() - message:" + message);
                user.getMessages().addToDb(message);
                logger.log(Logger.DEBUG,"SocialMessageServiceImpl.SendMessage() - message sent.");
                break;
            }
        }
        logger.log(Logger.INFO,"SocialMessageServiceImpl.SendMessage() - LEAVE");
    }
}
