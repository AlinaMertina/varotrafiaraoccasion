package com.pack.varotrafiaraoccasion.Repository;
import com.pack.varotrafiaraoccasion.Entity.Connecter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface ConnecterRepository  extends JpaRepository<Connecter,Long>{
    
    @Query(value = "select * from connecter where idconnecter=:idconnecter", nativeQuery = true)
    public java.util.Optional<Connecter> findOne(@Param("idconnecter") Long idconnecter);

    @Query(value = "update connecter set datedeconnexion=now() where idclient=:idclient", nativeQuery = true)
    public void  updateconnecter(@Param("idclient") Long idconnecter);
}
