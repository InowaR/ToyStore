package org.store.model.awarding.iterator;

import org.store.model.service.toy.Toy;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ToyIterator implements Iterator<Toy> {
    private Queue<Toy> queue;

    public ToyIterator(Queue<Toy> queue) {
        this.queue = queue;
    }
    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Toy next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return queue.poll();
    }
}
