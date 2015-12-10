package com.aaomidi.days.day10;

import com.aaomidi.model.Problem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by amir on 2015-12-10.
 */
public class P extends Problem {
    private final static Pattern pattern = Pattern.compile("(\\d)(\\1*)");
    private final String input = "1321131112";

    public P() {
        super("Day 10: Elves Look, Elves Say");
    }

    @Override
    public String solvePart1() {
        String in = String.valueOf(input);
        in = apply(in, 40);
        return in.length() + "";
    }

    @Override
    public String solvePart2() {
        String in = String.valueOf(input);
        in = apply(in, 50);
        return in.length() + "";
    }

    public String apply(String in, int iterations) {
        for (int i = 0; i < iterations; i++) {
            Matcher matcher = pattern.matcher(in);

            StringBuilder newIn = new StringBuilder();

            while (matcher.find()) {
                int length = matcher.group(2) != null ? matcher.group(2).length() + 1 : 1;

                newIn.append(length).append(matcher.group(1));
            }
            in = newIn.toString();
        }

        return in;
    }
}
