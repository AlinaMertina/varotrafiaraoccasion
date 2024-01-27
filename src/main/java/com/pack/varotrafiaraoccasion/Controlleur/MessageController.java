package com.pack.varotrafiaraoccasion.Controlleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.pack.varotrafiaraoccasion.Entity.Message;
import com.pack.varotrafiaraoccasion.Repository.MessageRepository;

@RestController
@RequestMapping("/varotrafiaraback/messages")
public class MessageController {

    private final MessageRepository messageRepository;
    
    @Autowired
    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping("/{id}")
    public Message getMessageById(@PathVariable Long id) {
        return messageRepository.findById(id).orElse(null);
    }

    @GetMapping("/all")
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @PostMapping("/create")
    public Message createMessage(@RequestBody Message message) {
        return messageRepository.save(message);
    }

    @PutMapping("/update")
    public Message updateMessage(@RequestBody Message message) {
        return messageRepository.save(message);
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable Long id) {
        messageRepository.deleteById(id);
    }
}
