package com.pack.varotrafiaraoccasion.Repository;
import com.pack.varotrafiaraoccasion.Entity.Messagepostegres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface MessagepostegresRepository  extends JpaRepository<Messagepostegres,Long>{
    
    @Query(value = "select * from messagepostegres where idmessagepostegres=:idmessagepostegres", nativeQuery = true)
    public java.util.Optional<Messagepostegres> findOne(@Param("idmessagepostegres") Long idmessagepostegres);

    @Query(value = "select * from messagepostegres where (to1=:idclient or to1=:idclient1) and   (from2=:idclient or from2=:idclient1)", nativeQuery = true)
    public java.util.List<Messagepostegres> findConversation(@Param("idclient") Long idclient1,@Param("idclient1") Long idclient );
}
