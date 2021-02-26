/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sttnf.ais.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author techinasia888
 */
public class Matakuliah{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private int id_matkul;
    
    @Column
    private String nama_matkul;
    @Column
    private String kode_matkul;

    public Matakuliah(String nama_matkul, String kode_matkul) {
	this.nama_matkul = nama_matkul;
	this.kode_matkul = kode_matkul;   
        
    }
    
    public int getId_matkul() {
        return id_matkul;
    }

    public void setId_matkul(int id_matkul) {
        this.id_matkul = id_matkul;
    }

    public String getNama_matkul() {
        return nama_matkul;
    }

    public void setNama_matkul(String nama_matkul) {
        this.nama_matkul = nama_matkul;
    }

    public String getKode_matkul() {
        return kode_matkul;
    }

    public void setKode_matkul(String kode_matkul) {
        this.kode_matkul = kode_matkul;
    }

    public String getFirtsname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

