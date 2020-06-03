package ASM.deekshith.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ASM.deekshith.demo.model.gitrepo;

@Repository
public class gitRepoDAOImpl implements gitrepoDAO {

	@Autowired
	private EntityManager entitymanger;

	@Override
	public List<gitrepo> get(String language) {

		Session currentsession = entitymanger.unwrap(Session.class);
		Query<gitrepo> query = currentsession.createQuery("from gitrepo g where g.language = ?1", gitrepo.class);
		query.setParameter(1, language);
		List<gitrepo> list = query.getResultList();
		return list;

	}

	@Override
	public void setBookMark() {
		

	}

	@Override
	public List<gitrepo> getBookmarkedRepo(String language, Boolean value) {
		// TODO Auto-generated method stub
		return null;
	}

}
