package org.store.model.awarding;

import org.store.model.service.toy.Toy;
import java.util.Queue;

public interface AwardToysMethods {
    Queue<Toy> getQueue();
    void addToy(Toy toy);
    void showToys();
}
