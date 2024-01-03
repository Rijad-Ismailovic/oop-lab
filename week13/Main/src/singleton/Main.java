package singleton;

public class Main {
    public static void main(String[] args){
        singelton();
    }

    public static void singelton(){
        Logger logger = Logger.getInstance();
        logger.log("banana");
        logger.logInfo("informacijska banana");
        logger.logWarning("banana upozorenja");
        logger.logError("ne valja banana");
        for(String log : logger.getLogs()){
            System.out.println(log);
        }
    }
}
