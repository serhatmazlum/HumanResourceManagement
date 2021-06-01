package bootcamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bootcamp.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
