/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvas.CVAS_RestApi.Controllers;

import com.cvas.CVAS_RestApi.Models.Logs;
import com.cvas.CVAS_RestApi.Models.Logs;

import com.cvas.CVAS_RestApi.Repo.LogsRepo;

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
public class LogsController {
    
    @Autowired
    public LogsRepo logsrep;
   
  
    
    
    
    /**
     *
     * @return
     */
    
    
    @GetMapping(value="/logs")
    public List<Logs> getlogs(){
        return logsrep.findAll();
    }
    
    
    @PostMapping(value="/createlogs")
    public boolean createlogs( @RequestBody Logs logs){
        
    
            logsrep.save(logs);
        return true;
    }
    
//    @PutMapping(value="updatelogs/{id}")
//    public boolean updatelogs(@PathVariable int id, @RequestBody Logs logs){
//        Logs updatedlogs ;
//        
//          updatedlogs=logsrep.findById(id).get();
//         
//          logsrep.save(updatedlogs);
//     
//        return true;
//    }
    
    
//      @DeleteMapping(value="deletelogs/{id}")
//       public boolean deletelogs(@PathVariable int id){
//        Logs deletedlogs ;
//     
//          deletedlogs=logsrep.findById(id).get();
//          
//          logsrep.delete(deletedlogs);
//       
//        return true;
//    }
//    
}
