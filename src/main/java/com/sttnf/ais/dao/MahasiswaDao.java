/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sttnf.ais.dao;

import com.sttnf.ais.model.Mahasiswa;
import java.util.List;

/**
 *
 * @author techinasia888
 */
public interface MahasiswaDao {
    
        Mahasiswa getById (int id) throws Exception;
	Mahasiswa save (Mahasiswa mahasiswa) throws Exception;
	void delete (Mahasiswa mahasiswa) throws Exception;
	
	List<Mahasiswa> getList() throws Exception;
    
}
