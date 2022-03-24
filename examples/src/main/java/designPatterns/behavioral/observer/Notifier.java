package designPatterns.behavioral.observer;

import designPatterns.behavioral.chainOfResponsibility.Logger;

public class Notifier implements Observer{
    private final Subject subject;
    private String desc;
    private String userInfo;
    private final static Logger logger = Logger.createLogger();
    public Notifier(Subject subject, String desc, String userInfo) {
        this.subject = subject;
        this.desc = desc;
        this.userInfo = userInfo;
    }

    @Override
    public void update(String desc) {
        logger.log(Logger.INFO, "Notifier.update() - ENTER");
        this.desc = this.desc;
        logger.log(Logger.DEBUG, userInfo + " " +desc);
    }

    @Override
    public void subscribe() {
        logger.log(Logger.INFO,"Notifier.subscribe() - ENTER");
        this.subject.subscribeObserver(this);
        logger.log(Logger.INFO,"Notifier.subscribe() - LEAVE");
    }

    @Override
    public void unsubscribe() {
        logger.log(Logger.INFO,"Notifier.unsubscribe() - ENTER");
        this.subject.unsubscribeObserver(this);
        logger.log(Logger.INFO,"Notifier.unsubscribe() - LEAVE");
    }
}
