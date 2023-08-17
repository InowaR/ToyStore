package org.store.model.awarding.fileHandler;

import org.store.model.awarding.AwardToys;
import java.io.IOException;

public interface Writeable {
    void saveToFile(AwardToys awarding) throws IOException;
    AwardToys loadFromFile() throws IOException, ClassNotFoundException;
}
