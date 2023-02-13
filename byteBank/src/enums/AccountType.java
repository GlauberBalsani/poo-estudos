package enums;

public enum AccountType {

	PRIME("prime"), UNIVERSITY("university");

	private final String type;

	AccountType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

}
