/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvas.CVAS_RestApi.Models;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author User
 *//**
 *
 * @author User
 */
@Entity
@Table (name="region")
public class Region implements Serializable {
   
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    
    @Column(name = "region_name")
    String RegionName;

    public int getId() {
        return id;
    }

    public String getRegionName() {
        return RegionName;
    }

    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }
    
    
    
}
