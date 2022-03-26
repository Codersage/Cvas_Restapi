/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvas.CVAS_RestApi.Models;
 
import java.io.Serializable;
import javax.annotation.*;
import javax.persistence.*;


/**
 *
 * @author User
 */
@Entity
@Table (name="doses_received")
public class DoseReceived implements Serializable {
    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    
    @Column(name = "receivedby")
    int Receivedby;
    
    @Column(name = "createdby")
    int Createdby;
    
    @Column(name = "total")
    int total;

    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setReceivedby(int Receivedby) {
        this.Receivedby = Receivedby;
    }

    public void setCreatedby(int Createdby) {
        this.Createdby = Createdby;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
    
    
    public int getId() {
        return id;
    }

    public int getReceivedby() {
        return Receivedby;
    }

    public int getCreatedby() {
        return Createdby;
    }

    public int getTotal() {
        return total;
    }
    
    
    
    
}
