package model;
import org.junit.Test;

import model.CustomerType;
import model.Hotel;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;

public class HotelTest {

	@Test
	public void testCreateHotel() {
		String name = "Palm Plaza Resor";
		int classification = 3;

		double weeklyRegularPrice = 110;
		double weeklyLoyaltyPrice = 80;
		double weekendRegularPrice = 90;
		double weekendLoyaltyPrice = 80;

		Hotel h = new Hotel(name, classification, weeklyRegularPrice, weeklyLoyaltyPrice, weekendRegularPrice,
				weekendLoyaltyPrice);
		assertHotelFields(name, classification, weeklyRegularPrice, weeklyLoyaltyPrice, weekendRegularPrice,
				weekendLoyaltyPrice, h);

	}

	@Test
	public void testHotelCheapRegularWeeklyDay() {
		String name = "Palm Plaza Resor";
		int classification = 3;

		double weeklyRegularPrice = 110;
		double weeklyLoyaltyPrice = 80;
		double weekendRegularPrice = 90;
		double weekendLoyaltyPrice = 70;

		Hotel h = new Hotel(name, classification, weeklyRegularPrice, weeklyLoyaltyPrice, weekendRegularPrice,
				weekendLoyaltyPrice);
		
		Calendar c = Calendar.getInstance();
		c.set(2020, 7, 26);
		assertEquals(weeklyRegularPrice, h.getCheaper(c, CustomerType.REGULAR), 0001);

	}
	
	@Test
	public void testHotelCheapLoyaltyWeeklyDay() {
		String name = "Palm Plaza Resor";
		int classification = 3;

		double weeklyRegularPrice = 110;
		double weeklyLoyaltyPrice = 80;
		double weekendRegularPrice = 90;
		double weekendLoyaltyPrice = 70;

		Hotel h = new Hotel(name, classification, weeklyRegularPrice, weeklyLoyaltyPrice, weekendRegularPrice,
				weekendLoyaltyPrice);
		
		Calendar c = Calendar.getInstance();
		c.set(2020, 7, 26);
		assertEquals(weeklyLoyaltyPrice, h.getCheaper(c, CustomerType.LOYALTY), 0001);

	}
	
	@Test
	public void testHotelCheapRegularWeekendDay() {
		String name = "Palm Plaza Resor";
		int classification = 3;

		double weeklyRegularPrice = 110;
		double weeklyLoyaltyPrice = 80;
		double weekendRegularPrice = 90;
		double weekendLoyaltyPrice = 70;

		Hotel h = new Hotel(name, classification, weeklyRegularPrice, weeklyLoyaltyPrice, weekendRegularPrice,
				weekendLoyaltyPrice);
		
		Calendar c = Calendar.getInstance();
		c.set(2020, 7, 29);
		assertEquals(weekendRegularPrice, h.getCheaper(c, CustomerType.REGULAR), 0001);
		
		c.set(2020, 7, 30);
		assertEquals(weekendRegularPrice, h.getCheaper(c, CustomerType.REGULAR), 0001);

	}
	
	@Test
	public void testHotelCheapLoyaltyWeekendDay() {
		String name = "Palm Plaza Resor";
		int classification = 3;

		double weeklyRegularPrice = 110;
		double weeklyLoyaltyPrice = 80;
		double weekendRegularPrice = 90;
		double weekendLoyaltyPrice = 70;

		Hotel h = new Hotel(name, classification, weeklyRegularPrice, weeklyLoyaltyPrice, weekendRegularPrice,
				weekendLoyaltyPrice);
		
		Calendar c = Calendar.getInstance();
		c.set(2020, 7, 29);
		assertEquals(weekendLoyaltyPrice, h.getCheaper(c, CustomerType.LOYALTY), 0001);
		
		c.set(2020, 7, 30);
		assertEquals(weekendLoyaltyPrice, h.getCheaper(c, CustomerType.LOYALTY), 0001);

	}
	
	@Test
	public void testHotelTotalPriceDates() {
		String name = "Palm Plaza Resor";
		int classification = 3;

		double weeklyRegularPrice = 110;
		double weeklyLoyaltyPrice = 80;
		double weekendRegularPrice = 90;
		double weekendLoyaltyPrice = 80;

		Hotel h = new Hotel(name, classification, weeklyRegularPrice, weeklyLoyaltyPrice, weekendRegularPrice,
				weekendLoyaltyPrice);
		
		Calendar c = Calendar.getInstance();
		List<Calendar> dates = new LinkedList<>();
		c.set(2020, 2, 16);
		dates.add(c);
		c.set(2020, 2, 17);
		dates.add(c);
		c.set(2020, 2, 18);
		dates.add(c);
		
		assertEquals(330, h.getTotalPrice(dates, CustomerType.REGULAR), 000001);
	}
	


	public static void assertHotelFields(String name, int classification, double weeklyRegularPrice,
			double weeklyLoyaltyPrice, double weekendRegularPrice, double weekendLoyaltyPrice, Hotel hotel) {
		assertEquals(name, hotel.getName());
		assertEquals(classification, hotel.getClassification());
		assertEquals(weeklyRegularPrice, hotel.getWeeklyRegularPrice(), 000001);
		assertEquals(weeklyLoyaltyPrice, hotel.getWeeklyLoyaltyPrice(), 000001);
		assertEquals(weekendRegularPrice, hotel.getWeekendRegularPrice(), 000001);
		assertEquals(weekendLoyaltyPrice, hotel.getWeekendLoyaltyPrice(), 000001);
	}
	
	
}
