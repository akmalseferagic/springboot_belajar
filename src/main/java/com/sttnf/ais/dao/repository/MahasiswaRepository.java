/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sttnf.ais.dao.repository;

import com.sttnf.ais.model.Mahasiswa;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author techinasia888
 */
public interface MahasiswaRepository extends PagingAndSortingRepository<Mahasiswa, String> {
    
}
