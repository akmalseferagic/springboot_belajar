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
public class Khs {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq_gen")
    @SequenceGenerator(name = "users_seq_gen", sequenceName = "khs_id_khs_seq")
    
    private int id_khs;
    
    @Column
    private int nim_mahasiswa;
    
    @Column
    private String nilai_khs;
    
    @Column
    private Float bobot_nilai;
    
    @Column
    private Float jumlah_nilai;
    
    public Khs ( ){ }
    
    public Khs (int nim_mahasiswa, String nilai_khs, Float bobot_nilai, Float jumlah_nilai){
        this.nim_mahasiswa = nim_mahasiswa;
        this.nilai_khs = nilai_khs;
        this.bobot_nilai = bobot_nilai;
        this.jumlah_nilai = jumlah_nilai;
        
    }

    public int getId_khs() {
        return id_khs;
    }

    public void setId_khs(int id_khs) {
        this.id_khs = id_khs;
    }

    public int getNim_mahasiswa() {
        return nim_mahasiswa;
    }

    public void setNim_mahasiswa(int nim_mahasiswa) {
        this.nim_mahasiswa = nim_mahasiswa;
    }

    public String getNilai_khs() {
        return nilai_khs;
    }

    public void setNilai_khs(String nilai_khs) {
        this.nilai_khs = nilai_khs;
    }

    public Float getBobot_nilai() {
        return bobot_nilai;
    }

    public void setBobot_nilai(Float bobot_nilai) {
        this.bobot_nilai = bobot_nilai;
    }

    public Float getJumlah_nilai() {
        return jumlah_nilai;
    }

    public void setJumlah_nilai(Float jumlah_nilai) {
        this.jumlah_nilai = jumlah_nilai;
    }
    
    
    
    
}
