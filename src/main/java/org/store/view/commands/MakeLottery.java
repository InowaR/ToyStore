package org.store.view.commands;

import org.store.view.Command;
import org.store.view.ConsoleUI;

public class MakeLottery extends Command {
    public MakeLottery(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Розыгрыш подарков";
    }

    @Override
    public void execute() {
        consoleUI.makeLottery();
    }
}
