package ASM.deekshith.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ASM.deekshith.demo.model.gitrepo;
import ASM.deekshith.demo.service.gitRepoService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api")
public class GitRepoController {
	
	@Autowired
	private gitRepoService gitservice;
	
	@GetMapping("/gitrepo/{language}")
	public List<gitrepo> get(@PathVariable String language){
		return gitservice.get(language);
	}

}
