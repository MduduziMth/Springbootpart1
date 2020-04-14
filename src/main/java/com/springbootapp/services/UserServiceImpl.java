package com.springbootapp.services;

import com.springbootapp.model.User;
import com.springbootapp.Interface.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private FakeRepo fakeRepo;

    private User user;


    @Override
    public String addUser(long id, String name, String surname){
        fakeRepo = new FakeRepo();
        fakeRepo.insertUser(id,name,surname);
        return name + " entered";
    }
    @Override
    public String removeUser(long Id){
        fakeRepo = new FakeRepo();
        return  fakeRepo.deleteUser(Id) + " removed";

    }
    @Override
    public String getUser(long Id){
        user = fakeRepo.findUserById(Id);
        return "hello " + user.getName();

    }
}
