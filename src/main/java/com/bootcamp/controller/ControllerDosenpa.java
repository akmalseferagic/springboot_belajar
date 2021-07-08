/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.controller;

import com.sti.bootcamp.dao.DosenpaDao;
import com.sti.bootcamp.model.Dosenpa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author techinasia888
 */
@RestController
@RequestMapping("/Dosenpa")
public class ControllerDosenpa {
    
    @Autowired
    private DosenpaDao dosenpaDao;
    
        @GetMapping("/get")
	public String viewDosenpa(@RequestParam(value="id", defaultValue="") String id) {
		try {
			Dosenpa dosenpa = dosenpaDao.getById(Integer.valueOf(id));
			if(dosenpa == null) {
				return "data tidak ditmukan";
			}else {
				return "hello"+ dosenpa.getNama_dosenpa();
			}
		}catch(NumberFormatException e) {
			return "salah format input";
		}catch(Exception e) {
			return String.format("terjadi kesalahan : %s", e.getMessage());
		}
	}
        
    @PostMapping("/post")
        public Dosenpa postDosenpa(@RequestBody Dosenpa dosenpa) throws Exception{
            Dosenpa data = dosenpaDao.save(dosenpa);
                return data;
	}
       
    @DeleteMapping("/delete/{id}")
	public void Dosenpa (@PathVariable ("id") Dosenpa data) throws Exception{
		dosenpaDao.delete(data);
	}
        
    @PutMapping("/put")
	public Dosenpa update(@RequestBody Dosenpa dosenpa) throws Exception {
		Dosenpa update =dosenpaDao.save(dosenpa);
		return update;
	}
        
    @GetMapping("/getall")
	public List<Dosenpa> getlist() throws Exception{
		List<Dosenpa> list =dosenpaDao.getList();
		return list;
	}
    
}
