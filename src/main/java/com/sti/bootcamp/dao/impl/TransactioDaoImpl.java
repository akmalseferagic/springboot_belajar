/*package com.sti.bootcamp.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.sti.bootcamp.dao.TransactionDao;
import com.sti.bootcamp.dao.repository.TransactionRepository;
import com.sti.bootcamp.model.Transaction;

public class TransactioDaoImpl extends BaseImpl implements TransactionDao{
	
	@Autowired
	private TransactionRepository repository;
	@Override
	public Transaction getById(int id) throws Exception {
		// TODO Auto-generated method stub
		return repository.findByid(id);
	}

	@Override
	public Transaction save(Transaction transaction) throws Exception {
		// TODO Auto-generated method stub
		
		return repository.save(transaction);
	}

	@Override
	public void delete(Transaction transaction) throws Exception {
		// TODO Auto-generated method stub
		repository.delete(transaction);
		
	}

	@Override
	public List<Transaction> getList() throws Exception {
		// TODO Auto-generated method stub
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Transaction> query = critB.createQuery(Transaction.class);
		Root<Transaction> root = query.from (Transaction.class);
		
		TypedQuery<Transaction> q = em.createQuery(query);
		return q.getResultList();
		
	}

}
*/