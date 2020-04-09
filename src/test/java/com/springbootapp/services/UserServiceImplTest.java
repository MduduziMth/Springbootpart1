package com.springbootapp.services;

import com.springbootapp.Interface.FakeRepo;
import com.springbootapp.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {

    @Autowired
    private FakeRepo fakeRepo;

    private User user;


    @Test
    void addUser() {
    }

    @Test
    void removeUser() {
    }

    @Test
    void getUser() {
    }
}