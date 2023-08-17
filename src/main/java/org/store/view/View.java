package org.store.view;

import java.io.IOException;

public interface View {
    void startApp() throws IOException, ClassNotFoundException;
    void finish();
    void execute() throws IOException, ClassNotFoundException;
    void printMenu();
    void addToy();
    void showToys();
    void makeLottery();
    void showTheWinnerToys();
    void saveToys() throws IOException;
    void loadToys() throws IOException, ClassNotFoundException;
}
