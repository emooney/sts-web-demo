package model;

public class Search {
	private long id;
	private String ssn;
	
	public Search() {
		
	}
	
	public Search(long id, String ssn) {
		this.id = id;
		this.ssn = ssn;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
}
