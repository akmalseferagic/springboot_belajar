/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sttnf.ais.dao.impl;

import com.sttnf.ais.dao.KhsDao;
import com.sttnf.ais.dao.repository.KhsRepository;
import com.sttnf.ais.model.Khs;
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
public class KhsDaoImpl extends BaseImpl implements KhsDao {

    @Autowired
	private KhsRepository repository;
    
    
   @Override
    public Khs getById(int id) throws Exception {
        return repository.findOne(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Khs save(Khs khs) throws Exception {
        return repository.save(khs);
    }

    @Override
    public void delete(Khs khs) throws Exception {
       	repository.delete(khs); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public List findKhs(String nim_mhs) throws Exception {
        repository.findKhs(nim_mhs);
        return repository.findKhs(nim_mhs);
    }

    @Override
    public List<Khs> getList() throws Exception {
     CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Khs> query = critB.createQuery(Khs.class);
		Root<Khs> root = query.from(Khs.class);
		
		TypedQuery<Khs> q = em.createQuery(query);
		return q.getResultList();
	}

    @Override
    public Integer getSks(String kode_mk) throws Exception {
        repository.getSks(kode_mk);
        return repository.getSks(kode_mk);
    }
}
