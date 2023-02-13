package model.entities;

public class Client {
	private Integer id;
	private String name;
	private PrimeAccount primeAccount;
	private UniversityAccount universityAccount;
	
	
	public Client() {
	}

	public Client(Integer id, String name) {
		this.id = id;
		this.name = name;

	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public PrimeAccount getPrimeAccount() {
		return primeAccount;
	}
	
	public void setPrimeAccount(PrimeAccount primeAccount) {
		this.primeAccount = primeAccount;
	}
	
	public UniversityAccount getUniversityAccount() {
		return universityAccount;
	}
	
	public void setUniversityAccount(UniversityAccount universityAccount) {
		this.universityAccount = universityAccount;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", document=" + ", account= ]";
	}

}
