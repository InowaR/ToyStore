package org.store.model.service.store;

import org.store.model.service.toy.Toy;
import java.util.ArrayList;

public class Store implements StoreMethods {
    private ArrayList<Toy> toys;

    public Store() {
        this.toys = new ArrayList<>();
    }

    @Override
    public int getLengthArray() {
        return toys.size();
    }

    @Override
    public void addToy(Toy toy) {
        toys.add(toy);
    }

    @Override
    public void showToys() {
        for (Toy toy : toys) {
            System.out.println(toy);
        }
    }
    @Override
    public Toy getToyByIndex(int index) {
        return toys.get(index);
    }

    @Override
    public ArrayList<Double> dataForTheLottery() {
        ArrayList<Double> weights = new ArrayList<>();
        for (Toy toy : toys) {
            weights.add(toy.getFrequency());
        }
        return weights;
    }
}
