package com.user.services;


import java.util.List;

import com.user.entites.User;



public interface UserService {

    //user operations

    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user of given userId

    User getUser(String userId);

    //TODO: delete
    //TODO: update


}