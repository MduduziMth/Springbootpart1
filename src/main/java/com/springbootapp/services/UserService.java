package com.springbootapp.services;

import org.graalvm.compiler.replacements.nodes.CStringConstant;

public interface UserService {

   void addUser(long id,String name, String surname);
   void removeUser(long Id);
   void getUser(long Id);
}
