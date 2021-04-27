package org.iesfm.DeSerializer;

import org.iesfm.Animal;
import org.iesfm.User;

import java.util.HashMap;
import java.util.Map;
public class UserDeserializer implements Deserializer<User>{
    final static String USERNAME = "username";
    final static String PASSWORD = "password";
    final static String LEVEL = "level";
    @Override
    public User fromStringToObject(String value) {
        Map<String, String> map = new HashMap<>();
        for (String string : value.split(":")){
            String [] fieldValue = string.split(":");
            map.put(fieldValue[0], fieldValue[1]);
        }
        String username = map.get(USERNAME);
        String password = map.get(PASSWORD);
        int level = Integer.parseInt(map.get(LEVEL));
        return new User (username, password, level);
    }
}
