/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao.impl;

import com.sti.bootcamp.dao.KelasDao;
import com.sti.bootcamp.dao.repository.KelasRepository;
import com.sti.bootcamp.model.Kelas;
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
public class KelasDaoImpl extends BaseImpl implements KelasDao {
    
    @Autowired
    private KelasRepository repository;

    @Override
    public Kelas getById(int id) throws Exception {
        return repository.findOne(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Kelas save(Kelas kelas) throws Exception {
         //To change body of generated methods, choose Tools | Templates.
        return repository.save(kelas);
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Kelas kelas) throws Exception {
        repository.delete(kelas); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Kelas> getList() throws Exception {
     CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Kelas> query = critB.createQuery(Kelas.class);
		Root<Kelas> root = query.from(Kelas.class);
		
		TypedQuery<Kelas> q = em.createQuery(query);
		return q.getResultList();
	}
    
    
    
}
