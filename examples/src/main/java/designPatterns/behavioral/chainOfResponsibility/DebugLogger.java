package designPatterns.behavioral.chainOfResponsibility;

import java.time.LocalDateTime;

public class DebugLogger extends Logger {
    public DebugLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void logMessage(String log) {
        System.out.println("LOGGER-Debug: " + LocalDateTime.now() + " : " +log);
    }
}
