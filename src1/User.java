package net.javaguides.springbootcrudrestfulwebservices.entity;






import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class User {
	
	
	
	 @Id
	    @GeneratedValue
	    private int id;
	    private String name;
	    private String email;
	    private String gender;
	    @OneToMany(targetEntity = Admin.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
	    private List<Admin> admin;
	    
	    
	    
	    

}






