package ASM.deekshith.demo.dao;

import java.util.List;

import ASM.deekshith.demo.model.gitrepo;


public interface gitrepoDAO {
	
	List<gitrepo> get(String language);
	
	void setBookMark();
	
	List<gitrepo> getBookmarkedRepo(String language, Boolean value);

}
