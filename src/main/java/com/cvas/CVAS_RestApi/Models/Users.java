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
@Table (name="user")
public class Users {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    
    @Column(name = "Regionid")
    int Regionid;
    
    @Column(name = "Username")
    String Username;
    
    @Column(name = "password")
    String Password;
    
    @Column(name = "Accesslevel")
    int  Accesslevel;

    public void setId(int id) {
        this.id = id;
    }

    public void setRegionid(int Regionid) {
        this.Regionid = Regionid;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setAccesslevel(int Accesslevel) {
        this.Accesslevel = Accesslevel;
    }

    
    
    
    
    
    public int getId() {
        return id;
    }

    public int getRegionid() {
        return Regionid;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public int getAccesslevel() {
        return Accesslevel;
    }
    
    
    
}
