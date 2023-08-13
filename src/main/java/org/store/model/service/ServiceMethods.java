package org.store.model.service;

import org.store.model.toy.Toy;

public interface ServiceMethods {
    void addToy(int id, String name);
    void deleteToy(Toy toy);
}
