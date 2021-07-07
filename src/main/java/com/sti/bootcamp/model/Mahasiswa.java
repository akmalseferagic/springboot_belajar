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
    
    private int id_mahasiswa;
    
        @Column
	private int nim_mahasiswa;
	@Column
	private String nama_mahasiswa;
        @Column
        private int id_prodi;
        @Column
        private int id_matkul;
        @Column
        private int id_semester;
        @Column
        private int id_dosenpa;
        
        public Mahasiswa() {	} //constructor 

        public Mahasiswa(int nim_mahasiswa, String nama_mahasiswa, int id_prodi, int id_matkul, int id_semester, int id_dosenpa) {
		this.nim_mahasiswa = nim_mahasiswa;
                this.nama_mahasiswa = nama_mahasiswa;
		this.id_prodi = id_prodi;
                this.id_matkul = id_matkul;
                this.id_semester = id_semester;
                this.id_dosenpa = id_dosenpa;
	}

    public int getId_mahasiswa() {
        return id_mahasiswa;
    }

    public void setId_mahasiswa(int id_mahasiswa) {
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

    public int getId_matkul() {
        return id_matkul;
    }

    public void setId_matkul(int id_matkul) {
        this.id_matkul = id_matkul;
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

}
