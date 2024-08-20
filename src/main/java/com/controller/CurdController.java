package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.CurdDto;
import com.service.CurdService;

@RestController
public class CurdController {
	@Autowired
	CurdService serviceobj;

	@PostMapping("/save")
	public CurdDto savecurd(@RequestBody CurdDto curddto) {
		CurdDto x =  serviceobj.savecurd(curddto);
		
		return x;
	}

	@DeleteMapping("/delete/{id}")
	public void deletecurd(@PathVariable("id") Integer id) {
		serviceobj.deletecurd(id);
	}

	@PutMapping("/update/{id}")
	public void updatecurd(@RequestBody CurdDto curddto, @PathVariable("id") Integer id) {
		serviceobj.updatecurd(curddto, id);
	}

	@GetMapping("/get")
	public CurdDto getcurd(@RequestParam("id") Integer id) {
		return serviceobj.getcurd(id);

	}

	@DeleteMapping("/delete")
	public void testdeletecurd(@RequestParam("id") Integer id) {
		serviceobj.testdeletecurd(id);
	}

	@GetMapping("/get/names")
	public List<String> getNames() {
		return serviceobj.getNames();
	}

	@GetMapping("get/name/{id}")
	public String getNamebyId(@PathVariable("id") Integer id) {

		return serviceobj.getNamebyId(id);

	}

	@GetMapping("get/mails")
	public List<String> getmails() {
		return serviceobj.getmails();

	}
	
	@GetMapping("get/mail/{id}")
	public String getMailsbyId(@PathVariable("id") Integer id) {

		return serviceobj.getMailsbyId(id);

	}
	
	public int add (int a,int b) {
		int z= a+b;
		return z;
		
	}

}
