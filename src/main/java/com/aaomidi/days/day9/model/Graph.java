package com.aaomidi.days.day9.model;

import com.aaomidi.util.LogHandler;

import java.util.*;

/**
 * Created by amir on 2015-12-09.
 */
public class Graph {
    private final Map<String, Node> nodes = new HashMap<>();
    private List<Integer> distances = new ArrayList<>();
    private Map<Integer, List<Node>> debug = new HashMap<>();

    public void addNode(String firstName, String secondName, Integer distance) {
        Node first = nodes.get(firstName);
        if (first == null) {
            first = new Node(firstName);
            nodes.put(firstName, first);
        }

        Node second = nodes.get(secondName);
        if (second == null) {
            second = new Node(secondName);
            nodes.put(secondName, second);
        }

        Edge edge = new Edge(distance, first, second);

        first.getEdges().add(edge);
        second.getEdges().add(edge);
    }

    public void print() {
        for (Node node : nodes.values()) {
            StringBuilder sb = new StringBuilder("City " + node.getName());
            sb.append("\nConnected to: \n");
            for (Edge edge : node.getEdges()) {
                if (!edge.getN1().equals(node))
                    sb.append("\t").append(edge.getN1().getName());
                if (!edge.getN2().equals(node))
                    sb.append("\t").append(edge.getN1().getName());

                sb.append(String.format(" Distance: %d\n", edge.getDistance()));
            }
            LogHandler.log(sb.toString());
        }
    }

    private void doCalc() {
        distances.clear();

        for (Map.Entry<String, Node> entry : nodes.entrySet()) {
            Node city = entry.getValue();

            List<Node> visitedNodes = new ArrayList<>();
            visitedNodes.add(city);

            setupDistances(city, visitedNodes, 0);
        }
    }

    public int findShortestDistance() {
        doCalc();

        int min = Collections.min(distances);

        return min;
    }

    public int findLongestDistance() {
        doCalc();

        int max = Collections.max(distances);

        List<Node> list = debug.get(max);

        for(Node n:list){
            LogHandler.logn(n.getName());
        }
        return max;
    }

    public void setupDistances(Node node, List<Node> visitedNodes, int distance) {
        if (visitedNodes.size() == 8) {
            debug.put(distance, visitedNodes); // This isn't strictly needed.
            distances.add(distance);
            return;
        }

        for (Edge edge : node.getEdges()) {
            Node n1 = edge.getN1();
            Node n2 = edge.getN2();


            Node pick = null;
            List<Node> copy = null;

            if (!visitedNodes.contains(n1)) {
                copy = new ArrayList<>();
                copy.addAll(visitedNodes);
                copy.add(n1);
                pick = n1;
            }

            if (!visitedNodes.contains(n2)) {
                copy = new ArrayList<>();
                copy.addAll(visitedNodes);
                copy.add(n2);
                pick = n2;
            }

            if (copy != null) {
                setupDistances(pick, copy, distance + edge.getDistance());
            }
        }
    }
}
