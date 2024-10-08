package com.service;

import java.util.List;
import com.dto.CurdDto;

public interface CurdService {

	public CurdDto savecurd(CurdDto curddto);

	public void deletecurd(Integer id);

	public void updatecurd(CurdDto curddto, Integer id);

	public CurdDto getcurd(Integer id);

	public void testdeletecurd(Integer id);

	public List<String> getNames();

	public String getNamebyId(Integer id);

	public List<String> getmails();
	
	public String getMailsbyId( Integer id);

}
