/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao.impl;

import com.sti.bootcamp.dao.KhsDao;
import com.sti.bootcamp.dao.repository.KhsRepository;
import com.sti.bootcamp.model.Khs;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author techinasia888
 */
public class KhsDaoImpl extends BaseImpl implements KhsDao {
    
    @Autowired
    private KhsRepository repository;

    @Override
    public Khs getById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Khs save(Khs khs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Khs khs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Khs> getList() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
