/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvas.CVAS_RestApi.Controllers;

import com.cvas.CVAS_RestApi.Models.Citizens;
import com.cvas.CVAS_RestApi.Models.Citizens;
import com.cvas.CVAS_RestApi.Repo.CitizenRepo;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class CitizenController {
    
    @Autowired
    public CitizenRepo Citizenrep;
   
  
    
    
    
    /**
     *
     * @return
     */
    
    
    @GetMapping(value="/Citizen")
    public List<Citizens> getCitizen(){
        return Citizenrep.findAll();
    }
    
    
    @PostMapping(value="/createCitizen")
    public boolean createCitizen( @RequestBody Citizens Citizen){
        
    
            Citizenrep.save(Citizen);
        return true;
    }
    
    @PutMapping(value="updateCitizen/{id}")
    public boolean updateCitizen(@PathVariable int id, @RequestBody Citizens Citizen){
        Citizens updatedCitizen ;
        
          updatedCitizen=Citizenrep.findById(id).get();
         updatedCitizen.setFirstname(Citizen.getFirstname());
         updatedCitizen.setLastName(Citizen.getLastName());
         updatedCitizen.setTRN(Citizen.getTRN());
         updatedCitizen.setMiddleinitial(Citizen.getMiddleinitial());
         //updatedCitizen.se(Citizen.getTRN());
          
          Citizenrep.save(updatedCitizen);
     
        return true;
    }
    
    
      @DeleteMapping(value="deleteCitizen/{id}")
       public boolean deleteCitizen(@PathVariable int id){
        Citizens deletedCitizen ;
     
          deletedCitizen=Citizenrep.findById(id).get();
          
          Citizenrep.delete(deletedCitizen);
       
        return true;
    }
    
}
