package com.springbootapp.services;

import org.graalvm.compiler.replacements.nodes.CStringConstant;

public interface UserService {

   String addUser(long id,String name, String surname);
   String removeUser(long Id);
   String getUser(long Id);
}
