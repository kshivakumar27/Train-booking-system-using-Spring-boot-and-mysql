package net.javaguides.springbootcrudrestfulwebservices.entity;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Admin {
	
	
	  @Id
	    private int pid;
	    private String rank;
	    private int exp;
	    private int phoneno;
	    
	    
	    
	  

	    

}
