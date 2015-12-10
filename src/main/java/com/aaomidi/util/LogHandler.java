package com.aaomidi.util;

/**
 * Created by amir on 2015-11-25.
 */
public class LogHandler {

    public static void log(String s, Object... format) {
        String msg = String.format(s, format);
        System.out.print(msg);
    }

    public static void logn(String s, Object... format) {
        log(s + "%n", format);
    }
}
