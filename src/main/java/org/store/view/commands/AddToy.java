package org.store.view.commands;

import org.store.view.Command;
import org.store.view.ConsoleUI;

public class AddToy extends Command {
    public AddToy(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить игрушку";
    }

    @Override
    public void execute() {
        consoleUI.addToy();
    }
}
