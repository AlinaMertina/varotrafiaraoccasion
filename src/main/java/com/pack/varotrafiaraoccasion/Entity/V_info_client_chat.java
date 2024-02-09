
package com.pack.varotrafiaraoccasion.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.pack.varotrafiaraoccasion.Work.ConnectionPostgres;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import java.util.*;
import java.sql.*;

@Entity
public class V_info_client_chat{

    public V_info_client_chat(){}
        @Id
        @SequenceGenerator(
            name = "v_info_client_chat_sequence",
            sequenceName = "v_info_client_chat_sequence",
            allocationSize = 1
        )
        @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "v_info_client_chat_sequence"
        )
          Long idclient;
          String nomclient;
          String prenomclient;
          java.util.Date datenaissance;
          String email;
          String nomgenre;
          String tel;
          String nomlocalisation;
          java.util.Date datedeconnexion;
              public void setIdclient( Long idclient){
                  this.idclient=idclient;
              }
          
              public Long getIdclient(){
                  return this.idclient;
              }
              public void setNomclient( String nomclient){
                  this.nomclient=nomclient;
              }
          
              public String getNomclient(){
                  return this.nomclient;
              }
              public void setPrenomclient( String prenomclient){
                  this.prenomclient=prenomclient;
              }
          
              public String getPrenomclient(){
                  return this.prenomclient;
              }
              public void setDatenaissance( java.util.Date datenaissance){
                  this.datenaissance=datenaissance;
              }
          
              public java.util.Date getDatenaissance(){
                  return this.datenaissance;
              }
              public void setEmail( String email){
                  this.email=email;
              }
          
              public String getEmail(){
                  return this.email;
              }
              public void setNomgenre( String nomgenre){
                  this.nomgenre=nomgenre;
              }
          
              public String getNomgenre(){
                  return this.nomgenre;
              }
              public void setTel( String tel){
                  this.tel=tel;
              }
          
              public String getTel(){
                  return this.tel;
              }
              public void setNomlocalisation( String nomlocalisation){
                  this.nomlocalisation=nomlocalisation;
              }
          
              public String getNomlocalisation(){
                  return this.nomlocalisation;
              }
              public void setDatedeconnexion( java.util.Date datedeconnexion){
                  this.datedeconnexion=datedeconnexion;
              }
          
              public java.util.Date getDatedeconnexion(){
                  return this.datedeconnexion;
              }

            public V_info_client_chat(Long idclient, String nomclient, String prenomclient, Date datenaissance,
                    String email, String nomgenre, String tel, String nomlocalisation, Date datedeconnexion) {
                this.idclient = idclient;
                this.nomclient = nomclient;
                this.prenomclient = prenomclient;
                this.datenaissance = datenaissance;
                this.email = email;
                this.nomgenre = nomgenre;
                this.tel = tel;
                this.nomlocalisation = nomlocalisation;
                this.datedeconnexion = datedeconnexion;
            }

        public List<V_info_client_chat> findAll() {
                    List<V_info_client_chat> resultList = new ArrayList<>();
                     try {
                        ConnectionPostgres con = new ConnectionPostgres();
                        Connection connection = con.getconnexion();
                        Statement statement = connection.createStatement();
                        String query = "SELECT * FROM V_info_client_chat";
                        ResultSet resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                          
                           V_info_client_chat v_info_client_chat = new V_info_client_chat( resultSet.getLong("idclient"),resultSet.getString("nomclient"),resultSet.getString("prenomclient"), resultSet.getDate("datenaissance"),resultSet.getString("email"),resultSet.getString("nomgenre"),resultSet.getString("tel"),resultSet.getString("nomlocalisation"),resultSet.getDate("datedeconnexion"));

                            resultList.add(v_info_client_chat);
                        }
                        
                    } catch (SQLException e) {
                        e.printStackTrace(); // Gestion des exceptions à améliorer selon votre besoin
                    }

            return resultList;
        }
}
