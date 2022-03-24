package designPatterns.behavioral.dependencyInjection.injector;

import designPatterns.behavioral.dependencyInjection.consumer.Consumer;

public interface MessageServiceInjector {
    Consumer getConsumer();
}
