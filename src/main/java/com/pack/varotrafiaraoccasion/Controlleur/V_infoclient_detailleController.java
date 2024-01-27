package com.pack.varotrafiaraoccasion.Controlleur;
import com.pack.varotrafiaraoccasion.Entity.V_infoclient_detaille;
import com.pack.varotrafiaraoccasion.Service.V_infoclient_detailleService;
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
public class V_infoclient_detailleController {

 private final V_infoclient_detailleService v_infoclient_detailleService;
    
    @Autowired
    public V_infoclient_detailleController(V_infoclient_detailleService v_infoclient_detailleService){
        this.v_infoclient_detailleService= v_infoclient_detailleService;
    }

    @GetMapping("/varotrafiaraback/v_infoclient_detailles")
    public Returntype findAll(){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,v_infoclient_detailleService.findAll());
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @GetMapping("/varotrafiaraback/v_infoclient_detaille")
    public Returntype findOne( @RequestParam("id") Long idV_infoclient_detaille ){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,new V_infoclient_detaille().finddetaille(idV_infoclient_detaille));
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @DeleteMapping("/varotrafiaraback/v_infoclient_detaille")
    public Returntype  delete(@RequestParam("id") Long idV_infoclient_detaille){
        Returntype returntype = new Returntype();
        try {
            v_infoclient_detailleService.delete(idV_infoclient_detaille);
            returntype = new Returntype(null,"delete");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PutMapping("/varotrafiaraback/v_infoclient_detaille")
    public Returntype  update(@RequestBody V_infoclient_detaille table){
        Returntype returntype = new Returntype();
        try {
            v_infoclient_detailleService.update(table);
            returntype = new Returntype(null,"update");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PostMapping("/varotrafiaraback/v_infoclient_detaille")
    public Returntype  insert(@RequestBody V_infoclient_detaille table){
        Returntype returntype = new Returntype();
        try {
            v_infoclient_detailleService.update(table);
            returntype = new Returntype(null,"insert");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

}
