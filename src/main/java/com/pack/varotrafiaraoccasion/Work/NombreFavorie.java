package com.pack.varotrafiaraoccasion.Work;
import java.util.*;

import com.pack.varotrafiaraoccasion.Entity.Configufavorie;

import java.sql.*;
public class NombreFavorie {
    Integer nombre;
    Long idcaracteristique;
    Integer nombreEtoil;
    
    public Integer getNombreEtoil() {
        return nombreEtoil;
    }
    public void setNombreEtoil(Integer nombreEtoil) {
        this.nombreEtoil = nombreEtoil;
    }
    public Integer getNombre() {
        return nombre;
    }
    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }
    public Long getIdcaracteristique() {
        return idcaracteristique;
    }
    public void setIdcaracteristique(Long idcaracteristique) {
        this.idcaracteristique = idcaracteristique;
    }
    public NombreFavorie() {
    }
    public NombreFavorie(Integer nombre, Long idcaracteristique) {
        this.nombre = nombre;
        this.idcaracteristique = idcaracteristique;
    }
    public Integer nombreEtoil(List<Configufavorie> liste ,Integer nbr){
        for (int i = 0; i < liste.size(); i++) {
            if(nbr>=liste.get(i).getBornea() && nbr<liste.get(i).getBorneb()){
                return liste.get(i).getNombre();
            }
        }
        return 0;
    }
    
    public NombreFavorie(Integer nombre, Long idcaracteristique, Integer nombreEtoil) {
        this.nombre = nombre;
        this.idcaracteristique = idcaracteristique;
        this.nombreEtoil = nombreEtoil;
    }
    public List<NombreFavorie> findAll(List<Configufavorie> liste) {
        List<NombreFavorie> nombreFavorieList = new ArrayList<>();
        try {
            ConnectionPostgres con = new ConnectionPostgres();
            Connection connection = con.getconnexion();
            Statement statement = connection.createStatement();
            String query = "select count(*) as nbr,idfcaracteristique from favorietest   group by idfcaracteristique order by idfcaracteristique asc";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Integer nombre = resultSet.getInt("nbr");
                Long idcaracteristique = resultSet.getLong("idfcaracteristique");
                NombreFavorie nombreFavorie = new NombreFavorie(nombre, idcaracteristique,nombreEtoil(liste,resultSet.getInt("nbr")));
                nombreFavorieList.add(nombreFavorie);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Gérer les exceptions de manière appropriée dans une application réelle
        }

        return nombreFavorieList;
    }

}
