package com.chat.app.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {
	public Long id;
	public String sender;
	public String content;
}
