package com.edreydenis.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edreydenis.portfolio.entities.User;

//pode ou nao ter a annotation de repository, pq ja extende a jparepository
public interface UserRepository extends JpaRepository<User, Long>{

}
