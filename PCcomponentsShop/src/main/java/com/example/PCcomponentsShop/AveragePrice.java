package com.example.PCcomponentsShop;

import java.util.function.DoubleConsumer;

public class AveragePrice implements DoubleConsumer {
    private double total = 0;
    private double count = 0;

    public double average() {
        return count > 0 ? ((double) total)/count : 0;
    }

    public void accept(double i) {
        total += i;
        count++;
    }

    public void combine(AveragePrice other) {
        total += other.total;
        count += other.count;
    }
}