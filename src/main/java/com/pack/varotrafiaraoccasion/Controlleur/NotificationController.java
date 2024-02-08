package com.pack.varotrafiaraoccasion.Controlleur;
import com.pack.varotrafiaraoccasion.Entity.Notification;
import com.pack.varotrafiaraoccasion.Service.NotificationService;
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
public class NotificationController {

 private final NotificationService notificationService;
    
    @Autowired
    public NotificationController(NotificationService notificationService){
        this.notificationService= notificationService;
    }

    @PostMapping("/varotrafiaraback/readnotification")
    public Returntype readNotification(@RequestBody Long idclient){
        // System.out.println(" nbr notification "+idNotification);
        Returntype returntype = new Returntype();
        try {
            notificationService.updatenotif(idclient,0);
            returntype = new Returntype(null, "valider");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PostMapping("/varotrafiaraback/getnotification")
    public Returntype getNotification(@RequestBody Long idNotification){
        System.out.println(" nbr notification "+idNotification);
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,notificationService.getNbrnotification(idNotification) );
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @GetMapping("/varotrafiaraback/notifications")
    public Returntype findAll(){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,notificationService.findAll());
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @GetMapping("/varotrafiaraback/notification")
    public Returntype findOne( @RequestParam("id") Long idNotification ){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,notificationService.findOne(idNotification));
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @DeleteMapping("/varotrafiaraback/notification")
    public Returntype  delete(@RequestParam("id") Long idNotification){
        Returntype returntype = new Returntype();
        try {
            notificationService.delete(idNotification);
            returntype = new Returntype(null,"delete");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }


    @PutMapping("/varotrafiaraback/notification")
    public Returntype  update(@RequestBody Notification table){
        Returntype returntype = new Returntype();
        try {
            notificationService.update(table);
            returntype = new Returntype(null,"update");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PostMapping("/varotrafiaraback/notification")
    public Returntype  insert(@RequestBody Notification table){
        Returntype returntype = new Returntype();
        try {
            notificationService.update(table);
            returntype = new Returntype(null,"insert");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

}
