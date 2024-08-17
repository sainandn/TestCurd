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
	public void savecurd(@RequestBody CurdDto curddto) {
		serviceobj.savecurd(curddto);
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
	
	@GetMapping("/get/query")
	public List<String> getNames() {
		return serviceobj.getNames();
	}

}
