package dev.deyve.cqrs.core.infrastructure;

import dev.deyve.cqrs.core.commands.BaseCommand;
import dev.deyve.cqrs.core.commands.CommandHandlerMethod;

public interface CommandDispatcher {

    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);

    void send(BaseCommand command);
}