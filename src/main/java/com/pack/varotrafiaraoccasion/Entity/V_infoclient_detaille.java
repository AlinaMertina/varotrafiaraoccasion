
package com.pack.varotrafiaraoccasion.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pack.varotrafiaraoccasion.Work.ConnectionPostgres;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import java.util.*;
import java.sql.*;

@Entity
public class V_infoclient_detaille{

    public V_infoclient_detaille(){}
        @Id
        @SequenceGenerator(
            name = "v_infoclient_detaille_sequence",
            sequenceName = "v_infoclient_detaille_sequence",
            allocationSize = 1
        )
        @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "v_infoclient_detaille_sequence"
        )
          Long nbr;
          Long idclient;
          Long idetat;
              public void setNbr( Long nbr){
                  this.nbr=nbr;
              }
          
              public Long getNbr(){
                  return this.nbr;
              }
              public void setIdclient( Long idclient){
                  this.idclient=idclient;
              }
          
              public Long getIdclient(){
                  return this.idclient;
              }
              public void setIdetat( Long idetat){
                  this.idetat=idetat;
              }
          
              public Long getIdetat(){
                  return this.idetat;
              }
         public List<V_infoclient_detaille> findAll()  {
            List<V_infoclient_detaille> vInfoclientDetailles = new ArrayList<V_infoclient_detaille>();
            try {
                ConnectionPostgres con = new ConnectionPostgres();
                Connection connection = con.getconnexion();
                Statement statement = connection.createStatement();
                String query = "SELECT * FROM v_infoclient_detaille";
                ResultSet resultSet = statement.executeQuery(query);
    
                while (resultSet.next()) {
                    V_infoclient_detaille vInfoclientDetaille = new V_infoclient_detaille();
                    vInfoclientDetaille.setNbr(resultSet.getLong("nbr"));
                    vInfoclientDetaille.setIdclient(resultSet.getLong("idclient"));
                    vInfoclientDetaille.setIdetat(resultSet.getLong("idetat"));
                    vInfoclientDetailles.add(vInfoclientDetaille);
                }
    
            } catch (SQLException e) {
                System.out.println(e);
            }
            return vInfoclientDetailles;
        }
        public List<V_infoclient_detaille> finddetaille(Long idclient) {
            List<V_infoclient_detaille> vInfoclientDetailles = new ArrayList<V_infoclient_detaille>();
            try {
                ConnectionPostgres con = new ConnectionPostgres();
                Connection connection = con.getconnexion();
                Statement statement = connection.createStatement();
                String query = "SELECT * FROM v_infoclient_detaille where idclient="+idclient;
                ResultSet resultSet = statement.executeQuery(query);
    
                while (resultSet.next()) {
                    V_infoclient_detaille vInfoclientDetaille = new V_infoclient_detaille();
                    vInfoclientDetaille.setNbr(resultSet.getLong("nbr"));
                    vInfoclientDetaille.setIdclient(resultSet.getLong("idclient"));
                    vInfoclientDetaille.setIdetat(resultSet.getLong("idetat"));
                    vInfoclientDetailles.add(vInfoclientDetaille);
                }
    
              
            } catch (SQLException e) {
               System.out.println(e);
            }
            return vInfoclientDetailles;
        }
        
}
