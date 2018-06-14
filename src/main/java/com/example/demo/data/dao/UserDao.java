package com.example.demo.data.dao;


import com.example.demo.data.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserDao extends CrudRepository<User,Long>  {

    //@Query("select * from user where user_name = ?")
    User findByUserName(String userName);
}
