package org.store.presenter;

import org.store.model.service.toy.Toy;

import java.io.IOException;

public interface PresenterMethods {
    void addToy();
    void showToys();
    void makeTheLottery();
    void showTheWinnerToys();
    void saveToys() throws IOException;
    void loadToys() throws IOException, ClassNotFoundException;
}
