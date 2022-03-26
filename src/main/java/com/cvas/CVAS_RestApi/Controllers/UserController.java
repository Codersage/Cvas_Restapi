/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvas.CVAS_RestApi.Controllers;


import com.cvas.CVAS_RestApi.Models.Users;
import com.cvas.CVAS_RestApi.Repo.Userrepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
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
public class UserController {
    
   
    @Autowired
    public Userrepo userrep;
  
    /**
     *
     * @return
     */
    @GetMapping(value="/User")
    public List<Users> getuser(){
        return userrep.findAll();
    }
    
    
    @PostMapping(value="/createuser")
    public boolean createuser( @RequestBody Users user){
        
     
           userrep.save(user);
        
        
        return true;
    }
    
    @PutMapping(value="updateuser/{id}")
    public boolean updateuser(@PathVariable int id, @RequestBody Users user){
        Users updateduser ;

          updateduser=userrep.findById(id).get();
          updateduser.setUsername(user.getUsername());
          updateduser.setPassword(user.getPassword());
          updateduser.setAccesslevel(user.getAccesslevel());
          updateduser.setRegionid(user.getRegionid());
          userrep.save(updateduser);
        
        return true;
    }
    
    
      @DeleteMapping(value="deleteuser/{id}")
       public boolean deleteuser(@PathVariable int id){
        Users deleteduser ;
      
          deleteduser= userrep.findById(id).get();
          
          userrep.delete(deleteduser);
       
        
        return true;
    }
    
}
