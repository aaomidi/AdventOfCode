package com.aaomidi.days.day9.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amir on 2015-12-09.
 */

@RequiredArgsConstructor
public class Node {
    @Getter
    private final String name;
    @Getter
    private final List<Edge> edges = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node node = (Node) o;

        return name.equals(node.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
