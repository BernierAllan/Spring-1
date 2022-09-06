package com.allan.helloworld.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.allan.helloworld.data.MessageDAO;
import com.allan.helloworld.model.Message;

@Controller
public class MessageController {
	
	@Autowired
	private MessageDAO messageDAO;
	
	@GetMapping("/messages")
	public String showMessages(Model model) {
		
		model.addAttribute("messageList", messageDAO.findAll());
		model.addAttribute("newMessage", new Message());
		
		return "MessagePage";
	}
	
	@PostMapping("/messages")
	public String postMessage(@ModelAttribute Message newMessage) {
		Message msg = new Message(newMessage.getAuthor(), newMessage.getMessage());
		messageDAO.save(msg);
			
		return "redirect:messages";
		
	}
	
	
	
}
