package com.edreydenis.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edreydenis.portfolio.entities.Category;

//pode ou nao ter a annotation de repository, pq ja extende a jparepository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
