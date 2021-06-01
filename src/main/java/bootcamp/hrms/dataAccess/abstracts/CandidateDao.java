package bootcamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bootcamp.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {

}
