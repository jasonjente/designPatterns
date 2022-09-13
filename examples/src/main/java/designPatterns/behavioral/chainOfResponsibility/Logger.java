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

    public void log(int levels, Object log){
        if((levels < INFO || levels > DEBUG) && levels != ERROR){
            log(2, "Illegal argument, use INFO, ERROR or DEBUG.");
            throw new IllegalArgumentException();
        }
        if(this.levels==levels){
            logMessage(log.toString());
        }else{
            if (nextLevelLogger!=null) {
                nextLevelLogger.log(levels, log);
            }
        }

    }
    /**
     *
     * @return a Logger, use Logger.INFO, DEBUG or ERROR to use the logger you want.
     */
    public static Logger createLogger(){
        Logger infoLogger = new InfoLogger(Logger.INFO);
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        infoLogger.setNextLevelLogger(errorLogger);
        Logger debugLogger = new DebugLogger(Logger.DEBUG);
        errorLogger.setNextLevelLogger(debugLogger);

        return infoLogger;
    }
    protected abstract void logMessage(String log);
}
