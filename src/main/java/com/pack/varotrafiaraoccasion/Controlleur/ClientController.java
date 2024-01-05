package com.pack.varotrafiaraoccasion.Controlleur;
import com.pack.varotrafiaraoccasion.Entity.Client;
import com.pack.varotrafiaraoccasion.Service.ClientService;
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
public class ClientController {

 private final ClientService clientService;
    
    @Autowired
    public ClientController(ClientService clientService){
        this.clientService= clientService;
    }

    @GetMapping("/varotrafiaraback/clients")
    public Returntype findAll(){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,clientService.findAll());
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @GetMapping("/varotrafiaraback/client")
    public Returntype findOne( @RequestParam("id") Long idClient ){
        Returntype returntype = new Returntype();
        try {
            returntype = new Returntype(null,clientService.findOne(idClient));
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @DeleteMapping("/varotrafiaraback/client")
    public Returntype  delete(@RequestParam("id") Long idClient){
        Returntype returntype = new Returntype();
        try {
            clientService.delete(idClient);
            returntype = new Returntype(null,"delete");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PutMapping("/varotrafiaraback/client")
    public Returntype  update(@RequestBody Client table){
        Returntype returntype = new Returntype();
        try {
            clientService.update(table);
            returntype = new Returntype(null,"update");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

    @PostMapping("/varotrafiaraback/client")
    public Returntype  insert(@RequestBody Client table){
        Returntype returntype = new Returntype();
        try {
            clientService.update(table);
            returntype = new Returntype(null,"insert");
        } catch (Exception e) {
            returntype = new Returntype(e.getMessage(),null);
            return returntype;
        }
        return returntype;
    }

}
