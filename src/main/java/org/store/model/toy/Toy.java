package org.store.model.toy;

public class Toy {
    private int id;
    private String name;
    private float frequency;

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

    public float getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return getId() + ", " + getName() + ", " + getFrequency();
    }
}
