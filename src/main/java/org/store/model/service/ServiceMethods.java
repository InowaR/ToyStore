package org.store.model.service;

import org.store.model.service.toy.Toy;

public interface ServiceMethods {
    void addToy(String name, int numberOfToys, float frequency);
    void showToys();
    Toy makeTheLottery();
}
