package org.example.animals;

public class Animal {
    private String name;
    private boolean isDog;

    //constructor
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // getter for boolean id dog
    public boolean isDog() {
        return isDog;
    }

    // toString method to provide string representation of the object
    @Override
    public String toString() {
        return name + " is a dog = " + isDog;
    }

}