package com.pack.varotrafiaraoccasion.Controlleur;
import com.pack.varotrafiaraoccasion.Entity.V_detail_statistique_annonce;
import com.pack.varotrafiaraoccasion.Service.V_detail_statistique_annonceService;
import com.pack.varotrafiaraoccasion.Service.V_statistique_annonceService;

import java.text.SimpleDateFormat;
import com.pack.varotrafiaraoccasion.Work.Returntype;

import lombok.RequiredArgsConstructor;

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
@RequiredArgsConstructor
public class V_detail_statistique_annonceController {

    private final V_detail_statistique_annonceService v_detail_statistique_annonceService;
    private final V_statistique_annonceService v_statistique_annonceService;
   
    @GetMapping("/varotrafiaraback/getstatic")
    public Returntype getstatic(){
        Returntype returntype = new Returntype();
        try {
            java.util.HashMap<String,Object> hashMap = new java.util.HashMap<String,Object>();
            hashMap.put("total", v_statistique_annonceService.findAll());
            hashMap.put("detaille", v_detail_statistique_annonceService.findAll());
            returntype = new Returntype(null,hashMap);
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @GetMapping("/varotrafiaraback/v_detail_statistique_annonces")
    public Returntype findAll(){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,v_detail_statistique_annonceService.findAll());
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @GetMapping("/varotrafiaraback/v_detail_statistique_annonce")
    public Returntype findOne( @RequestParam("id") Long idV_detail_statistique_annonce ){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,v_detail_statistique_annonceService.findOne(idV_detail_statistique_annonce));
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @DeleteMapping("/varotrafiaraback/v_detail_statistique_annonce")
    public Returntype  delete(@RequestParam("id") Long idV_detail_statistique_annonce){
        Returntype returntype = new Returntype();
        try {
            v_detail_statistique_annonceService.delete(idV_detail_statistique_annonce);
            returntype = new Returntype(null,"delete");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PutMapping("/varotrafiaraback/v_detail_statistique_annonce")
    public Returntype  update(@RequestBody V_detail_statistique_annonce table){
        Returntype returntype = new Returntype();
        try {
            v_detail_statistique_annonceService.update(table);
            returntype = new Returntype(null,"update");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PostMapping("/varotrafiaraback/v_detail_statistique_annonce")
    public Returntype  insert(@RequestBody V_detail_statistique_annonce table){
        Returntype returntype = new Returntype();
        try {
            v_detail_statistique_annonceService.update(table);
            returntype = new Returntype(null,"insert");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

}
