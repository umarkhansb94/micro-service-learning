package com.user.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entites.User;

public interface UserRepository extends JpaRepository<User,String>
{
    //if you want to implement any custom method or query
    //write
}