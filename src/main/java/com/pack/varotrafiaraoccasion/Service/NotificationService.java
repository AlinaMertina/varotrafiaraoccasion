package com.pack.varotrafiaraoccasion.Service;

import com.pack.varotrafiaraoccasion.Entity.Notification;
import com.pack.varotrafiaraoccasion.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class NotificationService {
    NotificationRepository notificationRepository;

    @Autowired
    public NotificationService(NotificationRepository notificationRepository){
        this.notificationRepository=notificationRepository;
    }

    public java.util.List<Notification> findAll(){
        return notificationRepository.findAll();
    }

    public Notification findOne(Long idNotification ){
        return notificationRepository.findOne(idNotification).get();
    }

    public void delete(Long idNotification){
        notificationRepository.deleteById(idNotification);
    }

    public void update(Notification table){
        notificationRepository.save(table);
    }
    public Integer getNbrnotification( Long idnotification){
        return notificationRepository.getNbrnotification(idnotification);
    }

  
    public void updatenotif(Long idnotification,Integer nbr){
        try {
            notificationRepository.updatenotif(idnotification, nbr);
        } catch (Exception e) {
           System.out.println(e);
        }
             
    }
}
