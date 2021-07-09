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

// @RestController
// @RequestMapping(value = "/students")
// @Api(value = "API to search Student from a Student Repository by different search parameters",
//        description = "This API provides the capability to search Student from a Student Repository", produces = "application/json")
// public class StudentController {
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Autowired
//    private StudentService studentService;

//    @ApiOperation(value = "Get All Student", produces = "application/json")
//    @RequestMapping(value = "/all", method = RequestMethod.GET)
//    public ResponseEntity<Object> getAllStudents() {
//        logger.debug("Getting All students ......");
//        List<Student> student = null;
//      try {
//            student = studentService.getAll();
//            logger.debug("Getting All students ...... ::");
//        } catch (Exception ex) {
//            logger.error("Error occurred in searchStudentById >>", ex, ex.getMessage());
//            return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//        return new ResponseEntity<Object>(student, HttpStatus.OK);
//   }

//    @ApiOperation(value = "Search Student by studentId", produces = "application/json")
//    @RequestMapping(value = "/{studentId}", method = RequestMethod.GET)
//    public ResponseEntity<Object> searchStudentById(
//            @ApiParam(name = "studentId",
//                    value = "The Id of the Student to be viewed",
//                    required = true)
//            @PathVariable Integer studentId) {
//        logger.debug("Searching for student with studentId ::" + studentId);
//        Student student = null;
//        try {
//           student = studentService.getStudentById(studentId);
//            logger.debug("Student found with studentId ::" + studentId);
//        } catch (Exception ex) {
//            logger.error("Error occurred in searchStudentById >>", ex, ex.getMessage());
//            return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//        return new ResponseEntity<Object>(student, HttpStatus.OK);
//    }

//    @ApiOperation(value = "Search for all Students whose age is greater than input age", produces = "application/json")
//    @RequestMapping(value = "/greaterThanAge/{age}", method = RequestMethod.GET)
//    public ResponseEntity<Object> filterStudentsByAge(
//           @ApiParam(name = "age",
//                    value = "filtering age",
//                    required = true) @PathVariable Integer age) {
//        List<Student> studentList = null;
//        try {
//            studentList = studentService.filterByAge(age);
//        } catch (Exception ex) {
//            logger.error("Error occurred in filterStudentsByAge >>", ex, ex.getMessage());
//           return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//       }
//       return new ResponseEntity<Object>(studentList, HttpStatus.OK);
//    }

//    @ApiOperation(value = "Search for all Students who are from input city", produces = "application/json")
//    @RequestMapping(value = "/fromCity/{cityName}", method = RequestMethod.GET)
//    public ResponseEntity<Object> filterStudentsByCity(
//            @ApiParam(name = "cityName", value = "filtering city name", required = true)
//            @PathVariable String cityName) {
//        List<Student> studentList = null;
//        try {
//            studentList = studentService.filterByCity(cityName);
//        } catch (Exception ex) {
//           logger.error("Error occurred in filterStudentsByCity >>", ex, ex.getMessage());
//            return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//        return new ResponseEntity<Object>(studentList, HttpStatus.OK);
//    }

//    @ApiOperation(value = "Search for all students who are from given city and "
//            + "whose age are greater than input age", produces = "application/json")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "schoolId", value = "School Id", required = true, dataType = "String", paramType = "header"),
//            @ApiImplicitParam(name = "age", value = "Age of Student", required = true, dataType = "Integer", paramType = "query"),
//            @ApiImplicitParam(name = "cityName", value = "City of Student", required = true, dataType = "String", paramType = "query") })
//    @RequestMapping(value = "/filterByAgeAndCity", method = RequestMethod.GET)
//    public ResponseEntity<Object> filterStudentsByAgeAndCity(@RequestHeader(name = "schoolId") String userId,
//                                                             @RequestParam Integer age,@RequestParam String cityName) {

//        List<Student> studentList = null;
//        try {
//            studentList = studentService.filterByAgeAndCity(age, cityName);
//        } catch (Exception ex) {
//            logger.error("Error occurred in filterStudentsByAgeAndCity >>", ex, ex.getMessage());
//            return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//        return new ResponseEntity<Object>(studentList, HttpStatus.OK);
//    }
// }
//