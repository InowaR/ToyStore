package org.store.model.service.toy;

import java.io.Serializable;

public class Toy implements Serializable {
    private int id;
    private String name;
    private double frequency;

    public Toy(int id, String name, float frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return getId() + ", " + getName() + ", " + getFrequency();
    }
}
