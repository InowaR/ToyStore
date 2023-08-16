package org.store.view;

import org.store.view.commands.AddToy;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<Command> commandList;

    public Menu(ConsoleUI consoleUI) {
        commandList = new ArrayList<>();
        commandList.add(new AddToy(consoleUI));
    }

    public String menu() {
        System.out.println("Меню:");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append(i);
            stringBuilder.append(". ");
            stringBuilder.append(commandList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int choice) {
        Command command = commandList.get(choice);
        command.execute();
    }
}
