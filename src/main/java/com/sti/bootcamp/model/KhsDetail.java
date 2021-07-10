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
public class KhsDetail {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq_gen")
    @SequenceGenerator(name = "users_seq_gen", sequenceName = "khs_detail_id_khs_seq")
    
    private int id_khsdetail;
    
    @Column
    private int id_khs;
    
    @Column
    private int ips_khs;
    
    @Column
    private int ipk_khs;
    
    @Column
    private int total_khs;
    
    @Column
    private int jumlah_sks;

    public int getId_khsdetail() {
        return id_khsdetail;
    }

    public void setId_khsdetail(int id_khsdetail) {
        this.id_khsdetail = id_khsdetail;
    }

    public int getId_khs() {
        return id_khs;
    }

    public void setId_khs(int id_khs) {
        this.id_khs = id_khs;
    }

    public int getIps_khs() {
        return ips_khs;
    }

    public void setIps_khs(int ips_khs) {
        this.ips_khs = ips_khs;
    }

    public int getIpk_khs() {
        return ipk_khs;
    }

    public void setIpk_khs(int ipk_khs) {
        this.ipk_khs = ipk_khs;
    }

    public int getTotal_khs() {
        return total_khs;
    }

    public void setTotal_khs(int total_khs) {
        this.total_khs = total_khs;
    }

    public int getJumlah_sks() {
        return jumlah_sks;
    }

    public void setJumlah_sks(int jumlah_sks) {
        this.jumlah_sks = jumlah_sks;
    }
    
    
    
}
