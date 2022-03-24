package designPatterns.behavioral.dependencyInjection.consumer;

import designPatterns.behavioral.chainOfResponsibility.Logger;
import designPatterns.behavioral.dependencyInjection.model.Message;
import designPatterns.behavioral.dependencyInjection.service.MessageService;

public class Client implements Consumer{
    private MessageService service;
    private static Logger logger = Logger.createLogger();

    public Client(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessage(Message message) {
        logger.log(Logger.INFO,"Client.processMessage() - ENTER");
        this.service.send(message);
        logger.log(Logger.INFO,"Client.processMessage() - LEAVE");
    }
}
