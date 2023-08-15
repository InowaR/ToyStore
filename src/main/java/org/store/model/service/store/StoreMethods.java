package org.store.model.service.store;

import org.store.model.service.toy.Toy;

import java.util.ArrayList;


public interface StoreMethods {
    int getLengthArray();
    void addToy(Toy toy);
    void showToys();
    Toy getToyByIndex(int index);
    ArrayList<Double> dataForTheLottery();
}
