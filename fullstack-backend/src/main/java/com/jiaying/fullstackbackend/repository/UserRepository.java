package com.jiaying.fullstackbackend.repository;

import com.jiaying.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
