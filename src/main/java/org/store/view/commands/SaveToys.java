package org.store.view.commands;

import org.store.view.Command;
import org.store.view.ConsoleUI;

public class SaveToys extends Command {
    public SaveToys(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Сохранить игрушки в файл";
    }

    @Override
    public void execute() {
        consoleUI.saveToys();
    }
}
