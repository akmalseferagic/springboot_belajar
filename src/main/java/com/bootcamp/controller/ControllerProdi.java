/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.controller;

import com.sti.bootcamp.dao.ProdiDao;
import com.sti.bootcamp.model.Prodi;
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
@RequestMapping("/Prodi")
public class ControllerProdi {
    
       @Autowired
	private ProdiDao prodiDao;

    @GetMapping("/get")
	public String viewProdi(@RequestParam(value="id", defaultValue="") String id) {
		try {
			Prodi prodi = prodiDao.getById(Integer.valueOf(id));
			if(prodi == null) {
				return "data tidak ditmukan";
			}else {
				return "hello"+ prodi.getNama_prodi();
			}
		}catch(NumberFormatException e) {
			return "salah format input";
		}catch(Exception e) {
			return String.format("terjadi kesalahan : %s", e.getMessage());
		}
	}
        
    @PostMapping("/post")
        public Prodi postProdi(@RequestBody Prodi prodi) throws Exception{
            Prodi data = prodiDao.save(prodi);
                return data;
	}
       
    @DeleteMapping("/delete/{id}")
	public void Prodi (@PathVariable ("id") Prodi data) throws Exception{
		prodiDao.delete(data);
	}
        
    @PutMapping("/put")
	public Prodi update(@RequestBody Prodi prodi) throws Exception {
		Prodi update = prodiDao.save(prodi);
		return update;
	}
        
    @GetMapping("/getall")
	public List<Prodi> getlist() throws Exception{
		List<Prodi> list = prodiDao.getList();
		return list;
	}       
       
    
}
