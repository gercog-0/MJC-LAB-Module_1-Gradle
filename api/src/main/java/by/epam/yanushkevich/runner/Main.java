package by.epam.yanushkevich.runner;

import by.epam.yanushkevich.util.Utils;
import by.epam.yanushkevich.utils.StringUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        boolean result = Utils.isAllPositiveNumbers("12", "79");
        logger.log(Level.DEBUG, "Result of main method:" + result);
    }
}
