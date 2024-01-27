
package com.pack.varotrafiaraoccasion.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;


@Entity
public class V_admin_valideannonce{

    public V_admin_valideannonce(){}
        @Id
        @SequenceGenerator(
            name = "v_admin_valideannonce_sequence",
            sequenceName = "v_admin_valideannonce_sequence",
            allocationSize = 1
        )
        @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "v_admin_valideannonce_sequence"
        )
          String nom;
          String prenom;
          java.util.Date datevalidation;
          String email;
          
             Long idcaracteristique;
              public void setNom( String nom){
                  this.nom=nom;
              }
          
              public String getNom(){
                  return this.nom;
              }
              public void setPrenom( String prenom){
                  this.prenom=prenom;
              }
          
              public String getPrenom(){
                  return this.prenom;
              }
              public void setDatevalidation( java.util.Date datevalidation){
                  this.datevalidation=datevalidation;
              }
          
              public java.util.Date getDatevalidation(){
                  return this.datevalidation;
              }
              public void setEmail( String email){
                  this.email=email;
              }
          
              public String getEmail(){
                  return this.email;
              }
            public Long getIdcaracteristique() {
            return idcaracteristique;
            }

            public void setIdcaracteristique(Long idcaracteristique) {
                this.idcaracteristique = idcaracteristique;
            }
}
