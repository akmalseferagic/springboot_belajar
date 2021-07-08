/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao.impl;

import com.sti.bootcamp.dao.SemesterDao;
import com.sti.bootcamp.dao.repository.SemesterRepository;
import com.sti.bootcamp.model.Semester;
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
public class SemesterDaoImpl extends BaseImpl implements SemesterDao{
    
           @Autowired
	private SemesterRepository repository; //yang punya hubungan ke database

    @Override
    public Semester getById(int id) throws Exception {
        return repository.findOne(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Semester save(Semester semester) throws Exception {
        return repository.save(semester);
    }

    @Override
    public void delete(Semester semester) throws Exception {
        repository.delete(semester); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Semester> getList() throws Exception {
     CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Semester> query = critB.createQuery(Semester.class);
		Root<Semester> root = query.from(Semester.class);
		
		TypedQuery<Semester> q = em.createQuery(query);
		return q.getResultList();
	}
    
    
    
}
