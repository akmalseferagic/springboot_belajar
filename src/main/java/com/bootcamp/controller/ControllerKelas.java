/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.controller;

import com.sti.bootcamp.dao.KelasDao;
import com.sti.bootcamp.model.Kelas;
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
@RequestMapping("/Kelas")
public class ControllerKelas {
    
    @Autowired
    private KelasDao kelasDao;
    
    @GetMapping("/Getkelas")
	public String viewKelas(@RequestParam(value="id", defaultValue="") String id) {
		try {
			Kelas kelas = kelasDao.getById(Integer.valueOf(id));
			if(kelas == null) {
				return "data tidak ditmukan";
			}else {
				return "hello"+ kelas.getId_kelas();
			}
		}catch(NumberFormatException e) {
			return "salah format input";
		}catch(Exception e) {
			return String.format("terjadi kesalahan : %s", e.getMessage());
		}
	}
        
    @PostMapping("/post")
        public Kelas postKelas(@RequestBody Kelas kelas) throws Exception{
            Kelas data = kelasDao.save(kelas);
                return data;
	}
       
    @DeleteMapping("/Delkelas/{id}")
	public void Kelas (@PathVariable ("id") Kelas data) throws Exception{
		kelasDao.delete(data);
	}
        
    @PutMapping("/Putkelas")
	public Kelas update(@RequestBody Kelas kelas) throws Exception {
		Kelas update = kelasDao.save(kelas);
		return update;
	}
        
    @GetMapping("/kelas")
	public List<Kelas> getlist() throws Exception{
		List<Kelas> list = kelasDao.getList();
		return list;
	} 
}
