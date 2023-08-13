package org.store.view;

import org.store.presenter.Presenter;
import java.util.Scanner;

public class View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    public View() {
        this.scanner = new Scanner(System.in);
        this.presenter = new Presenter();
        work = true;
    }

    public void execute() {
        System.out.println("Введите номер команды:");
        int number = scanner.nextInt();
        if (number == 1) {
            presenter.addToy();
        } else if (number == 2) {
            presenter.showToys();
        } else if (number == 3) {
            finish();
        } else {
            System.out.println("Такой команды нет");
        }
    }

    public void printMenu() {
        System.out.println("Главное меню:");
        System.out.println("1. Добавить игрушку");
        System.out.println("2. Показать список игрушек");
        System.out.println("3. Выход");
    }

    public void finish() {
        System.out.println("Выход");
        work = false;
    }

    public void startApp(){
        while(work) {
            printMenu();
            execute();
        }
    }
}
