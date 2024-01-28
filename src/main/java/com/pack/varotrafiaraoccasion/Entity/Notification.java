
package com.pack.varotrafiaraoccasion.Entity;

import com.pack.varotrafiaraoccasion.Work.ConnectionPostgres;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import java.util.*;
import java.sql.*;



@Entity

public class Notification{

    public Notification(){}
        @Id
        @SequenceGenerator(
            name = "notification_sequence",
            sequenceName = "notification_sequence",
            allocationSize = 1
        )
        @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "notification_sequence"
        )
          Long idnotification;
          Long idclient;
          Integer nbrnotification;
              public void setIdnotification( Long idnotification){
                  this.idnotification=idnotification;
              }
          
              public Long getIdnotification(){
                  return this.idnotification;
              }
              public void setIdclient( Long idclient){
                  this.idclient=idclient;
              }
          
              public Long getIdclient(){
                  return this.idclient;
              }
              public void setNbrnotification( Integer nbrnotification){
                  this.nbrnotification=nbrnotification;
              }
          
              public Integer getNbrnotification(){
                  return this.nbrnotification;
              }

            public Notification(Long idnotification, Long idclient, Integer nbrnotification) {
                this.idnotification = idnotification;
                this.idclient = idclient;
                this.nbrnotification = nbrnotification;
            }
       
}
