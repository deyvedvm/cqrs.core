package dev.deyve.cqrs.core.producers;

import dev.deyve.cqrs.core.events.BaseEvent;

public interface EventProducer {
    void produce(String topic, BaseEvent event);
}
