package designPatterns.behavioral.dependencyInjection.service;

import designPatterns.behavioral.dependencyInjection.model.Message;

public interface MessageService {
    void send(Message message);
}
