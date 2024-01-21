
package com.pack.varotrafiaraoccasion.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;


@Entity
public class V_detail_statistique_annonce{

    public V_detail_statistique_annonce(){}
        @Id
        @SequenceGenerator(
            name = "v_detail_statistique_annonce_sequence",
            sequenceName = "v_detail_statistique_annonce_sequence",
            allocationSize = 1
        )
        @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "v_detail_statistique_annonce_sequence"
        )
          Long idetat;
          String nommarque;
          Long idmarque;
          Long count;
          Double annee;
          Double mois;
              public void setIdetat( Long idetat){
                  this.idetat=idetat;
              }
          
              public Long getIdetat(){
                  return this.idetat;
              }
              public void setNommarque( String nommarque){
                  this.nommarque=nommarque;
              }
          
              public String getNommarque(){
                  return this.nommarque;
              }
              public void setIdmarque( Long idmarque){
                  this.idmarque=idmarque;
              }
          
              public Long getIdmarque(){
                  return this.idmarque;
              }
              public void setCount( Long count){
                  this.count=count;
              }
          
              public Long getCount(){
                  return this.count;
              }
              public void setAnnee( Double annee){
                  this.annee=annee;
              }
          
              public Double getAnnee(){
                  return this.annee;
              }
              public void setMois( Double mois){
                  this.mois=mois;
              }
          
              public Double getMois(){
                  return this.mois;
              }
}
