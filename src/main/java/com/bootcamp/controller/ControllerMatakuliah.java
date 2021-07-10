/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.controller;


import com.sti.bootcamp.dao.MatakuliahDao;
import com.sti.bootcamp.model.Matakuliah;
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
@RequestMapping("/Matakuliah")
public class ControllerMatakuliah {
    
    @Autowired
	private MatakuliahDao matakuliahDao;
    
    	@GetMapping("/get")
	public String viewMatakuliah(@RequestParam(value="id", defaultValue="") String id) {
		try {
			Matakuliah matakuliah = matakuliahDao.getById(Integer.valueOf(id));
			if(matakuliah == null) {
				return "data tidak ditmukan";
			}else {
				return "hello"+ matakuliah.getKode_mk();
			}
		}catch(NumberFormatException e) {
			return "salah format input";
		}catch(Exception e) {
			return String.format("terjadi kesalahan : %s", e.getMessage());
		}
	}
	
	@PostMapping("/post")
	public Matakuliah postMatakuliah(@RequestBody Matakuliah matakuliah) throws Exception{
		Matakuliah data = matakuliahDao.save(matakuliah);
		return data;
	}
	
	@DeleteMapping("/delete/{id}")
	public void Matakuliah(@PathVariable ("id") Matakuliah data) throws Exception{
		matakuliahDao.delete(data);
	}
	
	@PutMapping("/put")
	public Matakuliah update(@RequestBody Matakuliah matakuliah) throws Exception {
		Matakuliah update = matakuliahDao.save(matakuliah);
		return update;
	}
	
	@GetMapping("/getall")
	public List<Matakuliah> getlist() throws Exception{
		List<Matakuliah> list = matakuliahDao.getList();
		return list;
	}
    
    
}
