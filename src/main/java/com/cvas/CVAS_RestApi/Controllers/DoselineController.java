/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvas.CVAS_RestApi.Controllers;





import com.cvas.CVAS_RestApi.Models.DoseLine;
import com.cvas.CVAS_RestApi.Repo.DoselineRepo;
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
public class DoselineController {
    
    @Autowired
    public DoselineRepo doselinerepo;
   
  
    
    
    
    /**
     *
     * @return
     */
    
    
    @GetMapping(value="/doseline")
    public List<DoseLine> getdoseline(){
        return doselinerepo.findAll();
    }
    
    
    @PostMapping(value="/createdoseline")
    public boolean createdoseline( @RequestBody DoseLine doseline){
        
    
            doselinerepo.save(doseline);
        return true;
    }
    
//    @PutMapping(value="updatedoseline/{id}")
//    public boolean updatedoseline(@PathVariable int id, @RequestBody DoseLine doseline){
//        DoseLine updateddoseline ;
//        
//          updateddoseline=doselinerepo.findById(id).get();
//         
//          doselinerepo.save(updateddoseline);
//     
//        return true;
//    }
    
    
//      @DeleteMapping(value="deletedoseline/{id}")
//       public boolean deletedoseline(@PathVariable int id){
//        DoseLine deleteddoseline ;
//     
//          deleteddoseline=doselinerepo.findById(id).get();
//          
//          doselinerepo.delete(deleteddoseline);
//       
//        return true;
//    }
//    
}
