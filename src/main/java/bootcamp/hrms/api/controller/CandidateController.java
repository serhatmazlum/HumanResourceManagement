package bootcamp.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bootcamp.hrms.business.abstracts.CandidateService;
import bootcamp.hrms.core.utilities.results.Result;
import bootcamp.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("api/candidate")
public class CandidateController {
	
	private CandidateService candidateService;
	
	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
				
	}
	
	@GetMapping("/getAll")
	public List<Candidate> getAll(){
		
		return this.candidateService.getAll();
	}
	
	@PostMapping
	public Result add(@RequestBody Candidate candidate) {
		return this.candidateService.add(candidate);
	}
}
