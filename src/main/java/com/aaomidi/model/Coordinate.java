package com.aaomidi.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Coordinate {
    int x = 0;
    int y = 0;

    public Coordinate goUp() {
        return new Coordinate(x, y + 1);
    }

    public Coordinate goDown() {
        return new Coordinate(x, y - 1);

    }

    public Coordinate goLeft() {
        return new Coordinate(x + 1, y);

    }

    public Coordinate goRight() {
        return new Coordinate(x - 1, y);

    }

    public Coordinate decide(char c) {
        switch (c) {
            case '^':
                return goUp();
            case 'v':
                return goDown();
            case '>':
                return goRight();
            case '<':
                return goLeft();
        }
        return null;
    }
}