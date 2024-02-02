import java.text.ParseException;
import java.util.Scanner;

import control.HotelController;
import model.Hotel;
import view.Input;
import view.InputParser;

public class Principal {

	public static void main(String[] args) {

		System.out.print("Digite a entrada: ");
		Scanner sc = new Scanner(System.in);
		String strInput = "";
		try {
			strInput = sc.nextLine();
			Input input = InputParser.execute(strInput);
			Hotel hotel = HotelController.getCheaperHotel(input);
			System.out.println("O hotel mais barato para a entrada " + strInput + " � " + hotel.getName());
		} catch (ParseException e) {
			System.out.println("A entrada: " + strInput + " gerou a exce��o: " + e.getMessage());
		} finally {
			sc.close();
		}

	}

}
