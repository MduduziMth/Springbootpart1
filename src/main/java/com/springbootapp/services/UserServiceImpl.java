package com.springbootapp.services;

import com.springbootapp.model.User;
import com.springbootapp.Interface.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private FakeRepo fakeRepo;

    private User user;



    public void addUser(long id, String name, String surname){
        fakeRepo.insertUser(id,name,surname);
        System.out.println(name + "entered");
    }

    public void removeUser(long Id){

        user = fakeRepo.findUserById(Id);
        String name = user.getName();
        fakeRepo.deleteUser(Id);
        System.out.println( name + "removed");

    }

    public void getUser(long Id){
        user = fakeRepo.findUserById(Id);
        System.out.println( "hello" + user.getName());

    }
}
