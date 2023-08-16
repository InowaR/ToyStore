package org.store.view.commands;

import org.store.view.Command;
import org.store.view.ConsoleUI;

public class Finish extends Command {
    public Finish(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Выход";
    }

    @Override
    public void execute() {
        consoleUI.finish();
    }
}
