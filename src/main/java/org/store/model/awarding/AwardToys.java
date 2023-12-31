package org.store.model.awarding;

import org.store.model.awarding.iterator.ToyIterator;
import org.store.model.service.toy.Toy;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class AwardToys implements AwardToysMethods, Serializable {
    private ArrayList<Toy> winToys;

    public AwardToys() {
        this.winToys = new ArrayList<>();
    }

    public ArrayList<Toy> getWinToys() {
        return winToys;
    }

    @Override
    public void addToy(Toy toy) {
        winToys.add(toy);
    }

    @Override
    public void showToys() {
        Iterator<Toy> iterator = new ToyIterator(winToys);
        while (iterator.hasNext()) {
            Toy toy = iterator.next();
            System.out.println(toy);
        }
    }

    @Override
    public void saveToy() {
        try {
            Toy toy = winToys.get(0);
            System.out.println(toy);  // --------------------
            try {
                FileWriter writer = new FileWriter("last_toy.txt", true);
                writer.write(toy.getId() + " " + toy.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            winToys.remove(toy);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Список пуст");
        }
    }
}
