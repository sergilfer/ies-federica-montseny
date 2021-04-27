package org.iesfm;

import org.iesfm.Serializer.AnimalSerializer;
import org.iesfm.Serializer.Serializer;
import org.iesfm.Serializer.UserSerializer;

public class Main {
    public static void main(String[] args) {
        Animal animalPrueba = new Animal("red", 21, "tigre");
        Serializer<Animal> animal = new AnimalSerializer();
        System.out.println(animal.fromObjectToString(animalPrueba));

        User user = new User("sergio", "hola", 21);
        Serializer<User> userSerializer = new UserSerializer();
        System.out.println(userSerializer.fromObjectToString(user));
    }
}
