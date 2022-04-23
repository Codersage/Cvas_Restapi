/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvas.CVAS_RestApi.Models;

import java.sql.Date;
import javax.persistence.*;

/**
 *
 * @author User
 */
@Entity
@Table(name="citizen")
public class Citizens {

    @Id
    @Column(name = "")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    
    @Column(name="addedby")
    private  int addedby;
    
    @Column(name="Region")
    private int Region;
    
    @Column(name="FirstName")
    private String  Firstname;
    
    @Column(name="LastName")
    private String  LastName;
    
    @Column(name="MiddleInitial")
    private char Middleinitial;
    
    @Column(name="TRN")
    private int TRN;
    
    @Column(name="Date")
    private Date _date;
    
    @Column(name="dosesreceived")
    private int DosesReceived;

    @Column(name="Gender")
    private String Gender;
    public void setAddedby(int addedby) {
        this.addedby = addedby;
    }

    public void setRegion(int Region) {
        this.Region = Region;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setMiddleinitial(char Middleinitial) {
        this.Middleinitial = Middleinitial;
    }

    public void setTRN(int TRN) {
        this.TRN = TRN;
    }

    public void setDate(Date date) {
        this._date = date;
    }

    public void setDosesReceived(int DosesReceived) {
        this.DosesReceived = DosesReceived;
    }

    public int getAddedby() {
        return addedby;
    }

    public int getRegion() {
        return Region;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public char getMiddleinitial() {
        return Middleinitial;
    }

    public int getTRN() {
        return TRN;
    }

    public Date getDate() {
        return _date;
    }

    public int getDosesReceived() {
        return DosesReceived;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
