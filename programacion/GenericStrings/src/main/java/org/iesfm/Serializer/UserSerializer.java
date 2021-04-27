package org.iesfm.Serializer;

import org.iesfm.User;

import java.util.Scanner;

public class UserSerializer implements Serializer<User>{

    @Override
    public String fromObjectToString(User a) {
        String name =  a.getUsername();
        String password =  a.getPassword();
        int level = a.getLevel();
        return "username:" + name + " " +"password:" + password + " " + "level:" + level;
    }
}
