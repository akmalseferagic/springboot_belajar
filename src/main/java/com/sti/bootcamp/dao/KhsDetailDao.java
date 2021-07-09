/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao;

import com.sti.bootcamp.model.KhsDetail;
import java.util.List;

/**
 *
 * @author techinasia888
 */
public interface KhsDetailDao {
    
        KhsDetail getById (int id) throws Exception;
	KhsDetail save (KhsDetail khsdetail) throws Exception;
	void delete (KhsDetail khsdetail) throws Exception;
	
	List<KhsDetail> getList() throws Exception;
    
}
