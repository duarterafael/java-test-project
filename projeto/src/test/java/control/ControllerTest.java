package control;
import org.junit.Test;

import control.HotelController;
import model.Hotel;
import view.Input;
import view.InputParser;

import static org.junit.Assert.*;

import java.text.ParseException;

public class ControllerTest {
	@Test
	public void testFirstInput() {
		String inputStr = "Regular: 16Mar2020(mon), 17Mar2020(tues), 18Mar2020(wed)";
		try {
			Input input = InputParser.execute(inputStr);
			Hotel hotel = HotelController.getCheaperHotel(input);
			assertEquals("Palm Plaza Resor", hotel.getName());
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
