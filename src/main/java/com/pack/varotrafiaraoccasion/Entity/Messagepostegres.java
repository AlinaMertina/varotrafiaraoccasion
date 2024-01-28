
package com.pack.varotrafiaraoccasion.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import java.util.*;

import com.pack.varotrafiaraoccasion.Work.ConnectionPostgres;

import java.sql.*;

@Entity
public class Messagepostegres{

    public Messagepostegres(){}
        @Id
        @SequenceGenerator(
            name = "messagepostegres_sequence",
            sequenceName = "messagepostegres_sequence",
            allocationSize = 1
        )
        @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "messagepostegres_sequence"
        )
          Long idmessage;
          Long to1;
          Long from2;
          String content;
          java.util.Date datesend;
          java.util.Date datelecture;
              public void setIdmessage( Long idmessage){
                  this.idmessage=idmessage;
              }
          
              public Long getIdmessage(){
                  return this.idmessage;
              }
              public void setTo1( Long to1){
                  this.to1=to1;
              }
          
              public Long getTo1(){
                  return this.to1;
              }
              public void setFrom2( Long from2){
                  this.from2=from2;
              }
          
              public Long getFrom2(){
                  return this.from2;
              }
              public void setContent( String content){
                  this.content=content;
              }
          
              public String getContent(){
                  return this.content;
              }
              public void setDatesend( java.util.Date datesend){
                  this.datesend=datesend;
              }
          
              public java.util.Date getDatesend(){
                  return this.datesend;
              }
              public void setDatelecture( java.util.Date datelecture){
                  this.datelecture=datelecture;
              }
          
              public java.util.Date getDatelecture(){
                  return this.datelecture;
              }
        public List<Messagepostegres> findAll(Long id,Long id1) {
                List<Messagepostegres> messages = new ArrayList<>();

                try {
                        ConnectionPostgres con = new ConnectionPostgres();
                        Connection connection = con.getconnexion();
                        Statement statement = connection.createStatement();
                        
                        String query = "select * from messagepostegres where (to1="+id+" or to1="+id1+") and   (from2="+id+" or from2="+id1+")";
                        ResultSet resultSet = statement.executeQuery(query);
                                while (resultSet.next()) {
                                Messagepostegres message = new Messagepostegres();
                                message.setIdmessage(resultSet.getLong("idmessage"));
                                message.setTo1(resultSet.getLong("to1"));
                                message.setFrom2(resultSet.getLong("from2"));
                                message.setContent(resultSet.getString("content"));
                                message.setDatesend(resultSet.getDate("datesend"));
                                message.setDatelecture(resultSet.getDate("datelecture"));
                                messages.add(message);
                            }
                        
                    
                } catch (SQLException e) {
                    e.printStackTrace();
                    // Gérer les exceptions appropriées
                }
            return messages;
        }
}
