package by.epam.yanushkevich.util;

import by.epam.yanushkevich.utils.StringUtils;

import java.util.Arrays;

public class Utils {
    private Utils() {
    }

    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }
}
