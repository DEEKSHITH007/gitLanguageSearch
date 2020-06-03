package ASM.deekshith.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "repository")
public class gitrepo {
	
	@Id
	@Column(name = "serial_number")
	private int serialnumber;
	@Column(name = "name")
	private String repoName;
	@Column(name = "link")
	private String repoLink;
	@Column(name = "user_name")
	private String repoUser;
	@Column(name = "bookmark")
	private Boolean bookmark;
	@Column(name = "language")
	private String language;

	
	public String getRepoName() {
		return repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}

	public String getRepoLink() {
		return repoLink;
	}

	public void setRepoLink(String repoLink) {
		this.repoLink = repoLink;
	}

	public String getRepoUser() {
		return repoUser;
	}

	public void setRepoUser(String repoUser) {
		this.repoUser = repoUser;
	}

	public Boolean getBookmark() {
		return bookmark;
	}

	public void setBookmark(Boolean bookmark) {
		this.bookmark = bookmark;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	
}
