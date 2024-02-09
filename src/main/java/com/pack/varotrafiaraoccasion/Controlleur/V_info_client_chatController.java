package com.pack.varotrafiaraoccasion.Controlleur;
import com.pack.varotrafiaraoccasion.Entity.V_info_client_chat;
import com.pack.varotrafiaraoccasion.Service.V_info_client_chatService;
import java.text.SimpleDateFormat;
import com.pack.varotrafiaraoccasion.Work.Returntype;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping
public class V_info_client_chatController {

 private final V_info_client_chatService v_info_client_chatService;
    
    @Autowired
    public V_info_client_chatController(V_info_client_chatService v_info_client_chatService){
        this.v_info_client_chatService= v_info_client_chatService;
    }

    @GetMapping("/varotrafiaraback/v_info_client_chats")
    public Returntype findAll(){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,new V_info_client_chat().findAll());
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @GetMapping("/varotrafiaraback/v_info_client_chat")
    public Returntype findOne( @RequestParam("id") Long idV_info_client_chat ){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,v_info_client_chatService.findOne(idV_info_client_chat));
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @DeleteMapping("/varotrafiaraback/v_info_client_chat")
    public Returntype  delete(@RequestParam("id") Long idV_info_client_chat){
        Returntype returntype = new Returntype();
        try {
            v_info_client_chatService.delete(idV_info_client_chat);
            returntype = new Returntype(null,"delete");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PutMapping("/varotrafiaraback/v_info_client_chat")
    public Returntype  update(@RequestBody V_info_client_chat table){
        Returntype returntype = new Returntype();
        try {
            v_info_client_chatService.update(table);
            returntype = new Returntype(null,"update");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PostMapping("/varotrafiaraback/v_info_client_chat")
    public Returntype  insert(@RequestBody V_info_client_chat table){
        Returntype returntype = new Returntype();
        try {
            v_info_client_chatService.update(table);
            returntype = new Returntype(null,"insert");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

}
