package org.store.presenter;

import org.store.model.service.Service;
import java.util.Scanner;

public class Presenter implements PresenterMethods{
    private Service service;

    public Presenter() {
        this.service = new Service();
    }

    @Override
    public void addToy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название игрушки:");
        String name = scanner.nextLine();
        System.out.println("Введите количество игрушек:");
        int numberOfToys = scanner.nextInt();
        System.out.println("Введите частоту выпадения игрушки:");
        int frequency = scanner.nextInt();
        service.addToy(name, numberOfToys, frequency);
    }

    @Override
    public void showToys() {
        service.showToys();
    }
}
