package empresa;

import java.util.Objects;

public class Employee {
    String name, surnames, nif, position;
    private int cp;

    //-------------------------- CONSTRUCTOR -----------------------------------//
    public Employee(String name, String surnames, String nif, String position, int cp) {
        this.name = name;
        this.surnames = surnames;
        this.nif = nif;
        this.position = position;
        this.cp = cp;
    }
    //-------------------------- METODOS PUBLICOS -----------------------------------//

    public void info() {
        System.out.println("nombre: " + name + " apellidos: " + surnames + " nif: " + nif +
                " tiene una posicion: " + position);
    }

    //-------------- GETTERS, SETTERS, HASHCODDE, EQUALS --------------//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return cp == employee.cp &&
                Objects.equals(name, employee.name) &&
                Objects.equals(surnames, employee.surnames) &&
                Objects.equals(nif, employee.nif) &&
                Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surnames, nif, position, cp);
    }
}

