import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
    public static Logger logger = LogManager.getLogger(Log.class);

    public static synchronized void logInfo(String string){
        logger.info(string);
    }

    public static synchronized void logWarn(String string){
        logger.warn(string);
    }
}