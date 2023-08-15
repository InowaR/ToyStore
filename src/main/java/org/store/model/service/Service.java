package org.store.model.service;

import org.store.model.service.lottery.Lottery;
import org.store.model.service.store.Store;
import org.store.model.service.toy.Toy;
import java.util.ArrayList;

public class Service implements ServiceMethods {
    private int id = 0;

    private Store store;

    public Service() {
        this.store = new Store();
    }

    @Override
    public void addToy(String name, int numberOfToys, float frequency) {
        for (int i = 0; i < numberOfToys; i++) {
            Toy toy = new Toy(this.id, name, frequency);
            store.addToy(toy);
            this.id++;
        }
    }

    @Override
    public void showToys() {
        store.showToys();
        System.out.println("Общее количество в магазине: " + store.getLengthArray());
    }

    @Override
    public Toy makeTheLottery() {
        ArrayList<Double> weights = store.dataForTheLottery();
        double sumOfWeights = weights.stream().mapToDouble(Double::doubleValue).sum();
        double total = sumOfWeights * Math.random();
        Lottery lottery = new Lottery(total, weights);
        int index = lottery.playTheLottery();
        return store.getToyByIndex(index);
    }
}
