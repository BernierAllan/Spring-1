package com.m2i.RestWithBdd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.RestWithBdd.entity.Message;
import com.m2i.RestWithBdd.repository.MessageRepository;

@Service
public class MessageService {

	
	@Autowired
	MessageRepository repo;
	
	
	public List<Message> getMessage(){
		return repo.findAll();
	}
	
	public Message postMessage(Message m) {
		return repo.save(m);
	}
	
	public Message putMessage(Message m) {
		Message newMessage = repo.findById(m.getId()).orElse(null);
		if (newMessage != null) {
			newMessage.setAuthor( m.getAuthor());
			newMessage.setDate( m.getDate());
			newMessage.setText( m.getText());
			repo.save(newMessage);
						
		}

		return newMessage;
	}
	
	public String deleteMessage(int id) {
		if ( repo.findById(id).isPresent() ) {
			repo.deleteById(id);
			return "Message deleted :" + id;
		}
		return "Message not found :" + id;
	}
	
}
