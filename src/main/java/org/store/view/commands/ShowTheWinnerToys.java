package org.store.view.commands;

import org.store.view.Command;
import org.store.view.ConsoleUI;

public class ShowTheWinnerToys extends Command {
    public ShowTheWinnerToys(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Показать список победителей";
    }

    @Override
    public void execute() {
        consoleUI.showTheWinnerToys();
    }
}
