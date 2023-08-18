package org.store.view.commands;

import org.store.view.Command;
import org.store.view.ConsoleUI;
import java.io.IOException;

public class LoadToys extends Command {
    public LoadToys(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Загрузить победителей из файла";
    }

    @Override
    public void execute() throws IOException, ClassNotFoundException {
        consoleUI.loadToys();
    }
}
