/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao.impl;

import com.sti.bootcamp.dao.DosenpaDao;
import com.sti.bootcamp.dao.repository.DosenpaRepository;
import com.sti.bootcamp.model.Dosenpa;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author techinasia888
 */
public class DosenpaDaoImpl extends BaseImpl implements DosenpaDao {

     @Autowired
    private DosenpaRepository repository; //yang punya hubungan ke database
    
    @Override
    public Dosenpa getById(int id) throws Exception {
        return repository.findOne(id);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dosenpa save(Dosenpa dosenpa) throws Exception {
        return repository.save(dosenpa); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Dosenpa dosenpa) throws Exception {
        repository.delete(dosenpa); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Dosenpa> getList() throws Exception {
 CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Dosenpa> query = critB.createQuery(Dosenpa.class);
		Root<Dosenpa> root = query.from(Dosenpa.class);
		
		TypedQuery<Dosenpa> q = em.createQuery(query);
		return q.getResultList();
	}
    
}
