package com.example.chatbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/api")
    public String chat(@RequestBody String message) {

        return chatService.getResponse(message);
    }
}
