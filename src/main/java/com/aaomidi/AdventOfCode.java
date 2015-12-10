package com.aaomidi;


/**
 * Created by amir on 2015-12-03.
 */
public class AdventOfCode {
    public AdventOfCode(String... args) {

        this.start();
    }

    public static void main(String... args) {
        new AdventOfCode(args);
    }

    public void start() {
        new com.aaomidi.days.day1.P().solve();

        new com.aaomidi.days.day2.P().solve();

        new com.aaomidi.days.day3.P().solve();

        new com.aaomidi.days.day4.P().solve();

        new com.aaomidi.days.day5.P().solve();

        new com.aaomidi.days.day6.P().solve();

        new com.aaomidi.days.day7.P().solve();

        new com.aaomidi.days.day8.P().solve();

        new com.aaomidi.days.day9.P().solve();

        new com.aaomidi.days.day10.P().solve();

    }
}
