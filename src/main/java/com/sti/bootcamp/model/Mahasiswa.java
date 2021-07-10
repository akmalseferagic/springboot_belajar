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
    @SequenceGenerator(name = "users_seq_gen", sequenceName = "mahasiswa_id_mahasiswa_seq")
    
    private int nim_mahasiswa;
    
	@Column
	private String nama_mahasiswa;
        @Column
        private int id_prodi;
        @Column
        private String kode_matkul;
        @Column
        private int id_semester;
        @Column
        private int id_dosenpa;
        @Column
        private int id_mahasiswa;
        
        public Mahasiswa() {	} //constructor 

        public Mahasiswa(int nim_mahasiswa, String nama_mahasiswa, int id_prodi, String kode_matkul, int id_semester, int id_dosenpa, int id_mahasiswa) {
		this.nim_mahasiswa = nim_mahasiswa;
                this.nama_mahasiswa = nama_mahasiswa;
		this.id_prodi = id_prodi;
                this.kode_matkul = kode_matkul;
                this.id_semester = id_semester;
                this.id_dosenpa = id_dosenpa;
                this.id_mahasiswa = id_mahasiswa;
	}

    public int getNim_mahasiswa() {
        return nim_mahasiswa;
    }

    public void setNim_mahasiswa(int nim_mahasiswa) {
        this.nim_mahasiswa = nim_mahasiswa;
    }

    public String getNama_mahasiswa() {
        return nama_mahasiswa;
    }

    public void setNama_mahasiswa(String nama_mahasiswa) {
        this.nama_mahasiswa = nama_mahasiswa;
    }

    public int getId_prodi() {
        return id_prodi;
    }

    public void setId_prodi(int id_prodi) {
        this.id_prodi = id_prodi;
    }

    public String getKode_matkul() {
        return kode_matkul;
    }

    public void setKode_matkul(String kode_matkul) {
        this.kode_matkul = kode_matkul;
    }

    public int getId_semester() {
        return id_semester;
    }

    public void setId_semester(int id_semester) {
        this.id_semester = id_semester;
    }

    public int getId_dosenpa() {
        return id_dosenpa;
    }

    public void setId_dosenpa(int id_dosenpa) {
        this.id_dosenpa = id_dosenpa;
    }

    public int getId_mahasiswa() {
        return id_mahasiswa;
    }

    public void setId_mahasiswa(int id_mahasiswa) {
        this.id_mahasiswa = id_mahasiswa;
    }

   
}
