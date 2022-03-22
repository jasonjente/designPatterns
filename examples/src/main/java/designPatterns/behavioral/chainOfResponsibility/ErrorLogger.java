package designPatterns.behavioral.chainOfResponsibility;

import java.time.LocalDateTime;

public class ErrorLogger extends Logger{
    public ErrorLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void logMessage(String log) {
        System.out.println("LOGGER-ERROR: "+ LocalDateTime.now() + " : " + log);
    }
}
