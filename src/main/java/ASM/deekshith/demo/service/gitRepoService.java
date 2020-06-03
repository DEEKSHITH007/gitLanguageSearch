package ASM.deekshith.demo.service;

import java.util.List;

import ASM.deekshith.demo.model.gitrepo;

public interface gitRepoService {

	List<gitrepo> get(String language);

	void setBookMark();

	List<gitrepo> getBookmarkedRepo(String language, Boolean value);

}
