/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao.impl;

import com.sti.bootcamp.dao.KhsDetailDao;
import com.sti.bootcamp.dao.repository.KhsDetailRepository;
import com.sti.bootcamp.model.KhsDetail;
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
public class KhsDetailDaoImpl extends BaseImpl implements KhsDetailDao{
    
    @Autowired
    private KhsDetailRepository repository;

   @Override
    public KhsDetail getById(int id) throws Exception {
        return repository.findOne(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public KhsDetail save(KhsDetail khsdetail) throws Exception {
        return repository.save(khsdetail);
    }

    @Override
    public void delete(KhsDetail khsdetail) throws Exception {
       	repository.delete(khsdetail); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KhsDetail> getList() throws Exception {
     CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<KhsDetail> query = critB.createQuery(KhsDetail.class);
		Root<KhsDetail> root = query.from(KhsDetail.class);
		
		TypedQuery<KhsDetail> q = em.createQuery(query);
		return q.getResultList();
	}
    
}
