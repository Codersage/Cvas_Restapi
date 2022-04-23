/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvas.CVAS_RestApi.Models;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

/**
 *
 * @author User
 */
@Entity
public class DoseLine implements Serializable {
    @Column(name="doseid")
    @Id
    private int doseid;
    
    @Column(name="brand")
    private int brand;
    
    
    @Column (name="Date")
    private Date date; 

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getBrand() {
        return brand;
    }

    public Date getDate() {
        return date;
    }

    public int getDoseid() {
        return doseid;
    }

    public void setDoseid(int doseid) {
        this.doseid = doseid;
    }
    
    
}
