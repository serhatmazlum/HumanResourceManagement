package bootcamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootcamp.hrms.business.abstracts.CandidateService;
import bootcamp.hrms.core.utilities.results.Result;
import bootcamp.hrms.core.utilities.results.SuccesDataResult;
import bootcamp.hrms.dataAccess.abstracts.CandidateDao;
import bootcamp.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{

	private CandidateDao  candidateDao;

	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}
	
	@Override
	public List<Candidate> getAll() {
		// TODO Auto-generated method stub
		return this.candidateDao.findAll();
	}

	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccesDataResult("Candidate succesfuly created "+candidate);
	}

}
