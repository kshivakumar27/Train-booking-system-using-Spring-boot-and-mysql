package net.javaguides.springbootcrudrestfulwebservices.repository;




import net.javaguides.springbootcrudrestfulwebservices.controller.S;
import net.javaguides.springbootcrudrestfulwebservices.dto.InfoResponse;
import net.javaguides.springbootcrudrestfulwebservices.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer>{
	
	
	

	   @Query("SELECT new net.javaguides.springbootcrudrestfulwebservices.dto.InfoResponse(c.name , p.rank) FROM User c JOIN c.admin p")
	    public List<InfoResponse> getJoinInformation();

	public User saveAll(S user);

	


}




