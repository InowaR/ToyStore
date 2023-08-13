package org.store.model.service;

import org.store.model.store.Store;
import org.store.model.toy.Toy;

public class Service implements ServiceMethods {
    private Store store;

    public Service() {
        this.store = new Store();
    }

    @Override
    public void addToy(int id, String name) {
        Toy toy = new Toy(id, name);
        store.addToy(toy);
    }

    @Override
    public void deleteToy(Toy toy) {
        store.deleteToy(toy);
    }
}
