package com.aaomidi.model;

import com.aaomidi.util.LogHandler;

/**
 * Created by amir on 2015-12-03.
 */
public abstract class Problem {
    private final String name;

    public Problem(String name) {
        this.name = name;
    }

    public void solve() {
        LogHandler.logn("Starting Problem %s", name);
        LogHandler.logn("\tPart 1: " + solvePart1());
        LogHandler.logn("\tPart 2: " + solvePart2());
    }

    public abstract String solvePart1();

    public abstract String solvePart2();
}
