/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sttnf.ais.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author techinasia888
 */
public class BaseImpl {
    //untuk akses repository ke database
	@PersistenceContext
	protected EntityManager em;
	@PersistenceUnit
	protected EntityManagerFactory emf;
}
