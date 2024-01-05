
package com.pack.varotrafiaraoccasion.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;


@Entity
public class Caracteristique{

    public Caracteristique(){}
        @Id
        @SequenceGenerator(
            name = "caracteristique_sequence",
            sequenceName = "caracteristique_sequence",
            allocationSize = 1
        )
        @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "caracteristique_sequence"
        )
          Long idcaracteristique;
          Long idfetat;
          Long idclient;
          Long idfboitedevitesse;
          Long idfmarque;
          Long idfmodel;
          Long idfenergie;
          Long idftypevehicule;
          Long idlocalisation;
          Double autonomie;
          Double kilometrage;
          java.util.Date anneedefabrication;
          java.util.Date annemodel;
          Double capacite;
          Double consomation;
          Double prixdevente;
          Long coleur;
          Integer nbrporte;
          Integer nbrplace;
          Double longueur;
          Double largeur;
          Double hauteur;
          Double volumeducoffre;
          Double commission;
              public void setIdcaracteristique( Long idcaracteristique){
                  this.idcaracteristique=idcaracteristique;
              }
          
              public Long getIdcaracteristique(){
                  return this.idcaracteristique;
              }
              public void setIdfetat( Long idfetat){
                  this.idfetat=idfetat;
              }
          
              public Long getIdfetat(){
                  return this.idfetat;
              }
              public void setIdclient( Long idclient){
                  this.idclient=idclient;
              }
          
              public Long getIdclient(){
                  return this.idclient;
              }
              public void setIdfboitedevitesse( Long idfboitedevitesse){
                  this.idfboitedevitesse=idfboitedevitesse;
              }
          
              public Long getIdfboitedevitesse(){
                  return this.idfboitedevitesse;
              }
              public void setIdfmarque( Long idfmarque){
                  this.idfmarque=idfmarque;
              }
          
              public Long getIdfmarque(){
                  return this.idfmarque;
              }
              public void setIdfmodel( Long idfmodel){
                  this.idfmodel=idfmodel;
              }
          
              public Long getIdfmodel(){
                  return this.idfmodel;
              }
              public void setIdfenergie( Long idfenergie){
                  this.idfenergie=idfenergie;
              }
          
              public Long getIdfenergie(){
                  return this.idfenergie;
              }
              public void setIdftypevehicule( Long idftypevehicule){
                  this.idftypevehicule=idftypevehicule;
              }
          
              public Long getIdftypevehicule(){
                  return this.idftypevehicule;
              }
              public void setIdlocalisation( Long idlocalisation){
                  this.idlocalisation=idlocalisation;
              }
          
              public Long getIdlocalisation(){
                  return this.idlocalisation;
              }
              public void setAutonomie( Double autonomie){
                  this.autonomie=autonomie;
              }
          
              public Double getAutonomie(){
                  return this.autonomie;
              }
              public void setKilometrage( Double kilometrage){
                  this.kilometrage=kilometrage;
              }
          
              public Double getKilometrage(){
                  return this.kilometrage;
              }
              public void setAnneedefabrication( java.util.Date anneedefabrication){
                  this.anneedefabrication=anneedefabrication;
              }
          
              public java.util.Date getAnneedefabrication(){
                  return this.anneedefabrication;
              }
              public void setAnnemodel( java.util.Date annemodel){
                  this.annemodel=annemodel;
              }
          
              public java.util.Date getAnnemodel(){
                  return this.annemodel;
              }
              public void setCapacite( Double capacite){
                  this.capacite=capacite;
              }
          
              public Double getCapacite(){
                  return this.capacite;
              }
              public void setConsomation( Double consomation){
                  this.consomation=consomation;
              }
          
              public Double getConsomation(){
                  return this.consomation;
              }
              public void setPrixdevente( Double prixdevente){
                  this.prixdevente=prixdevente;
              }
          
              public Double getPrixdevente(){
                  return this.prixdevente;
              }
              public void setColeur( Long coleur){
                  this.coleur=coleur;
              }
          
              public Long getColeur(){
                  return this.coleur;
              }
              public void setNbrporte( Integer nbrporte){
                  this.nbrporte=nbrporte;
              }
          
              public Integer getNbrporte(){
                  return this.nbrporte;
              }
              public void setNbrplace( Integer nbrplace){
                  this.nbrplace=nbrplace;
              }
          
              public Integer getNbrplace(){
                  return this.nbrplace;
              }
              public void setLongueur( Double longueur){
                  this.longueur=longueur;
              }
          
              public Double getLongueur(){
                  return this.longueur;
              }
              public void setLargeur( Double largeur){
                  this.largeur=largeur;
              }
          
              public Double getLargeur(){
                  return this.largeur;
              }
              public void setHauteur( Double hauteur){
                  this.hauteur=hauteur;
              }
          
              public Double getHauteur(){
                  return this.hauteur;
              }
              public void setVolumeducoffre( Double volumeducoffre){
                  this.volumeducoffre=volumeducoffre;
              }
          
              public Double getVolumeducoffre(){
                  return this.volumeducoffre;
              }
              public void setCommission( Double commission){
                  this.commission=commission;
              }
          
              public Double getCommission(){
                  return this.commission;
              }
}
