package bootcamp.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import bootcamp.hrms.entities.abstracts.Entities;
import bootcamp.hrms.entities.abstracts.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name = "candidate" )
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "id")
@javax.persistence.Entity
public class Candidate extends User implements Entities {
	
//	@Id
//	@Column(name = "id")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	//@PrimaryKeyJoinColumn
//	private int id;
	
	@NotNull
	@Column(name ="first_name")
	private String firstName;
	
	@NotNull
	@Column(name = "last_name")
	private String lastName;
	
	@NotNull
	@Column(name = "identity_number")
	private String identityNumber;
	
	@NotNull
	@Column(name = "birth_day")
	private Date  birthDay;

	public Candidate( String email, String password,String firstName,String lastName,
			String identityNumber,
			Date  birthDay) {
		super(email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDay = birthDay;
		
	}

	
	
}