package com.aaomidi.days.day9;

import com.aaomidi.days.day9.model.Graph;
import com.aaomidi.model.Problem;
import com.aaomidi.util.IntegerConverter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by amir on 2015-12-09.
 */
public class P extends Problem {
    private final static Pattern p = Pattern.compile("(\\w+) \\w+ (\\w+) = (\\d+)");
    /* private final static String input = "AlphaCentauri to Snowdin = 66\n" +
             "AlphaCentauri to Tambi = 28\n" +
             "AlphaCentauri to Faerun = 60\n" +
             "AlphaCentauri to Norrath = 34\n" +
             "AlphaCentauri to Straylight = 34\n" +
             "AlphaCentauri to Tristram = 3\n" +
             "AlphaCentauri to Arbre = 108\n" +
             "Snowdin to Tambi = 22\n" +
             "Snowdin to Faerun = 12\n" +
             "Snowdin to Norrath = 91\n" +
             "Snowdin to Straylight = 121\n" +
             "Snowdin to Tristram = 111\n" +
             "Snowdin to Arbre = 71\n" +
             "Tambi to Faerun = 39\n" +
             "Tambi to Norrath = 113\n" +
             "Tambi to Straylight = 130\n" +
             "Tambi to Tristram = 35\n" +
             "Tambi to Arbre = 40\n" +
             "Faerun to Norrath = 63\n" +
             "Faerun to Straylight = 21\n" +
             "Faerun to Tristram = 57\n" +
             "Faerun to Arbre = 83\n" +
             "Norrath to Straylight = 9\n" +
             "Norrath to Tristram = 50\n" +
             "Norrath to Arbre = 60\n" +
             "Straylight to Tristram = 27\n" +
             "Straylight to Arbre = 81\n" +
             "Tristram to Arbre = 90"; */
    private static final String input = "Faerun to Norrath = 129\n" +
            "Faerun to Tristram = 58\n" +
            "Faerun to AlphaCentauri = 13\n" +
            "Faerun to Arbre = 24\n" +
            "Faerun to Snowdin = 60\n" +
            "Faerun to Tambi = 71\n" +
            "Faerun to Straylight = 67\n" +
            "Norrath to Tristram = 142\n" +
            "Norrath to AlphaCentauri = 15\n" +
            "Norrath to Arbre = 135\n" +
            "Norrath to Snowdin = 75\n" +
            "Norrath to Tambi = 82\n" +
            "Norrath to Straylight = 54\n" +
            "Tristram to AlphaCentauri = 118\n" +
            "Tristram to Arbre = 122\n" +
            "Tristram to Snowdin = 103\n" +
            "Tristram to Tambi = 49\n" +
            "Tristram to Straylight = 97\n" +
            "AlphaCentauri to Arbre = 116\n" +
            "AlphaCentauri to Snowdin = 12\n" +
            "AlphaCentauri to Tambi = 18\n" +
            "AlphaCentauri to Straylight = 91\n" +
            "Arbre to Snowdin = 129\n" +
            "Arbre to Tambi = 53\n" +
            "Arbre to Straylight = 40\n" +
            "Snowdin to Tambi = 15\n" +
            "Snowdin to Straylight = 99\n" +
            "Tambi to Straylight = 70";
    private Graph graph;

    public P() {
        super("Day 9: All in a Single Night");
        graph = new Graph();
    }

    @Override
    public String solvePart1() {
        for (String string : input.split("\n")) {
            Matcher matcher = p.matcher(string);
            matcher.matches();

            String firstName = matcher.group(1);
            String secondName = matcher.group(2);
            Integer distance = IntegerConverter.fromString(matcher.group(3));
            graph.addNode(firstName, secondName, distance);
        }
        //graph.print();
        return graph.findShortestDistance() + "";
    }

    @Override
    public String solvePart2() {
        return graph.findLongestDistance() + "";
    }
}
