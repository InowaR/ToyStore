package org.store.view.commands;

import org.store.view.Command;
import org.store.view.ConsoleUI;
import java.io.IOException;

public class SaveToys extends Command {
    public SaveToys(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Сохранить подарки в файл";
    }

    @Override
    public void execute() throws IOException {
        consoleUI.saveToys();
    }
}
