package com.pack.varotrafiaraoccasion.Controlleur;
import com.pack.varotrafiaraoccasion.Entity.Messagepostegres;
import com.pack.varotrafiaraoccasion.Entity.Notification;
import com.pack.varotrafiaraoccasion.Service.MessagepostegresService;
import com.pack.varotrafiaraoccasion.Service.NotificationService;

import java.text.SimpleDateFormat;

import com.pack.varotrafiaraoccasion.Work.GetConversation;
import com.pack.varotrafiaraoccasion.Work.Returntype;

import lombok.RequiredArgsConstructor;

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
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class MessagepostegresController {

    private final MessagepostegresService messagepostegresService;
    private final NotificationService notificationService;  

    @GetMapping("/varotrafiaraback/messagepostegress")
    public Returntype findAll(){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,messagepostegresService.findAll());
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }
    @PostMapping("/varotrafiaraback/conversation")
    public Returntype findConversation( @RequestBody GetConversation getconv){
        Returntype returntype = new Returntype();
        try {
            System.out.println("conversation "+getconv.getId()+" "+getconv.getId1());
            returntype = new Returntype(null,new Messagepostegres().findAll(getconv.getId(),getconv.getId1()));
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }


    @GetMapping("/varotrafiaraback/messagepostegres")
    public Returntype findOne( @RequestParam("id") Long idMessagepostegres ){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,messagepostegresService.findOne(idMessagepostegres));
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @DeleteMapping("/varotrafiaraback/messagepostegres")
    public Returntype  delete(@RequestParam("id") Long idMessagepostegres){
        Returntype returntype = new Returntype();
        try {
            messagepostegresService.delete(idMessagepostegres);
            returntype = new Returntype(null,"delete");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PutMapping("/varotrafiaraback/messagepostegres")
    public Returntype  update(@RequestBody Messagepostegres table){
        Returntype returntype = new Returntype();
        try {
            messagepostegresService.update(table);
            returntype = new Returntype(null,"update");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PostMapping("/varotrafiaraback/messagepostegres")
    public Returntype  insert(@RequestBody Messagepostegres table){
        Returntype returntype = new Returntype();
        try {
            messagepostegresService.update(table);
            Integer nbrnotification = notificationService.getNbrnotification(table.getFrom2());
            if(nbrnotification==null){
                nbrnotification=0;
                Notification notification = new Notification(null, table.getFrom2(), 1);
                notificationService.update(notification);
                returntype = new Returntype(null,"insert");
            }else{
                notificationService.updatenotif(table.getFrom2(), nbrnotification+1);
                returntype = new Returntype(null,"insert");
            }
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

}
