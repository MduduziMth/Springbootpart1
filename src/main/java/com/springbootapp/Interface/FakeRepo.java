package com.springbootapp.Interface;

import com.springbootapp.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FakeRepo implements FakeRepoInterface {

    ArrayList<User> userArray = new ArrayList<>();


    @Override
    public void insertUser(long id, String name, String surname) {
        User user = new User(id,name,surname);
        userArray.add(user);

    }


    @Override
    public User findUserById(long Id) {

       return userArray.get((int)Id);

    }

    @Override
    public void deleteUser(long id) {

        userArray.remove((id));
    }
}
