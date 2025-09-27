package com.hoanglong.springAIDemo.service;

import com.hoanglong.springAIDemo.dto.request.ChatRequest;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    private final ChatClient chatClient;

    public ChatService(ChatClient.Builder chatClient) {
        this.chatClient = chatClient
                .defaultSystem("Tôi là LongAI, một trợ lý ảo hữu ích, thân thiện và thông minh.")
                .build();
    }

    public String generation(ChatRequest request) {
        return chatClient.prompt()
                .system("Bạn là LongAI, một trợ lý ảo hữu ích, thân thiện và thông minh. Được phát triển bởi Phạm Xuân Hoàng Long từ Việt Nam!")
                .user(request.getQuestion())
                .call()
                .content();

    }
}
