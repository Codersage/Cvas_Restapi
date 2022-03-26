/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvas.CVAS_RestApi.Controllers;

import com.cvas.CVAS_RestApi.Models.VaccineBrands;
import com.cvas.CVAS_RestApi.Repo.VaccineBrandsRepo;
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
public class VaccineBrandsController {
    
    @Autowired
    public VaccineBrandsRepo vaccineBrandsrep;
   
  
    
  
    /**
     *
     * @return
     */
    
    
    @GetMapping(value="/vaccineBrands")
    public List<VaccineBrands> getvaccineBrands(){
        return vaccineBrandsrep.findAll();
    }
    
    
    @PostMapping(value="/createvaccineBrands")
    public boolean createvaccineBrands( @RequestBody VaccineBrands vaccineBrands){
        
    
            vaccineBrandsrep.save(vaccineBrands);
        
           
       
        
        return true;
    }
    
    @PutMapping(value="updatevaccineBrands/{id}")
    public boolean updatevaccineBrands(@PathVariable int id, @RequestBody VaccineBrands vaccineBrands){
        VaccineBrands updatedvaccineBrands ;
        
          updatedvaccineBrands=vaccineBrandsrep.findById(id).get();
          vaccineBrandsrep.save(updatedvaccineBrands);
     
        return true;
    }
    
    
      @DeleteMapping(value="deletevaccineBrands/{id}")
       public boolean deletevaccineBrands(@PathVariable int id){
        VaccineBrands deletedvaccineBrands ;
     
          deletedvaccineBrands=   vaccineBrandsrep.findById(id).get();
          
          vaccineBrandsrep.delete(deletedvaccineBrands);
       
        return true;
    }
    
}
