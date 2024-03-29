package com.pack.varotrafiaraoccasion.Controlleur;
import com.pack.varotrafiaraoccasion.Entity.Boitdevitesse;
import com.pack.varotrafiaraoccasion.Service.BoitdevitesseService;
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
public class BoitdevitesseController {

 private final BoitdevitesseService boitdevitesseService;
    
    @Autowired
    public BoitdevitesseController(BoitdevitesseService boitdevitesseService){
        this.boitdevitesseService= boitdevitesseService;
    }

    @GetMapping("/varotrafiaraback/boitdevitesses")
    public Returntype findAll(){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,boitdevitesseService.findAll());
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @GetMapping("/varotrafiaraback/boitdevitesse")
    public Returntype findOne( @RequestParam("id") Long idBoitdevitesse ){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,boitdevitesseService.findOne(idBoitdevitesse));
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @DeleteMapping("/varotrafiaraback/boitdevitesse")
    public Returntype  delete(@RequestParam("id") Long idBoitdevitesse){
        Returntype returntype = new Returntype();
        try {
            boitdevitesseService.delete(idBoitdevitesse);
            returntype = new Returntype(null,"delete");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PutMapping("/varotrafiaraback/boitdevitesse")
    public Returntype  update(@RequestBody Boitdevitesse table){
        Returntype returntype = new Returntype();
        try {
            boitdevitesseService.update(table);
            returntype = new Returntype(null,"update");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PostMapping("/varotrafiaraback/boitdevitesse")
    public Returntype  insert(@RequestBody Boitdevitesse table){
        Returntype returntype = new Returntype();
        try {
            boitdevitesseService.update(table);
            returntype = new Returntype(null,"insert");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

}
