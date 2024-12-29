package com.chat.app.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.chat.app.entity.ChatMessage;

@Controller
public class ChatController {

	@MessageMapping("/sendMessage")
	@SendTo("/topic/messages")
	public ChatMessage sendMessage(ChatMessage message) {
		System.out.println("message: "+message);
		return message;
	}
	
	@GetMapping("chat")
	public String chat() {
		return "chat";
	}
}
