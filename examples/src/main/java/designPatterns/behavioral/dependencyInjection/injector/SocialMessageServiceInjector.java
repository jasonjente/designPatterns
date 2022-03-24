package designPatterns.behavioral.dependencyInjection.injector;

import designPatterns.behavioral.chainOfResponsibility.Logger;
import designPatterns.behavioral.dependencyInjection.consumer.Client;
import designPatterns.behavioral.dependencyInjection.consumer.Consumer;
import designPatterns.behavioral.dependencyInjection.service.SocialMessageServiceImpl;

public class SocialMessageServiceInjector implements MessageServiceInjector{
    Logger logger = Logger.createLogger();

    @Override
    public Consumer getConsumer() {
        logger.log(Logger.INFO,"EmailServiceInjector.getConsumer() - ENTER");
        logger.log(Logger.INFO,"EmailServiceInjector.getConsumer() - LEAVE");
        return new Client(new SocialMessageServiceImpl());
    }

}
