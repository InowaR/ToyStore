package org.store.model.awarding.fileHandler;

import org.store.model.service.toy.Toy;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Queue;

public class SaveLoadFile implements Writeable {
    @Override
    public void saveToFile(Queue<Toy> queue) {
        String fileName = "toys.txt";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(queue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
