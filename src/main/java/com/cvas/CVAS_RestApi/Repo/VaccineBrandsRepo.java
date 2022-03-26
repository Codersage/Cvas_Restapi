/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cvas.CVAS_RestApi.Repo;


import com.cvas.CVAS_RestApi.Models.VaccineBrands;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface VaccineBrandsRepo extends JpaRepository<VaccineBrands,Integer>{
    
}
