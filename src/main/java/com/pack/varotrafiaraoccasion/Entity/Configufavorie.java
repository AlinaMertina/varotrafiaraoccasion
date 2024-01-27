
package com.pack.varotrafiaraoccasion.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;


@Entity
public class Configufavorie{

    public Configufavorie(){}
        @Id
        @SequenceGenerator(
            name = "configufavorie_sequence",
            sequenceName = "configufavorie_sequence",
            allocationSize = 1
        )
        @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "configufavorie_sequence"
        )
          Integer idconfiguration;
          Double bornea;
          Double borneb;
          Integer nombre;
              public void setIdconfiguration( Integer idconfiguration){
                  this.idconfiguration=idconfiguration;
              }
          
              public Integer getIdconfiguration(){
                  return this.idconfiguration;
              }
              public void setBornea( Double bornea){
                  this.bornea=bornea;
              }
          
              public Double getBornea(){
                  return this.bornea;
              }
              public void setBorneb( Double borneb){
                  this.borneb=borneb;
              }
          
              public Double getBorneb(){
                  return this.borneb;
              }
              public void setNombre( Integer nombre){
                  this.nombre=nombre;
              }
          
              public Integer getNombre(){
                  return this.nombre;
              }
}
