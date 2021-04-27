package org.iesfm.DeSerializer;

import org.iesfm.Animal;
import org.iesfm.User;

import java.util.HashMap;
import java.util.Map;

public class AnimalDeserializer implements Deserializer<Animal>{
    final static String COLOR = "color";
    final static String AGE = "edad";
    final static String SPECIE = "especie";

    @Override
    public Animal fromStringToObject(String value) {
        Map<String, String> map = new HashMap<>();
        for (String string : value.split(":")){
            String [] fieldValue = string.split(":");
            map.put(fieldValue[0], fieldValue[1]);
        }
        String color = map.get(COLOR);
        int age = Integer.parseInt(map.get(AGE));
        String specie = map.get(SPECIE);
        return new Animal(color,age,specie);
    }
}
