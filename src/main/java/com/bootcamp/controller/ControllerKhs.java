/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.controller;

import com.sti.bootcamp.dao.KhsDao;
import com.sti.bootcamp.model.Khs;
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
@RequestMapping("/Khs")
public class ControllerKhs {
    
       
    @Autowired
	private KhsDao khsDao;
    
    @GetMapping("/get")
	public String viewKhs(@RequestParam(value="id", defaultValue="") String id) {
		try {
			Khs khs = khsDao.getById(Integer.valueOf(id));
			if(khs == null) {
				return "data tidak ditmukan";
			}else {
				return "hello"+ khs.getId_khs();
			}
		}catch(NumberFormatException e) {
			return "salah format input";
		}catch(Exception e) {
			return String.format("terjadi kesalahan : %s", e.getMessage());
		}
	}
        
//    @GetMapping("/khs/{nim_mhs}")
//        public String findKhs(@RequestParam(value="nim_mhs", defaultValue="") String nim_mhs){
//            try {
//                    khsDao.findKhs(String.valueOf(nim_mhs));
//		}catch(NumberFormatException e) {
//			return "salah format input";
//		}catch(Exception e) {
//			return String.format("terjadi kesalahan : %s", e.getMessage());
//		}
//        return null;
//          
//        }
        
    @GetMapping("/find/{nim_mhs}")
    public List<Khs> findKhs (@PathVariable ("nim_mhs") String data) throws Exception{
		List<Khs> list = khsDao.findKhs(data);
            return list;
	}
        
    @PostMapping("/post")
        public Khs postKhs(@RequestBody Khs khs) throws Exception{
            Khs data = khsDao.save(khs);
                return data;
	}
       
    @DeleteMapping("/delete/{id}")
	public void Khs (@PathVariable ("id") Khs data) throws Exception{
		khsDao.delete(data);
	}
        
    @PutMapping("/put")
	public Khs update(@RequestBody Khs khs) throws Exception {
		Khs update = khsDao.save(khs);
		return update;
	}
        
    @GetMapping("/getall")
	public List<Khs> getlist() throws Exception{
		List<Khs> list = khsDao.getList();
		return list;
	}
    
}
