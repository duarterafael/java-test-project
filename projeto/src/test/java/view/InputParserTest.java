package view;
import org.junit.Test;

import model.CustomerType;
import view.Input;
import view.InputParser;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Calendar;

public class InputParserTest {

	@Test
	public void testFirstInput() {
		String inputStr = "Regular: 16Mar2020(mon), 17Mar2020(tues), 18Mar2020(wed)";
		try {
			Input input = InputParser.execute(inputStr);
			assertEquals(CustomerType.REGULAR, input.getCustomerType());
			assertDate(2020, 2, 16, input.getDates().get(0));
			assertDate(2020, 2, 17, input.getDates().get(1));
			assertDate(2020, 2, 18, input.getDates().get(2));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testSecondInput() {
		String inputStr = "Regular: 16Mar2020(mon), 17Mar2020(tues), 18Mar2020(wed)";
		try {
			Input input = InputParser.execute(inputStr);
			assertEquals(CustomerType.REGULAR, input.getCustomerType());
			assertDate(2020, 2, 16, input.getDates().get(0));
			assertDate(2020, 2, 17, input.getDates().get(1));
			assertDate(2020, 2, 18, input.getDates().get(2));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testThatFails() {
		String inputStr = "Regular: 16Mar2020(mon), 17Mar2020(tues), 18Mar2020(wed)";
		try {
			Input input = InputParser.execute(inputStr);
			assertEquals(CustomerType.REGULAR, input.getCustomerType());
			assertDate(2020, 2, 16, input.getDates().get(0));
			assertDate(2020, 2, 17, input.getDates().get(1));
			assertDate(2020, 2, 18, input.getDates().get(2));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	private void assertDate(int year, int month, int date, Calendar calendar) {
		assertEquals(year, calendar.get(Calendar.YEAR));
		assertEquals(month, calendar.get(Calendar.MONTH));
		assertEquals(date, calendar.get(Calendar.DATE));
	}
}
