package model;

import java.util.Calendar;
import java.util.List;

public class Hotel {
	private String name;
	private int classification;
	private double weeklyRegularPrice;
	private double weeklyLoyaltyPrice;
	private double weekendRegularPrice;
	private double weekendLoyaltyPrice;
	
	public Hotel(String name, int classification, double weeklyRegularPrice, double weeklyLoyaltyPrice,
			double weekendRegularPrice, double weekendLoyaltyPrice) {
		super();
		this.name = name;
		this.classification = classification;
		this.weeklyRegularPrice = weeklyRegularPrice;
		this.weeklyLoyaltyPrice = weeklyLoyaltyPrice;
		this.weekendRegularPrice = weekendRegularPrice;
		this.weekendLoyaltyPrice = weekendLoyaltyPrice;
	}

	public String getName() {
		return name;
	}

	public int getClassification() {
		return classification;
	}

	public double getWeeklyRegularPrice() {
		return weeklyRegularPrice;
	}

	public double getWeeklyLoyaltyPrice() {
		return weeklyLoyaltyPrice;
	}

	public double getWeekendRegularPrice() {
		return weekendRegularPrice;
	}

	public double getWeekendLoyaltyPrice() {
		return weekendLoyaltyPrice;
	}
	
	public double getCheaper(Calendar calendar, CustomerType customerType)
	{
		if(isWeekend(calendar))
		{
			if(customerType == customerType.LOYALTY)
			{
				return getWeekendLoyaltyPrice();
			}else
			{
				return getWeekendRegularPrice();
			}
		}else {
			if(customerType == customerType.LOYALTY)
			{
				return getWeeklyLoyaltyPrice();
			}else
			{
				return getWeeklyRegularPrice();
			}
		}
	}
	
	public double getTotalPrice(List<Calendar> dates, CustomerType customerType)
	{
		double totalPrice = 0d;
		for (Calendar item : dates) {
			totalPrice += getCheaper(item, customerType);
		}
		return totalPrice;
	}
	
	private boolean isWeekend(Calendar calendar)
	{
		return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || 
				calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
	}
	
	
}
