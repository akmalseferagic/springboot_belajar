/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author techinasia888
 */
public class Khs {
    
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq_gen")
        @SequenceGenerator(name = "users_seq_gen", sequenceName = " khs_id_khs_seq ")
        
	private int id_khs;
    
        @Column
	private String nama_khs;
	@Column
	private String kode_khs;
        @Column
	private int sks_khs;
        
        
        public Khs() {	}

        public Khs(String nama_khs, String kode_khs, int sks_khs) {
		this.nama_khs = nama_khs;
		this.kode_khs = kode_khs;
                this.sks_khs = sks_khs;
	}
    
}
