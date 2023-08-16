package org.store.model.awarding;

import org.store.model.service.toy.Toy;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Queue;

public class AwardToys implements Serializable {
    private Queue<Toy> queue;

    public AwardToys() {
        this.queue = new LinkedList<>();
    }

    public Queue<Toy> getQueue() {
        return queue;
    }

    public void addToy(Toy toy) {
        queue.add(toy);
    }
}
