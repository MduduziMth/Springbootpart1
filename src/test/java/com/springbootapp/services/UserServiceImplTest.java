package com.springbootapp.services;

import com.springbootapp.Interface.FakeRepo;
import com.springbootapp.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {


    UserServiceImpl userService = new UserServiceImpl();


    @Test
    void addUser() {
        assertEquals("Mdu entered", userService.addUser(1,"Mdu","Mthethwa"));
    }
    @Test
    void removeUser() {
        userService.addUser(2,"Jurgen","Klopp");
        assertEquals("Jurgen removed",userService.removeUser(2));

    }

    @Test
    void getUser() {
        userService.addUser(3,"Putin","Vladmir");
        assertEquals("hello Putin",userService.getUser(3));
    }
}