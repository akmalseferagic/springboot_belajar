/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao;

import com.sti.bootcamp.model.Dosenpa;
import java.util.List;

/**
 *
 * @author techinasia888
 */
public interface DosenpaDao {
    
    Dosenpa getById (int id) throws Exception;
	Dosenpa save (Dosenpa dosenpa) throws Exception;
	void delete (Dosenpa dosenpa) throws Exception;
	
	List<Dosenpa> getList() throws Exception;
    
}
