package com.pack.varotrafiaraoccasion.Repository;
import com.pack.varotrafiaraoccasion.Entity.V_info_client_chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface V_info_client_chatRepository  extends JpaRepository<V_info_client_chat,Long>{
    
    @Query(value = "select * from v_info_client_chat where idv_info_client_chat=:idv_info_client_chat", nativeQuery = true)
    public java.util.Optional<V_info_client_chat> findOne(@Param("idv_info_client_chat") Long idv_info_client_chat);
}
