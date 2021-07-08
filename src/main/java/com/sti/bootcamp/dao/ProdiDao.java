/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao;

import com.sti.bootcamp.model.Mahasiswa;
import com.sti.bootcamp.model.Prodi;
import java.util.List;

/**
 *
 * @author techinasia888
 */
public interface ProdiDao {
    
    Prodi getById (int id) throws Exception;
	Prodi save (Prodi prodi) throws Exception;
	void delete (Prodi prodi) throws Exception;
	
	List<Prodi> getList() throws Exception;
    
}
