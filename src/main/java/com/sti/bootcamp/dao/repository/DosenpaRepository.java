/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao.repository;

import com.sti.bootcamp.model.Dosenpa;
import com.sti.bootcamp.model.Prodi;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author techinasia888
 */
public interface DosenpaRepository extends PagingAndSortingRepository <Dosenpa, Integer>  {
    
}