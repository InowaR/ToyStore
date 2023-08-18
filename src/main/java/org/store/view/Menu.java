package org.store.view;

import org.store.view.commands.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<Command> commandList;

    public Menu(ConsoleUI consoleUI) {
        commandList = new ArrayList<>();
        commandList.add(new AddToy(consoleUI));
        commandList.add(new ShowToys(consoleUI));
        commandList.add(new MakeLottery(consoleUI));
        commandList.add(new ShowTheWinnerToys(consoleUI));
        commandList.add(new SaveToys(consoleUI));
        commandList.add(new LoadToys(consoleUI));
        commandList.add(new Save(consoleUI));
        commandList.add(new Finish(consoleUI));
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

    public void execute(int choice) throws IOException, ClassNotFoundException {
        Command command = commandList.get(choice);
        command.execute();
    }
}
