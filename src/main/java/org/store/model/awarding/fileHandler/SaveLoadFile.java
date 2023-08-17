package org.store.model.awarding.fileHandler;

import org.store.model.awarding.AwardToys;
import java.io.*;

public class SaveLoadFile implements Writeable {
    @Override
    public void saveToFile(AwardToys awarding) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("toys.txt");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(awarding);
        objectOut.close();
        fileOut.close();
        System.out.println("записано");
    }

    @Override
    public AwardToys loadFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("toys.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        AwardToys awarding = (AwardToys) objectIn.readObject();
        objectIn.close();
        fileIn.close();
        System.out.println("загружено");
        return awarding;
    }
}
