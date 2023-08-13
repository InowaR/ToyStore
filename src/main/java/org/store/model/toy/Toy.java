package org.store.model.toy;

public class Toy {
    private int id;
    private String name;
    private int numberOfToys;
    private float frequency;

    public Toy(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfToys() {
        return numberOfToys;
    }

    public void setNumberOfToys(int numberOfToys) {
        this.numberOfToys = numberOfToys;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return getName();
    }
}
