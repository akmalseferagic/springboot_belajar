/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao;

import com.sti.bootcamp.model.Kelas;
import java.util.List;

/**
 *
 * @author techinasia888
 */
public interface KelasDao {
        
        Kelas getById (int id) throws Exception;
	Kelas save (Kelas kelas) throws Exception;
	void delete (Kelas kelas) throws Exception;
	
	List<Kelas> getList() throws Exception;
}
