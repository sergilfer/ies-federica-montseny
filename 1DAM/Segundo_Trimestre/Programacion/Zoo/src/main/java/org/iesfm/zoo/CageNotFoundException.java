package org.iesfm.zoo;

import java.util.Objects;

public class CageNotFoundException extends Exception{
    private int cage;

    public CageNotFoundException(int cage) {
        this.cage = cage;
    }

    public int getCage() {
        return cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CageNotFoundException that = (CageNotFoundException) o;
        return cage == that.cage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cage);
    }
}
