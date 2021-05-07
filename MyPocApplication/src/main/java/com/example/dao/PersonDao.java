package com.example.dao;

import org.springframework.stereotype.Repository;

import com.example.model.Person;

@Repository
public interface PersonDao extends MongoRepository<Person,Integer> {

}
