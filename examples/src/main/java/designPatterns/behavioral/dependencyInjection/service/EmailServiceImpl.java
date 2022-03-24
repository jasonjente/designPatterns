package designPatterns.behavioral.dependencyInjection.service;

import designPatterns.behavioral.chainOfResponsibility.Logger;
import designPatterns.behavioral.dependencyInjection.model.Account;
import designPatterns.behavioral.dependencyInjection.model.Message;
import designPatterns.misc.daoPattern.Database;

public class EmailServiceImpl implements MessageService {
    Logger logger = Logger.createLogger();
    private static Database<Message> messages = new Database<>();
    private static Database<Account> accounts = new Database<>();

    @Override
    public void send(Message message) {
        logger.log(Logger.INFO,"EmailServiceImpl.SendMessage() - ENTER");
        messages.addToDb(message);
        accounts.addToDb(message.getRecipient());
        //lazy find because I have not made any fast search for specific
        // queries like select * from foo where accountName='bar'
        for(Account account: accounts.getAll()){
            if(message.getRecipient().equals(account)){
                logger.log(Logger.DEBUG,"EmailServiceImpl.SendMessage() - message:" + message);
                account.getMessages().addToDb(message);
                logger.log(Logger.DEBUG,"EmailServiceImpl.SendMessage() - message sent.");
                break;
            }
        }
        logger.log(Logger.INFO,"EmailServiceImpl.SendMessage() - LEAVE");
    }

}
