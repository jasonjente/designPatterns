package designPatterns.behavioral.chainOfResponsibility;

import java.time.LocalDateTime;

public class InfoLogger extends Logger{
    public InfoLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void logMessage(String log) {
        System.out.println("LOGGER-Info "+ LocalDateTime.now() + " : " +log);
    }
}
