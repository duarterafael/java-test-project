package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import model.CustomerType;

public class InputParser {
	private final static String CUSTOMER_TYPE_BREAKER = ": ";
	private final static String DATE_BREAKER = ", ";
	private final static String DATE_PATTERN = "ddMMMyyy";

	public static Input execute(String inputStr) throws ParseException {
		String[] aux = inputStr.split(CUSTOMER_TYPE_BREAKER);
		String customerTypeStr = aux[0];
		String datesStr = aux[1];
		String[] datesStrArray = datesStr.split(DATE_BREAKER);

		CustomerType customerType = CustomerType.getCustomerType(customerTypeStr);
		if (customerType == null) {
			throw new ParseException("Customer Type: " + customerTypeStr + " invalid",
					ParserError.CUSTOMER_TYPE_PARSER_ERROR);
		}
		List<Calendar> dates = new LinkedList<Calendar>();

		for (String dateStr : datesStrArray) {
			try {
				dates.add(parserDate(dateStr));
			} catch (Exception e) {
				throw new ParseException("Invalid date: " + dateStr,
						ParserError.DATE_PARSER_ERROR);

			}
		}

		return new Input(customerType, dates);
	}

	private static Calendar parserDate(String dateStr) throws ParseException {
		Date date = new SimpleDateFormat(DATE_PATTERN).parse(dateStr);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}
}
