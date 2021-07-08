/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao.impl;
import com.sti.bootcamp.dao.ProdiDao;
import com.sti.bootcamp.dao.repository.ProdiRepository;
import com.sti.bootcamp.model.Prodi;
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
public class ProdiDaoImpl extends BaseImpl implements ProdiDao {
    
        @Autowired
	private ProdiRepository repository; //yang punya hubungan ke database

    @Override
    public Prodi getById(int id) throws Exception {
        return repository.findOne(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Prodi save(Prodi prodi) throws Exception {
        return repository.save(prodi);
    }

    @Override
    public void delete(Prodi prodi) throws Exception {
        repository.delete(prodi); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Prodi> getList() throws Exception {
     CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Prodi> query = critB.createQuery(Prodi.class);
		Root<Prodi> root = query.from(Prodi.class);
		
		TypedQuery<Prodi> q = em.createQuery(query);
		return q.getResultList();
	}
    
    
}
