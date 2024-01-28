package com.pack.varotrafiaraoccasion.Service;

import com.pack.varotrafiaraoccasion.Entity.Messagepostegres;
import com.pack.varotrafiaraoccasion.Repository.MessagepostegresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MessagepostegresService {
    MessagepostegresRepository messagepostegresRepository;

    @Autowired
    public MessagepostegresService(MessagepostegresRepository messagepostegresRepository){
        this.messagepostegresRepository=messagepostegresRepository;
    }

    public java.util.List<Messagepostegres> findAll(){
        return messagepostegresRepository.findAll();
    }
    public java.util.List<Messagepostegres> findConversation(Long idclient,Long iclient1){
        return messagepostegresRepository.findConversation(idclient,idclient );
    }

    public Messagepostegres findOne(Long idMessagepostegres ){
        return messagepostegresRepository.findOne(idMessagepostegres).get();
    }

    public void delete(Long idMessagepostegres){
        messagepostegresRepository.deleteById(idMessagepostegres);
    }

    public void update(Messagepostegres table){
        messagepostegresRepository.save(table);
    }
}
