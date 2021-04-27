package org.iesfm.Serializer;

import org.iesfm.Animal;



public class AnimalSerializer implements Serializer<Animal>{

    @Override
    public String fromObjectToString(Animal a) {
        String color =a.getColor();
        int age = a.getAge();
        String specie =a.getSpecie();
        return "color:" + color + " " + "edad:" + age + " " + "especie:" + specie;
    }
}
