package com.edreydenis.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edreydenis.portfolio.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
