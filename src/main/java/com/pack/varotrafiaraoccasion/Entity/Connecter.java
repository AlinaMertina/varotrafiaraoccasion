
package com.pack.varotrafiaraoccasion.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;


@Entity
public class Connecter{

    public Connecter(){}
        @Id
        @SequenceGenerator(
            name = "connecter_sequence",
            sequenceName = "connecter_sequence",
            allocationSize = 1
        )
        @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "connecter_sequence"
        )
          Long idconnecter;
          Long idclient;
          java.util.Date datedeconnexion;
              public void setIdconnecter( Long idconnecter){
                  this.idconnecter=idconnecter;
              }
          
              public Long getIdconnecter(){
                  return this.idconnecter;
              }
              public void setIdclient( Long idclient){
                  this.idclient=idclient;
              }
          
              public Long getIdclient(){
                  return this.idclient;
              }
              public void setDatedeconnexion( java.util.Date datedeconnexion){
                  this.datedeconnexion=datedeconnexion;
              }
          
              public java.util.Date getDatedeconnexion(){
                  return this.datedeconnexion;
              }

            public Connecter(Long idconnecter, Long idclient, Date datedeconnexion) {
                this.idconnecter = idconnecter;
                this.idclient = idclient;
                this.datedeconnexion = datedeconnexion;
            }
              
}
