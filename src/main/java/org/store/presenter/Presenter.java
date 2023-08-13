package org.store.presenter;

import org.store.model.service.Service;

public class Presenter implements PresenterMethods{
    private Service service;

    public Presenter() {
        this.service = new Service();
    }

    @Override
    public void addToy() {

    }

    @Override
    public void deleteToy() {

    }
}
