package com.pack.varotrafiaraoccasion.Controlleur;
import com.pack.varotrafiaraoccasion.Entity.Configufavorie;
import com.pack.varotrafiaraoccasion.Service.ConfigufavorieService;
import java.text.SimpleDateFormat;
import com.pack.varotrafiaraoccasion.Work.Returntype;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping
public class ConfigufavorieController {

 private final ConfigufavorieService configufavorieService;
    
    @Autowired
    public ConfigufavorieController(ConfigufavorieService configufavorieService){
        this.configufavorieService= configufavorieService;
    }

    @GetMapping("/varotrafiaraback/configufavories")
    public Returntype findAll(){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,configufavorieService.findAll());
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @GetMapping("/varotrafiaraback/configufavorie")
    public Returntype findOne( @RequestParam("id") Long idConfigufavorie ){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,configufavorieService.findOne(idConfigufavorie));
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @DeleteMapping("/varotrafiaraback/configufavorie")
    public Returntype  delete(@RequestParam("id") Long idConfigufavorie){
        Returntype returntype = new Returntype();
        try {
            configufavorieService.delete(idConfigufavorie);
            returntype = new Returntype(null,"delete");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PutMapping("/varotrafiaraback/configufavorie")
    public Returntype  update(@RequestBody Configufavorie table){
        Returntype returntype = new Returntype();
        try {
            configufavorieService.update(table);
            returntype = new Returntype(null,"update");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PostMapping("/varotrafiaraback/configufavorie")
    public Returntype  insert(@RequestBody Configufavorie table){
        Returntype returntype = new Returntype();
        try {
            configufavorieService.update(table);
            returntype = new Returntype(null,"insert");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

}
