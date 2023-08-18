package org.store.view;

import org.store.presenter.Presenter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleUI implements View {
    private Scanner scanner;
    private Presenter presenter;
    private Menu menu;
    private boolean work;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
        this.presenter = new Presenter();
        this.menu = new Menu(this);
        work = true;
    }

    @Override
    public void startApp() throws IOException, ClassNotFoundException {
        while (work) {
            printMenu();
            execute();
        }
    }

    @Override
    public void finish() {
        System.out.println("Выход");
        work = false;
    }

    @Override
    public void execute() throws IOException, ClassNotFoundException {
        System.out.println("Введите номер команды:");
        String line = scanner.next();
        if (checkTextForInt(line)) {
            int numCommand = Integer.parseInt(line);
            if (checkCommand(numCommand)){
                menu.execute(numCommand);
            }
        }
    }

    private boolean checkTextForInt(String text){
        if (text.matches("[0-9]+")){
            return true;
        } else {
            System.out.println("Ошибка ввода");
            return false;
        }
    }

    private boolean checkCommand(int numCommand){
        if (numCommand < menu.getSize()){
            return true;
        } else {
            System.out.println("Ошибка ввода");
            return false;
        }
    }

    @Override
    public void printMenu() {
        System.out.println(menu.menu());
    }

    @Override
    public void addToy() {
        presenter.addToy();
    }

    @Override
    public void showToys() {
        presenter.showToys();
    }

    @Override
    public void makeLottery() {
        presenter.makeTheLottery();
    }

    @Override
    public void showTheWinnerToys() {
        presenter.showTheWinnerToys();
    }

    @Override
    public void saveToys() throws IOException {
        presenter.saveToys();
    }

    @Override
    public void loadToys() throws IOException, ClassNotFoundException {
        presenter.loadToys();
    }

    @Override
    public void saveToy() {
        presenter.saveToy();
    }
}
