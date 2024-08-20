package com.controller;

import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.apache.logging.log4j.util.SortedArrayStringMap;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.dto.CurdDto;
import com.service.CurdService;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
public class CurdControllerTest {

	@BeforeAll
	public void setup() {
		MockitoAnnotations.openMocks(this);

	}

	@InjectMocks
	CurdController obj;

	@Mock
	private CurdService service;

	@Test
	public void addTest() {
		CurdController obj = new CurdController();
		obj.add(2, 3);
	}

	@Test
	public void savecurdTest() {

		CurdDto curddto = new CurdDto();
		curddto.setId(7); 
		curddto.setName("Sai");
		curddto.setBranch("Mech");
		curddto.setMail("sai@mail.com");

		when(service.savecurd(curddto)).thenReturn(curddto);
		obj.savecurd(curddto);
	}
	@Test
	public void getcurdTest() {
		CurdDto curddto = new CurdDto();
		curddto.setId(7); 
		curddto.setName("Sai");
		curddto.setBranch("Mech");
		curddto.setMail("sai@mail.com");
		when(service.getcurd(7)).thenReturn(curddto);
		obj.getcurd(7);
	
		
	}
	@Test
	public void getNamesTest() {
		when(service.getNames()).thenReturn(new ArrayList<String>());
		obj.getNames();
	}
	@Test
	public void getNamebyIdTest() {
		when(service.getNamebyId(3)).thenReturn("test");
		obj.getNamebyId(3);
	}
	@Test
	public void getmailsTest() {
		when(service.getmails()).thenReturn(new ArrayList<String>());
		obj.getmails();
	}
	@Test
	public void getMailsbyIdTest() {
		when(service.getMailsbyId(2)).thenReturn("demo");
		obj.getMailsbyId(2);
	}

}