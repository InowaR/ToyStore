package org.store;

import org.store.view.ConsoleUI;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ConsoleUI v = new ConsoleUI();
        v.startApp();
    }
}