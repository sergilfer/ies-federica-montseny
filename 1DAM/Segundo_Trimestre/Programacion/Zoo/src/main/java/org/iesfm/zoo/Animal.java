package org.iesfm.zoo;

import java.util.Objects;

public class Animal {
    private String specie;
    private String feeding;
    private int cage;
//----------------------- CONSTRUCTOR ----------------------- //
    public Animal(String specie, String feeding, int cage) {
        this.specie = specie;
        this.feeding = feeding;
        this.cage = cage;
    }
    //----------------------- METODOS ----------------------- //

    //----------------------- GET Y SET ----------------------- //
    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    public int getCage() {
        return cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }
    //----------------------- EQUALS Y HASH ----------------------- //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return cage == animal.cage &&
                Objects.equals(specie, animal.specie) &&
                Objects.equals(feeding, animal.feeding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specie, feeding, cage);
    }
}
