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
@Table (name="log")
public class Logs implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    @Column(name = "date")
    Date datedone;

    public int getId() {
        return id;
    }

    public Date getDatedone() {
        return datedone;
    }

    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setDatedone(Date datedone) {
        this.datedone = datedone;
    }
    
    
    
}
