package org.store.model.store;

import org.store.model.toy.Toy;
import java.util.ArrayList;

public class Store implements StoreMethods {
    private ArrayList<Toy> toys;

    public Store() {
        this.toys = new ArrayList<>();
    }

    @Override
    public void addToy(Toy toy) {
        toys.add(toy);
    }

    @Override
    public void deleteToy(Toy toy) {
        toys.remove(toy);
    }
}
