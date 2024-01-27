package com.pack.varotrafiaraoccasion.Repository;
import com.pack.varotrafiaraoccasion.Entity.Configufavorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface ConfigufavorieRepository  extends JpaRepository<Configufavorie,Long>{
    
    @Query(value = "select * from configufavorie where idconfigufavorie=:idconfigufavorie", nativeQuery = true)
    public java.util.Optional<Configufavorie> findOne(@Param("idconfigufavorie") Long idconfigufavorie);
}
