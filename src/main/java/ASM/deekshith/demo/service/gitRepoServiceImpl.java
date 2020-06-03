package ASM.deekshith.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ASM.deekshith.demo.dao.gitrepoDAO;

import ASM.deekshith.demo.model.gitrepo;

@Service
public class gitRepoServiceImpl  implements gitRepoService{
	
	@Autowired
	private gitrepoDAO gitRDAO;

	@Override
	public List<gitrepo> get(String language) {
		return gitRDAO.get(language);
	}

	@Override
	public void setBookMark() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<gitrepo> getBookmarkedRepo(String language, Boolean value) {
		// TODO Auto-generated method stub
		return null;
	}

}
