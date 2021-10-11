package pgs.asta.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
    public static Logger logger = LogManager.getLogger(Log.class);

    public static synchronized void logInfo(String message) {
        logger.info(message);
    }

    public synchronized static void startTestCase(String sTestCaseName) {
        Log.logInfo("***************************************************************************");
        Log.logInfo("********************** ---  " + sTestCaseName + " --- *************************");
        Log.logInfo("***************************************************************************");
    }
    public synchronized static void endTestCaseSuccess() {
        Log.logInfo("XXXXXXXXXXXXXXXXX ------- SUCCESSFULLY---E-N-D--------- XXXXXXXXXXXXXXXXXXX");
    }
    public synchronized static void endTestCaseFailure() {
        Log.logInfo("XXXXXXXXXXXXXXXXXX ------- INCORRECTLY---E-N-D--------- XXXXXXXXXXXXXXXXXXX");
    }
    public synchronized static void endTestCaseSkipped() {
        Log.logInfo("XXXXXXXXXXXXXXXXXX ------- SKIPPED---E-N-D--------- XXXXXXXXXXXXXXXXXXX");
    }

    public synchronized static void warn(String message) {
        Log.warn(message);
    }
    public synchronized static void error(String message) {
        Log.error(message);
    }
    public synchronized static void debug(String message) {
        Log.debug(message);
    }
}