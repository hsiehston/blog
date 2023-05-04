package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MessageController {
    
    @Autowired
    private MessageRepository messageRepository;
    
    @GetMapping("/messages")
    public String getAllMessages(Model model) {
        List<Message> messages = messageRepository.findAll();
        model.addAttribute("messages", messages);
        model.addAttribute("message", new Message());
        return "messages";
    }
    
    @PostMapping("/messages")
    public String addMessage(@ModelAttribute Message message, Model model) {
        messageRepository.save(message);
        model.addAttribute("resultMsg", "留言已提交");
        List<Message> messages = messageRepository.findAll();
        model.addAttribute("messages", messages);
        model.addAttribute("message", new Message());
        return "messages";
    }
    
}

