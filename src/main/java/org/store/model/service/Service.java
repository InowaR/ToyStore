package org.store.model.service;

import org.store.model.store.Store;
import org.store.model.toy.Toy;

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


}
