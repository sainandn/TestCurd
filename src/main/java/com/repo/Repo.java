package com.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.dto.CurdDto;

public interface Repo extends JpaRepository<CurdDto, Integer> {

	@Query("select name from CurdDto")
	public List<String> getNames();

	@Query("select name from CurdDto where id= :id")
	public String getNamebyId(Integer id);

	@Query("select mail from CurdDto")
	public List<String> getmails();
	
	@Query("select mail from CurdDto where id= :id")
	public String getMailsbyId( Integer id);

}
