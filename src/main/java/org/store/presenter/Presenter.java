package org.store.presenter;

import org.store.model.awarding.AwardToys;
import org.store.model.service.Service;
import org.store.model.service.toy.Toy;
import java.util.Scanner;

public class Presenter implements PresenterMethods{
    private Service service;
    private AwardToys awarding;

    public Presenter() {
        this.service = new Service();
        this.awarding = new AwardToys();
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

    @Override
    public void makeTheLottery() {
        Toy toy = service.makeTheLottery();
        awarding.addToy(toy);
        System.out.println("Выиграл приз: " + toy);
    }
}
