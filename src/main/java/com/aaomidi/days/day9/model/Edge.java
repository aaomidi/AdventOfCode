package com.aaomidi.days.day9.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by amir on 2015-12-09.
 */
@RequiredArgsConstructor
public class Edge {
    @Getter
    private final int distance;
    @Getter
    private final Node n1;
    @Getter
    private final Node n2;
}
