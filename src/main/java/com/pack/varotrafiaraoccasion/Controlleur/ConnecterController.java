package com.pack.varotrafiaraoccasion.Controlleur;
import com.pack.varotrafiaraoccasion.Entity.Connecter;
import com.pack.varotrafiaraoccasion.Service.ConnecterService;
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
public class ConnecterController {

 private final ConnecterService connecterService;
    
    @Autowired
    public ConnecterController(ConnecterService connecterService){
        this.connecterService= connecterService;
    }

    @GetMapping("/varotrafiaraback/connecters")
    public Returntype findAll(){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,connecterService.findAll());
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @GetMapping("/varotrafiaraback/connecter")
    public Returntype findOne( @RequestParam("id") Long idConnecter ){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,connecterService.findOne(idConnecter));
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @DeleteMapping("/varotrafiaraback/connecter")
    public Returntype  delete(@RequestParam("id") Long idConnecter){
        Returntype returntype = new Returntype();
        try {
            connecterService.delete(idConnecter);
            returntype = new Returntype(null,"delete");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PutMapping("/varotrafiaraback/connecter")
    public Returntype  update(@RequestBody Connecter table){
        Returntype returntype = new Returntype();
        try {
            connecterService.update(table);
            returntype = new Returntype(null,"update");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PostMapping("/varotrafiaraback/connecter")
    public Returntype  insert(@RequestBody Connecter table){
        Returntype returntype = new Returntype();
        try {
            connecterService.update(table);
            returntype = new Returntype(null,"insert");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

}
