package view;

import java.util.Calendar;
import java.util.List;

import model.CustomerType;

public class Input {
	private CustomerType customerType;
	private List<Calendar> dates;
	
	
	
	public Input(CustomerType customerType, List<Calendar> dates) {
		super();
		this.customerType = customerType;
		this.dates = dates;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public List<Calendar> getDates() {
		return dates;
	}
}
