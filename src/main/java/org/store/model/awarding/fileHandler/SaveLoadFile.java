package org.store.model.awarding.fileHandler;

import org.store.model.awarding.AwardToys;
import java.io.*;

public class SaveLoadFile implements Writeable {
    @Override
    public void saveToFile(AwardToys awarding) throws IOException {
        awarding.showToys(); // -----------------------------------------
        String fileName = "toys.txt";
        FileOutputStream fileOut = new FileOutputStream(fileName);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(awarding);
        objectOut.close();
        fileOut.close();
    }

    @Override
    public AwardToys loadFromFile() throws IOException, ClassNotFoundException {
        String fileName = "toys.txt";
        FileInputStream fileIn = new FileInputStream(fileName);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        AwardToys awarding = (AwardToys) objectIn.readObject();
        awarding.showToys(); // -----------------------------------------
        objectIn.close();
        fileIn.close();
        return awarding;
    }
}
