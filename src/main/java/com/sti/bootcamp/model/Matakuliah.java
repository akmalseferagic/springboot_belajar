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
public class Matakuliah {
    
        @Id
        
	private String kode_matkul;
    
        @Column
	private String nama_matkul;
        @Column
	private int sks_matkul;
        
        
        public Matakuliah() {	}

        public Matakuliah(String nama_matkul, String kode_matkul, int sks_matkul) {
		this.nama_matkul = nama_matkul;
		this.kode_matkul = kode_matkul;
                this.sks_matkul = sks_matkul;
	}        

    public String getKode_matkul() {
        return kode_matkul;
    }

    public void setKode_matkul(String kode_matkul) {
        this.kode_matkul = kode_matkul;
    }

    public String getNama_matkul() {
        return nama_matkul;
    }

    public void setNama_matkul(String nama_matkul) {
        this.nama_matkul = nama_matkul;
    }

    public int getSks_matkul() {
        return sks_matkul;
    }

    public void setSks_matkul(int sks_matkul) {
        this.sks_matkul = sks_matkul;
    }

  
}
