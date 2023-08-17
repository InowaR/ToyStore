package org.store.model.awarding.iterator;

import org.store.model.service.toy.Toy;
import java.util.ArrayList;
import java.util.Iterator;
public class ToyIterator implements Iterator<Toy> {
    private int index;
    private ArrayList<Toy> winToys;

    public ToyIterator(ArrayList<Toy> winToys) {
        this.winToys = winToys;
    }
    @Override
    public boolean hasNext() {
        return winToys.size() > index;
    }

    @Override
    public Toy next() {
        return winToys.get(index++);
    }
}
