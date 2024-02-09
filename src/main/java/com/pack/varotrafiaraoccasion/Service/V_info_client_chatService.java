package com.pack.varotrafiaraoccasion.Service;

import com.pack.varotrafiaraoccasion.Entity.V_info_client_chat;
import com.pack.varotrafiaraoccasion.Repository.V_info_client_chatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class V_info_client_chatService {
    V_info_client_chatRepository v_info_client_chatRepository;

    @Autowired
    public V_info_client_chatService(V_info_client_chatRepository v_info_client_chatRepository){
        this.v_info_client_chatRepository=v_info_client_chatRepository;
    }

    public java.util.List<V_info_client_chat> findAll(){
        return v_info_client_chatRepository.findAll();
    }

    public V_info_client_chat findOne(Long idV_info_client_chat ){
        return v_info_client_chatRepository.findOne(idV_info_client_chat).get();
    }

    public void delete(Long idV_info_client_chat){
        v_info_client_chatRepository.deleteById(idV_info_client_chat);
    }

    public void update(V_info_client_chat table){
        v_info_client_chatRepository.save(table);
    }
}
