package org.store.view;

import org.store.presenter.Presenter;
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
    public void startApp() {
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
    public void execute() {
        System.out.println("Введите номер команды:");
        int numCommand = scanner.nextInt();
        menu.execute(numCommand);
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
    public void saveToys() {
        presenter.saveToys();
    }
}
