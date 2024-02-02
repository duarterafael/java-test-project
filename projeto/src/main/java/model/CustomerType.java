package model;

public enum CustomerType {
	REGULAR("Regular"),
	LOYALTY("Fidelidade");
	
	private String value;
	CustomerType(String value)
	{
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	
	public static CustomerType getCustomerType(String value)
	{
		for (CustomerType item : values()) {
			if(item.getValue().equalsIgnoreCase(value)) {
				return item;
			}
		}
		return null;
	}
	
}
