package org.store.model.awarding;

import org.store.model.service.toy.Toy;

import java.util.LinkedList;
import java.util.Queue;

public class AwardToys{
    private Queue<Toy> queue;

    public AwardToys() {
        this.queue = new LinkedList<>();
    }

    public void addToy(Toy toy) {
        queue.add(toy);
    }
}
