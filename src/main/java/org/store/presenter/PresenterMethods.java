package org.store.presenter;

import java.io.IOException;

public interface PresenterMethods {
    void addToy();
    void showToys();
    void makeTheLottery();
    void showTheWinnerToys();
    void saveToys() throws IOException;
    void loadToys() throws IOException, ClassNotFoundException;
    void saveToy();
}
