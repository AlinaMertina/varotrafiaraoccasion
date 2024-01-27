package com.pack.varotrafiaraoccasion.Service;

import com.pack.varotrafiaraoccasion.Entity.V_infoclient_detaille;
import com.pack.varotrafiaraoccasion.Repository.V_infoclient_detailleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class V_infoclient_detailleService {
    V_infoclient_detailleRepository v_infoclient_detailleRepository;

    @Autowired
    public V_infoclient_detailleService(V_infoclient_detailleRepository v_infoclient_detailleRepository){
        this.v_infoclient_detailleRepository=v_infoclient_detailleRepository;
    }

    public java.util.List<V_infoclient_detaille> findAll(){
        return v_infoclient_detailleRepository.findAll();
    }
    public java.util.List<V_infoclient_detaille> detaille(Long idclient){
        return v_infoclient_detailleRepository.detaille(idclient);
    }

    public V_infoclient_detaille findOne(Long idV_infoclient_detaille ){
        return v_infoclient_detailleRepository.findOne(idV_infoclient_detaille).get();
    }

    public void delete(Long idV_infoclient_detaille){
        v_infoclient_detailleRepository.deleteById(idV_infoclient_detaille);
    }

    public void update(V_infoclient_detaille table){
        v_infoclient_detailleRepository.save(table);
    }
}
