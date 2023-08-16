package org.store.model.service.lottery;

import java.util.ArrayList;

public class Lottery implements LotteryMethods {
    private double total;
    private ArrayList<Double> weights;
    public Lottery(double total, ArrayList<Double> weights) {
        this.total = total;
        this.weights = weights;
    }

    @Override
    public int playTheLottery() {
        int index = 0;
        for (Double weight : weights) {
            total -= weight;
            if (total <= 0) {
                break;
            } else {
                index += 1;
            }
        }
        return index;
    }
}
