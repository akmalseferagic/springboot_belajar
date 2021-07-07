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
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq_gen")
        @SequenceGenerator(name = "users_seq_gen", sequenceName = "matakuliah_id_matkul_seq")
        
	private int id_matkul;
    
        @Column
	private String nama_matkul;
	@Column
	private String kode_matkul;
        @Column
	private int sks_matkul;
        
        
        public Matakuliah() {	}

        public Matakuliah(String nama_matkul, String kode_matkul, int sks_matkul) {
		this.nama_matkul = nama_matkul;
		this.kode_matkul = kode_matkul;
                this.sks_matkul = sks_matkul;
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

    public int getSks_matkul() {
        return sks_matkul;
    }

    public void setSks_matkul(int sks_matkul) {
        this.sks_matkul = sks_matkul;
    }


    
}
