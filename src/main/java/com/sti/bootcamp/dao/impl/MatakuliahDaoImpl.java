/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao.impl;

import com.sti.bootcamp.dao.MatakuliahDao;
import com.sti.bootcamp.dao.repository.MatakuliahRepository;
import com.sti.bootcamp.model.Matakuliah;
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
public class MatakuliahDaoImpl extends BaseImpl implements MatakuliahDao {
    
    @Autowired
	private MatakuliahRepository repository; //yang punya hubungan ke database

    @Override
    public Matakuliah getById(int id) throws Exception {
        return repository.findOne(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Matakuliah save(Matakuliah matakuliah) throws Exception {
        return repository.save(matakuliah);
    }

    @Override
    public void delete(Matakuliah matakuliah) throws Exception {
        repository.delete(matakuliah); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Matakuliah> getList() throws Exception {
     CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Matakuliah> query = critB.createQuery(Matakuliah.class);
		Root<Matakuliah> root = query.from(Matakuliah.class);
		
		TypedQuery<Matakuliah> q = em.createQuery(query);
		return q.getResultList();
	}
    
}
