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
    
}
