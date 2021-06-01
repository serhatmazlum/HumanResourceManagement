package bootcamp.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import bootcamp.hrms.entities.abstracts.Entities;
import bootcamp.hrms.entities.abstracts.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Table(name = "employees")
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@javax.persistence.Entity
@PrimaryKeyJoinColumn(name = "id")
public class Employee extends User implements Entities {

//	@Id
//	@Column(name = "id")
//	@PrimaryKeyJoinColumn
//	private int id;
	
	@NotNull
	@Column(name = "first_name")
	private String name;
	
	@NotNull
	@Column(name = "last_name")
	private String lastName;
	
	
	public Employee(String email, String password,String name,String lastName) {
		super(email, password);
		
		this.name = name;
		this.lastName = lastName;
		
		
	
		
	}

	
}
