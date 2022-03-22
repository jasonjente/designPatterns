package designPatterns.behavioral.chainOfResponsibility;

public abstract class Logger {
    public static int INFO = 1;
    public static int ERROR = 2;
    public static int DEBUG = 3;

    protected int levels;
    private Logger nextLevelLogger;

    public void setNextLevelLogger(Logger nextLevelLogger){
        this.nextLevelLogger = nextLevelLogger;
    }
    public void log(int levels, String log){
        if(this.levels<=levels){
            logMessage(log);
        }
        if (nextLevelLogger!=null) {
            nextLevelLogger.log(levels, log);
        }
    }

    /**
     *
     * @return a Logger, use Logger.INFO, DEBUG or ERROR to use the logger you want.
     */
    public static Logger createLogger(){
        Logger infoLogger = new InfoLogger(Logger.INFO);
        Logger debugLogger = new DebugLogger(Logger.DEBUG);
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        errorLogger.setNextLevelLogger(debugLogger);
        infoLogger.setNextLevelLogger(errorLogger);


        return infoLogger;
    }
    protected abstract void logMessage(String log);
}
