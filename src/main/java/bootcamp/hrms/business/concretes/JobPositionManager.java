package bootcamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootcamp.hrms.business.abstracts.JobPositionService;
import bootcamp.hrms.core.utilities.results.Result;
import bootcamp.hrms.core.utilities.results.SuccesResult;
import bootcamp.hrms.dataAccess.abstracts.JobPositionDao;
import bootcamp.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return this.jobPositionDao.findAll();
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccesResult("Pozisyon başarıyla oluşturuldu...: " + jobPosition);
	}

}
