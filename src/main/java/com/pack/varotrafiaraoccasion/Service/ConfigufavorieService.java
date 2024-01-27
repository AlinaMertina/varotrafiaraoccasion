package com.pack.varotrafiaraoccasion.Service;

import com.pack.varotrafiaraoccasion.Entity.Configufavorie;
import com.pack.varotrafiaraoccasion.Repository.ConfigufavorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ConfigufavorieService {
    ConfigufavorieRepository configufavorieRepository;

    @Autowired
    public ConfigufavorieService(ConfigufavorieRepository configufavorieRepository){
        this.configufavorieRepository=configufavorieRepository;
    }

    public java.util.List<Configufavorie> findAll(){
        return configufavorieRepository.findAll();
    }

    public Configufavorie findOne(Long idConfigufavorie ){
        return configufavorieRepository.findOne(idConfigufavorie).get();
    }

    public void delete(Long idConfigufavorie){
        configufavorieRepository.deleteById(idConfigufavorie);
    }

    public void update(Configufavorie table){
        configufavorieRepository.save(table);
    }
}
