package com.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.dto.CurdDto;

public interface CurdService {

	public void savecurd(CurdDto curddto);

	public void deletecurd(Integer id);

	public void updatecurd(CurdDto curddto, Integer id);

	public CurdDto getcurd(Integer id);

	public void testdeletecurd(Integer id);

	public List<String> getNames();

}
