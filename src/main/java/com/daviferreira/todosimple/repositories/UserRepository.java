package com.daviferreira.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daviferreira.todosimple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
    

}
