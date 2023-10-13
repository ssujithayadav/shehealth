package com.myapp.shehealth.repository;

import com.myapp.shehealth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
   User findByName(String name);

}
