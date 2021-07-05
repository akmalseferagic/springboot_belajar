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
public class Mahasiswa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq_gen")
    @SequenceGenerator(name = "users_seq_gen", sequenceName = "mahasiswa_id_mhs_seq")
    
    private int id_mhs;
    
        @Column
	private int nim_mhs;
	@Column
	private String nama_mhs;
        @Column
        private String prosudi_mhs;
        @Column
        private String angkatan_mhs;
        
        public Mahasiswa() {	} //constructor 

        public Mahasiswa(int nim_mhs, String nama_mhs, String prosudi_mhs, String angkata_mhs) {
		this.nim_mhs = nim_mhs;
                this.nama_mhs = nama_mhs;
		this.prosudi_mhs = prosudi_mhs;
	}

    public int getId_mhs() {
        return id_mhs;
    }

    public void setId_mhs(int id_mhs) {
        this.id_mhs = id_mhs;
    }

    public int getNim_mhs() {
        return nim_mhs;
    }

    public void setNim_mhs(int nim_mhs) {
        this.nim_mhs = nim_mhs;
    }

    public String getNama_mhs() {
        return nama_mhs;
    }

    public void setNama_mhs(String nama_mhs) {
        this.nama_mhs = nama_mhs;
    }

    public String getProsudi_mhs() {
        return prosudi_mhs;
    }

    public void setProsudi_mhs(String prosudi_mhs) {
        this.prosudi_mhs = prosudi_mhs;
    }

    public String getAngkatan_mhs() {
        return angkatan_mhs;
    }

    public void setAngkatan_mhs(String angkatan_mhs) {
        this.angkatan_mhs = angkatan_mhs;
    }
        
        
    
}
