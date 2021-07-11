/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao.repository;

import com.sti.bootcamp.model.Khs;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author techinasia888
 */
public interface KhsRepository extends PagingAndSortingRepository<Khs, Integer> {
//    @Query("SELECT p FROM Person p WHERE LOWER(p.lastName) = LOWER(:lastName)")
//    public final static String khs ="select m.nama_mk, m.sks_mk, k.nilai, k.jumlahnilai from Matakuliah m , Khs k where k.kode_mk = m.kode_mk and nim_mhs = :nim_mhs order by nim_mhs";
    @Query("select k.thajaran, m.nama_mk, m.sks_mk, k.nilai, k.jumlahnilai from Matakuliah m, Khs k where k.kode_mk = m.kode_mk and nim_mhs = :nim_mhs order by nim_mhs")
//    @Query(khs)
    public List<Khs> findKhs(@Param("nim_mhs") String nim_mhs);
}


//select matakuliah.nama_mk,  matakuliah.sks_mk, khs.nilai, khs.jumlahnilai 
//from khs, matakuliah
//where khs.kode_mk = matakuliah.kode_mk and nim_mhs = '0110216035' order by nim_mhs;