package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true; //бесконечный итератор
            }

            @Override
            public Integer next() {
                //случайное число в диапазоне [min..max]
                return new Random().nextInt(max - min + 1) + min;
            }
        };
    }

}
