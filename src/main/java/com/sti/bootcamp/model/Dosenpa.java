/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author techinasia888
 */
@Entity
public class Dosenpa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq_gen")
    @SequenceGenerator(name = "users_seq_gen", sequenceName = "dosen_pa_id_dosenpa_seq")
    
    private int id_dosenpa;
    
    @Column
    private String nama_dosenpa;
    
    public Dosenpa( ){ }

    public Dosenpa(String nama_dosenpa){
        this.nama_dosenpa = nama_dosenpa;
    }

    public int getId_dosenpa() {
        return id_dosenpa;
    }

    public void setId_dosenpa(int id_dosenpa) {
        this.id_dosenpa = id_dosenpa;
    }

    public String getNama_dosenpa() {
        return nama_dosenpa;
    }

    public void setNama_dosenpa(String nama_dosenpa) {
        this.nama_dosenpa = nama_dosenpa;
    }
    
    
    
}
