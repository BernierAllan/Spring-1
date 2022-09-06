package com.m2i.RestWithBdd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.RestWithBdd.entity.Message;
import com.m2i.RestWithBdd.service.MessageService;

@RestController
public class MessageController {

	@Autowired
	MessageService service;
	
	@GetMapping("/message")
	public List<Message> getMessages(){
		return service.getMessage();
	}
	
	@PostMapping("/message")
	public Message postMessage(@RequestBody Message m) {
		return service.postMessage(m);
	}
	
	@PutMapping("/message")
	public Message putMessage(@RequestBody Message m) {
		return service.putMessage(m);
	}
	
	@DeleteMapping("/message/{id}")
	public String delMessage(@PathVariable int id) {
		return service.deleteMessage(id);
	}
}
