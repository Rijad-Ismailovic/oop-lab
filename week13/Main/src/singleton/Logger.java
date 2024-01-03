package singleton;

import java.util.ArrayList;

public class Logger {
    private static Logger instance;
    private ArrayList<String> logs;
    private Logger(){
        this.logs = new ArrayList<>();
    }
    public static Logger getInstance(){
        synchronized (Logger.class){
            if(instance == null){
                instance = new Logger();
            }
        }
        return instance;
    }

    public void log(String message){
        logs.add("GENERAL: " + message);
    }
    public void logInfo(String message){
        logs.add("INFO: " + message);
    }
    public void logWarning(String message){
        logs.add("WARNING: " + message);
    }
    public void logError(String message){
        logs.add("ERROR: " + message);
    }

    public ArrayList<String> getLogs(){return this.logs;}
}
