/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cvas.CVAS_RestApi.Repo;



import com.cvas.CVAS_RestApi.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface Userrepo extends JpaRepository<Users,Integer>{
    
}
