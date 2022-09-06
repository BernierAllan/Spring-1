package com.m2i.RestWithBdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.RestWithBdd.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer>{

}


