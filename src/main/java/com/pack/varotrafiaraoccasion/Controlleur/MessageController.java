package com.pack.varotrafiaraoccasion.Controlleur;

import com.pack.varotrafiaraoccasion.Service.MessageService;
import com.pack.varotrafiaraoccasion.Work.Returntype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import com.pack.varotrafiaraoccasion.Entity.Message;
import com.pack.varotrafiaraoccasion.Repository.MessageRepository;

@RestController
@RequestMapping
public class MessageController {

    private final MessageService messageService;
    
    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/varotrafiaraback/messages")
    public Returntype getAllChats() {
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null, messageService.getlist());
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(), null);
        }
        return returntype;
    }


    @GetMapping("/varotrafiaraback/messages/{to}")
    public Returntype getMessagesByTo(@PathVariable int to) {
        Returntype returntype = new Returntype();
        try {
            List<Message> messages = messageService.getMessagesByTo(to);
            returntype.setData(messages);
        } catch (Exception e) {
            returntype.setError(e.getMessage());
        }
        return returntype;
    }

    @GetMapping("/varotrafiaraback/message/{to1}")
    public Returntype getMessagesByToAndFrom(@PathVariable int to1) {
        Returntype returntype = new Returntype();
        try {
            List<Message> messages = messageService.getMessagesByToAndFrom(to1,to1);
            returntype.setData(messages);
        } catch (Exception e) {
            returntype.setError(e.getMessage());
        }
        return returntype;
    }

    @PostMapping("/varotrafiaraback/messages/save")
    public Returntype saveMessage(@RequestBody Message message) {
        Returntype returntype = new Returntype();
        try {
            Message savedMessage = messageService.saveMessage(message);
            returntype.setData(savedMessage);
        } catch (Exception e) {
            returntype.setError(e.getMessage());
        }
        return returntype;
    }

    @PutMapping("/update/{id}")
    public Returntype updateMessage(@PathVariable String id, @RequestBody Message updatedMessage) {
        Returntype returntype = new Returntype();
        try {
            Message updated = messageService.updateMessage(id, updatedMessage);
            if (updated != null) {
                returntype.setData(updated);
            } else {
                returntype.setError("Message not found");
            }
        } catch (Exception e) {
            returntype.setError(e.getMessage());
        }
        return returntype;
    }

    @PatchMapping("/partial-update-date-lecture/{id}")
    public Returntype partialUpdateDateLecture(@PathVariable String id, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date dateLecture) {
        Returntype returntype = new Returntype();
        try {
            Message updated = messageService.partialUpdateDateLecture(id, dateLecture);
            System.out.println("messg "+dateLecture);
            if (updated != null) {
                returntype.setData(updated);
            } else {
                returntype.setError("Message not found");
            }
        } catch (Exception e) {
            returntype.setError(e.getMessage());
        }
        return returntype;
    }



    /*@GetMapping("/{id}")
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
    }*/
}
