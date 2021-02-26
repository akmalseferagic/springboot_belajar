/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sttnf.ais.dao.MatakuliahDao;
import com.sttnf.ais.model.Matakuliah;



/**
 *
 * @author techinasia888
 */

@RestController
@RequestMapping("/Matakuliah")
public class ControllerMatakuliah {
    
    @Autowired
    private MatakuliahDao matakuliahDao;
    
    //	List<Matakuliah> data = new ArrayList<>();
    
    //get Mata kuliah
    
    @GetMapping("/matakuliah")
    public String viewMatakuliah (@RequestParam(value="id", defaultValue="") String id) {
        try {
			Matakuliah matakuliah = matakuliahDao.getById(Integer.valueOf(id));
			if(matakuliah == null) {
				return "data tidak ditmukan";
			}else {
				return "hello"+ matakuliah.getNama_matkul();
			}
		}catch(NumberFormatException e) {
			return "salah format input";
		}catch(Exception e) {
			return String.format("terjadi kesalahan : %s", e.getMessage());
		}
    }
    
    
    
    
    
}
