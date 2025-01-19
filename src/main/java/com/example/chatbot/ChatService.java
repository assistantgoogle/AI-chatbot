package com.example.chatbot;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChatService {
    private final String OPENAI_API_URL = "https://api.openai.com/v1/chat/completions";
    private final String API_KEY = "YOUR_API_KEY"; // Replace with your OpenAI API key

    public String getResponse(String message) {
        // Logic to interact with OpenAI API and get response
        // Use RestTemplate to send request to OpenAI API
        return "Response from OpenAI"; // Placeholder response
    }
}
