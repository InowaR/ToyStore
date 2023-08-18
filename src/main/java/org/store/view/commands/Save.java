package org.store.view.commands;

import org.store.view.Command;
import org.store.view.ConsoleUI;

import java.io.IOException;

public class Save extends Command {
    public Save(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Сохранить подарок";
    }

    @Override
    public void execute() throws IOException, ClassNotFoundException {
        consoleUI.saveToy();
    }
}
