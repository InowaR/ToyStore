package org.store.model.awarding;

import org.store.model.awarding.iterator.ToyIterator;
import org.store.model.service.toy.Toy;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class AwardToys implements AwardToysMethods, Serializable {
    private Queue<Toy> queue;

    public AwardToys() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void addToy(Toy toy) {
        queue.add(toy);
    }

    @Override
    public void showToys() {
        Iterator<Toy> iterator = new ToyIterator(queue);
        while (iterator.hasNext()) {
            Toy toy = iterator.next();
            System.out.println(toy);
        }
    }
}
