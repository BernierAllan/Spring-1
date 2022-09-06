package com.allan.helloworld.data;

import org.springframework.stereotype.Service;

import com.allan.helloworld.model.Message;

import org.springframework.data.jpa.repository.JpaRepository; 

@Service
public interface MessageDAO extends JpaRepository<Message, Long>{

}
