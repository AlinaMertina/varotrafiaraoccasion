package com.pack.varotrafiaraoccasion.Repository;
import com.pack.varotrafiaraoccasion.Entity.V_admin_valideannonce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface V_admin_valideannonceRepository  extends JpaRepository<V_admin_valideannonce,Long>{
    
    @Query(value = "select * from v_admin_valideannonce where idv_admin_valideannonce=:idv_admin_valideannonce", nativeQuery = true)
    public java.util.Optional<V_admin_valideannonce> findOne(@Param("idv_admin_valideannonce") Long idv_admin_valideannonce);

    @Query(value = "select * from v_admin_valideannonce where idcaracteristique=:idcaracteristique", nativeQuery = true)
    public java.util.Optional<V_admin_valideannonce> findCaracteristique(@Param("idcaracteristique") Long idv_admin_valideannonce);
}
