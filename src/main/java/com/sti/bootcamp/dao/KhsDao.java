/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao;

import com.sti.bootcamp.model.Khs;
import java.util.List;

/**
 *
 * @author techinasia888
 */
public interface KhsDao {
    
        Khs getById (int id) throws Exception;
	Khs save (Khs khs) throws Exception;
	void delete (Khs khs) throws Exception;
        List<Khs> findKhs (String nim_mhs) throws Exception;
	List<Khs> getList() throws Exception;
    
}
