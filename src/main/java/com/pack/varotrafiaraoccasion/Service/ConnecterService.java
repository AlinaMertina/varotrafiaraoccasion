package com.pack.varotrafiaraoccasion.Service;

import com.pack.varotrafiaraoccasion.Entity.Connecter;
import com.pack.varotrafiaraoccasion.Repository.ConnecterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ConnecterService {
    ConnecterRepository connecterRepository;

    @Autowired
    public ConnecterService(ConnecterRepository connecterRepository){
        this.connecterRepository=connecterRepository;
    }

    public java.util.List<Connecter> findAll(){
        return connecterRepository.findAll();
    }

    public Connecter findOne(Long idConnecter ){
        return connecterRepository.findOne(idConnecter).get();
    }

    public void delete(Long idConnecter){
        connecterRepository.deleteById(idConnecter);
    }

    public void update(Connecter table){
        connecterRepository.save(table);
    }
}
