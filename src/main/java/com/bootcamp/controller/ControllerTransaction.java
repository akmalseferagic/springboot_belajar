/*package com.bootcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sti.bootcamp.dao.TransactionDao;
import com.sti.bootcamp.model.Transaction;

@RestController
@RequestMapping("/Transaction")
public class ControllerTransaction {
		@Autowired
		private TransactionDao transactionDao;
		@GetMapping("/transaction")
		public String viewtransaction (@RequestParam(value="id", defaultValue="") String id) {
			try {
				Transaction trx = transactionDao.getById(Integer.valueOf(id));
				if(trx == null) {
					return "data tidak ditmukan";
				}else {
					return "hello"+ trx.getAccountid();
//					
				}
			}catch(NumberFormatException e) {
				return "salah format input";
			}catch(Exception e) {
				return String.format("terjadi kesalahan : %s", e.getMessage());
			}
			
		}
		@PostMapping("/post")
		public Transaction postTransaction(@RequestBody Transaction transaction) throws Exception {
			Transaction data = transactionDao.save(transaction);
			return data;
			
		}
		@DeleteMapping("/transaction/{id}")
		public void transaction(@PathVariable ("id") Transaction data) throws Exception{
			transactionDao.delete(data);
		}
		
		@GetMapping("/transactions")
		public List<Transaction> getlist() throws Exception{
			List<Transaction> list = transactionDao.getList();
			return list;
		}
		
}*/
