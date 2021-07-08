/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.controller;

import com.sti.bootcamp.dao.SemesterDao;
import com.sti.bootcamp.model.Semester;
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
@RequestMapping("/Semester")
public class ControllerSemester {
    
        @Autowired
	private SemesterDao semesterDao;

    @GetMapping("/get")
	public String viewSemester(@RequestParam(value="id", defaultValue="") String id) {
		try {
			Semester semester = semesterDao.getById(Integer.valueOf(id));
			if(semester == null) {
				return "data tidak ditmukan";
			}else {
				return "hello"+ semester.getSemester();
			}
		}catch(NumberFormatException e) {
			return "salah format input";
		}catch(Exception e) {
			return String.format("terjadi kesalahan : %s", e.getMessage());
		}
	}
        
    @PostMapping("/post")
        public Semester postSemester(@RequestBody Semester semester) throws Exception{
            Semester data = semesterDao.save(semester);
                return data;
	}
       
    @DeleteMapping("/delete/{id}")
	public void Semester (@PathVariable ("id") Semester data) throws Exception{
		semesterDao.delete(data);
	}
        
    @PutMapping("/put")
	public Semester update(@RequestBody Semester semester) throws Exception {
		Semester update = semesterDao.save(semester);
		return update;
	}
        
    @GetMapping("/getall")
	public List<Semester> getlist() throws Exception{
		List<Semester> list = semesterDao.getList();
		return list;
	}       
       
    
    
}
