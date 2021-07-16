/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sttnf.ais.controller;

import com.sttnf.ais.dao.MahasiswaDao;
import com.sttnf.ais.model.Mahasiswa;
import com.sttnf.ais.model.Matakuliah;
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
@RequestMapping("/Mahasiswa")
public class ControllerMahasiswa {
    
    @Autowired
	private MahasiswaDao mahasiswaDao;
    
    @GetMapping("/get")
	public String viewMahasiswa(@RequestParam(value="id", defaultValue="") String id) {
		try {
			Mahasiswa mahasiswa = mahasiswaDao.getById(Integer.valueOf(id));
			if(mahasiswa == null) {
				return "data tidak ditmukan";
			}else {
				return "hello"+ mahasiswa.getNim_mhs();
			}
		}catch(NumberFormatException e) {
			return "salah format input";
		}catch(Exception e) {
			return String.format("terjadi kesalahan : %s", e.getMessage());
		}
	}
        
    @PostMapping("/post")
        public Mahasiswa postMahasiswa(@RequestBody Mahasiswa mahasiswa) throws Exception{
            Mahasiswa data = mahasiswaDao.save(mahasiswa);
                return data;
	}
       
    @DeleteMapping("/delete/{id}")
	public void Mahasiswa (@PathVariable ("id") Mahasiswa data) throws Exception{
		mahasiswaDao.delete(data);
	}
        
    @PutMapping("/put")
	public Mahasiswa update(@RequestBody Mahasiswa mahasiswa) throws Exception {
		Mahasiswa update = mahasiswaDao.save(mahasiswa);
		return update;
	}
        
    @GetMapping("/getall")
	public List<Mahasiswa> getlist() throws Exception{
		List<Mahasiswa> list = mahasiswaDao.getList();
		return list;
	}
}
