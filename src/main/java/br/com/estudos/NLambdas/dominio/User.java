package br.com.estudos.NLambdas.dominio;

public class User {
	
	private String name;
	private String prof;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	public User(String name, String prof) {
		super();
		this.name = name;
		this.prof = prof;
	}
	
	

}
