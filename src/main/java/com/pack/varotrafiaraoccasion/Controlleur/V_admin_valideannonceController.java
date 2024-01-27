package com.pack.varotrafiaraoccasion.Controlleur;
import com.pack.varotrafiaraoccasion.Entity.V_admin_valideannonce;
import com.pack.varotrafiaraoccasion.Service.V_admin_valideannonceService;
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
public class V_admin_valideannonceController {

 private final V_admin_valideannonceService v_admin_valideannonceService;
    
    @Autowired
    public V_admin_valideannonceController(V_admin_valideannonceService v_admin_valideannonceService){
        this.v_admin_valideannonceService= v_admin_valideannonceService;
    }

    @GetMapping("/varotrafiaraback/v_admin_valideannonces")
    public Returntype findAll(){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,v_admin_valideannonceService.findAll());
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }
    @PostMapping("/varotrafiaraback/v_admin_valideannonceC")
    public Returntype findCaracteristique(@RequestBody  Long idV_admin_valideannonce ){
        Returntype returntype = new Returntype();
        try {
            System.out.println("id admin "+idV_admin_valideannonce);
            returntype = new Returntype(null,v_admin_valideannonceService.findCaracteristique(idV_admin_valideannonce));
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }


    @GetMapping("/varotrafiaraback/v_admin_valideannonce")
    public Returntype findOne( @RequestParam("id") Long idV_admin_valideannonce ){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,v_admin_valideannonceService.findOne(idV_admin_valideannonce));
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @DeleteMapping("/varotrafiaraback/v_admin_valideannonce")
    public Returntype  delete(@RequestParam("id") Long idV_admin_valideannonce){
        Returntype returntype = new Returntype();
        try {
            v_admin_valideannonceService.delete(idV_admin_valideannonce);
            returntype = new Returntype(null,"delete");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PutMapping("/varotrafiaraback/v_admin_valideannonce")
    public Returntype  update(@RequestBody V_admin_valideannonce table){
        Returntype returntype = new Returntype();
        try {
            v_admin_valideannonceService.update(table);
            returntype = new Returntype(null,"update");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PostMapping("/varotrafiaraback/v_admin_valideannonce")
    public Returntype  insert(@RequestBody V_admin_valideannonce table){
        Returntype returntype = new Returntype();
        try {
            v_admin_valideannonceService.update(table);
            returntype = new Returntype(null,"insert");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

}
