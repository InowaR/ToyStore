package org.store.presenter;

import org.store.model.awarding.AwardToys;
import org.store.model.awarding.fileHandler.SaveLoadFile;
import org.store.model.awarding.fileHandler.Writeable;
import org.store.model.service.Service;
import org.store.model.service.toy.Toy;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Presenter implements PresenterMethods {
    private Service service;
    private AwardToys awarding;

    public Presenter() {
        this.service = new Service();
        this.awarding = new AwardToys();
    }

    @Override
    public void addToy() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название игрушки:");
            String name = scanner.nextLine();
            System.out.println("Введите количество игрушек:");
            int numberOfToys = scanner.nextInt();
            System.out.println("Введите частоту выпадения игрушки:");
            int frequency = scanner.nextInt();
            service.addToy(name, numberOfToys, frequency);
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        }
    }

    @Override
    public void showToys() {
        service.showToys();
    }

    @Override
    public void makeTheLottery() {
        Toy toy = service.makeTheLottery();
        if (!awarding.getWinToys().contains(toy)) {
            awarding.addToy(toy);
            System.out.println("Выиграл приз: " + toy);
        } else {
            try {
                makeTheLottery();
            } catch (StackOverflowError e) {
                System.out.println("Подарки закончились");
            }
        }
    }

    @Override
    public void showTheWinnerToys() {
        System.out.println("Список победителей:");
        awarding.showToys();
    }

    @Override
    public void saveToys() throws IOException {
        Writeable save = new SaveLoadFile();
        save.saveToFile(awarding);
    }

    @Override
    public void loadToys() throws IOException, ClassNotFoundException {
        Writeable load = new SaveLoadFile();
        this.awarding = load.loadFromFile();
    }

    @Override
    public void saveToy() {
        System.out.println("-----------");
        awarding.saveToy();
    }
}
