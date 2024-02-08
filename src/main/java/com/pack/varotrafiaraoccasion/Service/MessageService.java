package com.pack.varotrafiaraoccasion.Service;

import com.pack.varotrafiaraoccasion.Entity.Message;
import com.pack.varotrafiaraoccasion.Repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    public MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    public List<Message> getlist(){
       return this.messageRepository.findAll();
    }

    public List<Message> getMessagesByTo(int to) {
        return messageRepository.findByTo1(to);
    }

    public List<Message> getMessagesByToAndFrom(int to , int from){
        return  messageRepository.findByTo1OrFrom2(to,from);
    }

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    public Message updateMessage(String messageId, Message updatedMessage) {
        Optional<Message> existingMessage = messageRepository.findById(messageId);

        if (existingMessage.isEmpty()) {

            Message messageToUpdate = existingMessage.get();
            messageToUpdate.setDatelecture(updatedMessage.getDatelecture());

            return messageRepository.save(messageToUpdate);
        } else {
            return null;
        }
    }

    public Message partialUpdateDateLecture(String id, Date updatedDateLecture) {
        Optional<Message> existingMessage = messageRepository.findById(id);

        if (existingMessage.isEmpty()) {
            Message messageToUpdate = existingMessage.get();
            messageToUpdate.setDatelecture(updatedDateLecture);
            return messageRepository.save(messageToUpdate);
        } else {
            return null;
        }
    }
}
