package com.pack.varotrafiaraoccasion.Repository;
import com.pack.varotrafiaraoccasion.Entity.V_infoclient_detaille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface V_infoclient_detailleRepository  extends JpaRepository<V_infoclient_detaille,Long>{
    
    @Query(value = "select * from v_infoclient_detaille where idv_infoclient_detaille=:idv_infoclient_detaille", nativeQuery = true)
    public java.util.Optional<V_infoclient_detaille> findOne(@Param("idv_infoclient_detaille") Long idv_infoclient_detaille);

    @Query(value = "select * from v_infoclient_detaille where idclient=:idclient", nativeQuery = true)
    public java.util.List<V_infoclient_detaille> detaille(@Param("idclient") Long idv_infoclient_detaille);
}
