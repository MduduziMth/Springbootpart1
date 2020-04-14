package com.springbootapp.Interface;

import com.springbootapp.model.User;

public interface FakeRepoInterface  {

    void insertUser(long id, String name, String surname);

    User findUserById(long Id);

    String deleteUser(long id);


}
