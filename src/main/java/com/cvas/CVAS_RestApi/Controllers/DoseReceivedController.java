/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvas.CVAS_RestApi.Controllers;



import com.cvas.CVAS_RestApi.Models.DoseReceived;
import com.cvas.CVAS_RestApi.Repo.DoseReceivedRepo;
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
public class DoseReceivedController {
    
    @Autowired
    public DoseReceivedRepo dosereceivedrep;
   
  
    
    
    
    /**
     *
     * @return
     */
    
    
    @GetMapping(value="/dosereceived")
    public List<DoseReceived> getdosereceived(){
        return dosereceivedrep.findAll();
    }
    
    
    @PostMapping(value="/createdosereceived")
    public boolean createdosereceived( @RequestBody DoseReceived dosereceived){
        
    
            dosereceivedrep.save(dosereceived);
        return true;
    }
    
//    @PutMapping(value="updatedosereceived/{id}")
//    public boolean updatedosereceived(@PathVariable int id, @RequestBody DoseReceived dosereceived){
//        DoseReceived updateddosereceived ;
//        
//          updateddosereceived=dosereceivedrep.findById(id).get();
//         
//          dosereceivedrep.save(updateddosereceived);
//     
//        return true;
//    }
    
    
//      @DeleteMapping(value="deletedosereceived/{id}")
//       public boolean deletedosereceived(@PathVariable int id){
//        DoseReceived deleteddosereceived ;
//     
//          deleteddosereceived=dosereceivedrep.findById(id).get();
//          
//          dosereceivedrep.delete(deleteddosereceived);
//       
//        return true;
//    }
//    
}
