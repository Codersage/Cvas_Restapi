/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvas.CVAS_RestApi.Models;

import javax.persistence.*;
/**
 *
 * @author User
 */
@Entity
@Table (name="Vaccine_brands")
public class VaccineBrands {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    
    @Column(name = "name")
    String Name;
    @Column(name = "Doses")
    int Doses;
    @Column(name = "Available")
    boolean Available;
    @Column(name = "Vaccine_type")
    String type;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDoses(int Doses) {
        this.Doses = Doses;
    }

    public void setAvailable(boolean Available) {
        this.Available = Available;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getDoses() {
        return Doses;
    }

    public boolean isAvailable() {
        return Available;
    }

    public String getType() {
        return type;
    }
    
    
    
    
}
