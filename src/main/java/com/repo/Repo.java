package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dto.CurdDto;

public interface Repo extends JpaRepository<CurdDto, Integer> {
	
	@Query("select name from CurdDto")
	public List<String> getNames();

}
