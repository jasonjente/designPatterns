package designPatterns.behavioral.dependencyInjection.consumer;

import designPatterns.behavioral.dependencyInjection.model.Message;

public interface Consumer {
    void processMessage(Message message);
}
