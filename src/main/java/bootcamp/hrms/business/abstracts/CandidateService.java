package bootcamp.hrms.business.abstracts;

import java.util.List;

import bootcamp.hrms.core.utilities.results.Result;
import bootcamp.hrms.entities.concretes.Candidate;
import bootcamp.hrms.entities.concretes.JobPosition;

public interface CandidateService {

	List<Candidate> getAll();
	Result add(Candidate candidate);
}
