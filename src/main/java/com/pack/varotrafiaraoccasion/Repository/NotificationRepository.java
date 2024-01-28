package com.pack.varotrafiaraoccasion.Repository;
import com.pack.varotrafiaraoccasion.Entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface NotificationRepository  extends JpaRepository<Notification,Long>{
    
    @Query(value = "select * from notification where idnotification=:idnotification", nativeQuery = true)
    public java.util.Optional<Notification> findOne(@Param("idnotification") Long idnotification);

    @Query(value = "select nbrnotification from notification where idclient=:idclient", nativeQuery = true)
    public Integer getNbrnotification(@Param("idclient") Long idnotification);

    @Query(value = "update notification set nbrnotification=:nbr where idclient=:idclient", nativeQuery = true)
    public void updatenotif(@Param("idclient") Long idnotification,@Param("nbr") Integer nbr);

}
