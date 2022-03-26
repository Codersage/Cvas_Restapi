/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvas.CVAS_RestApi.Controllers;

import com.cvas.CVAS_RestApi.Models.Region;
import com.cvas.CVAS_RestApi.Repo.RegionRepo;
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
public class ApiController {
    
    @Autowired
    public RegionRepo regionrep;
    
    @GetMapping(value="/")
    public String GetRegion(){
        return "welcome";
    }
    
    /**
     *
     * @return
     */
    @GetMapping(value="/region")
    public List<Region> getregion(){
        return regionrep.findAll();
    }
    
    
    @PostMapping(value="/createregion")
    public boolean createregion(Region region){
        
        try{
            regionrep.save(region);
        }catch(Exception e){
            return false;
        }
        
        return true;
    }
    
    @PutMapping(value="/updateregion{id}")
    public boolean updateregion(@PathVariable int id, @RequestBody Region region){
        Region updatedregion ;
        try{
          updatedregion=   regionrep.findById(id).get();
          updatedregion.setRegionName(region.getRegionName());
          regionrep.save(updatedregion);
        }catch(Exception e){
            return false;
        }
        
        return true;
    }
    
    
      @DeleteMapping(value="/deleteregion{id}")
       public boolean deleteregion(@PathVariable int id){
        Region deletedregion ;
        try{
          deletedregion=   regionrep.findById(id).get();
          
          regionrep.delete(deletedregion);
        }catch(Exception e){
            return false;
        }
        
        return true;
    }
    
}
