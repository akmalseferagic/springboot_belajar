/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao;

import com.sti.bootcamp.model.Matakuliah;
import java.util.List;

/**
 *
 * @author techinasia888
 */
public interface MatakuliahDao {
    
    Matakuliah getById(int id) throws Exception;
	Matakuliah save(Matakuliah matakuliah) throws Exception;
	void delete(Matakuliah matakuliah) throws Exception;
	
	List<Matakuliah> getList() throws Exception;
    
}
