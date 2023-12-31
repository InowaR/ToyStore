package org.store.view.commands;

import org.store.view.Command;
import org.store.view.ConsoleUI;

public class ShowToys extends Command {
    public ShowToys(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Показать список товаров в магазине";
    }

    @Override
    public void execute() {
        consoleUI.showToys();
    }
}
