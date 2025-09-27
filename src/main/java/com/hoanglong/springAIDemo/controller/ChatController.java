package com.hoanglong.springAIDemo.controller;

import com.hoanglong.springAIDemo.dto.request.ChatRequest;
import com.hoanglong.springAIDemo.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat")
@RequiredArgsConstructor
public class ChatController {
    private final ChatService chatService;

    @PostMapping("/ask")
    public String askQuestion(@RequestBody ChatRequest chatRequest) {
        return chatService.generation(chatRequest);
    }
}
