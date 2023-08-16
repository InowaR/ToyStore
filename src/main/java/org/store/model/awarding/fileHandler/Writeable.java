package org.store.model.awarding.fileHandler;

import org.store.model.service.toy.Toy;
import java.util.Queue;

public interface Writeable {
    void saveToFile(Queue<Toy> queue);
}
