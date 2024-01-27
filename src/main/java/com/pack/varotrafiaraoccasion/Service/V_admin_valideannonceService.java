package com.pack.varotrafiaraoccasion.Service;

import com.pack.varotrafiaraoccasion.Entity.V_admin_valideannonce;
import com.pack.varotrafiaraoccasion.Repository.V_admin_valideannonceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class V_admin_valideannonceService {
    V_admin_valideannonceRepository v_admin_valideannonceRepository;

    @Autowired
    public V_admin_valideannonceService(V_admin_valideannonceRepository v_admin_valideannonceRepository){
        this.v_admin_valideannonceRepository=v_admin_valideannonceRepository;
    }

    public java.util.List<V_admin_valideannonce> findAll(){
        return v_admin_valideannonceRepository.findAll();
    }

    public V_admin_valideannonce findOne(Long idV_admin_valideannonce ){
        return v_admin_valideannonceRepository.findOne(idV_admin_valideannonce).get();
    }
    public V_admin_valideannonce findCaracteristique(Long idV_admin_valideannonce){
        return v_admin_valideannonceRepository.findCaracteristique(idV_admin_valideannonce).get();
    }

    public void delete(Long idV_admin_valideannonce){
        v_admin_valideannonceRepository.deleteById(idV_admin_valideannonce);
    }

    public void update(V_admin_valideannonce table){
        v_admin_valideannonceRepository.save(table);
    }
}
