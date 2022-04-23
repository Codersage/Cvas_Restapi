/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cvas.CVAS_RestApi.Repo;



import com.cvas.CVAS_RestApi.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author User
 */
public interface Userrepo extends JpaRepository<Users,Integer>{
    
    @Query(value="SELECT * FROM user  WHERE Username = :username and password =:password ",nativeQuery=true)
    public Users findByEmail(@Param("username")String email,@Param("password")String password);
}
