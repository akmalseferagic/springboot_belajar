/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.controller;

import com.sti.bootcamp.dao.KhsDetailDao;
import com.sti.bootcamp.model.KhsDetail;
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
@RequestMapping("/KhsDetail")
public class ControllerKhsDetail {
    
        @Autowired
	private KhsDetailDao khsdetailDao;

        @GetMapping("/get")
	public String viewKhsDetail(@RequestParam(value="id", defaultValue="") String id) {
		try {
			KhsDetail khsdetail = khsdetailDao.getById(Integer.valueOf(id));
			if(khsdetail == null) {
				return "data tidak ditmukan";
			}else {
				return "hello"+ khsdetail.getId_khsdetail();
			}
		}catch(NumberFormatException e) {
			return "salah format input";
		}catch(Exception e) {
			return String.format("terjadi kesalahan : %s", e.getMessage());
		}
	}
        
          @PostMapping("/post")
        public KhsDetail postKhsDetail(@RequestBody KhsDetail khsdetail) throws Exception{
            KhsDetail data = khsdetailDao.save(khsdetail);
                return data;
	}
       
    @DeleteMapping("/delete/{id}")
	public void KhsDetail (@PathVariable ("id") KhsDetail data) throws Exception{
		khsdetailDao.delete(data);
	}
        
    @PutMapping("/put")
	public KhsDetail update(@RequestBody KhsDetail khsdetail) throws Exception {
		KhsDetail update = khsdetailDao.save(khsdetail);
		return update;
	}
        
    @GetMapping("/getall")
	public List<KhsDetail> getlist() throws Exception{
		List<KhsDetail> list = khsdetailDao.getList();
		return list;
	}
        
}
