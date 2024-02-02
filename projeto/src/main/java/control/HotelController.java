package control;

import java.util.TreeMap;

import model.Hotel;
import repository.HotelRepository;
import view.Input;

public class HotelController {

	public static Hotel getCheaperHotel(Input input)
	{
		TreeMap<Double, Hotel> rank = new TreeMap<>();
		
		for (Hotel hotel : HotelRepository.GetInstance().getHotels()) {
			Double totalPrice = hotel.getTotalPrice(input.getDates(), input.getCustomerType());
			
			if(rank.isEmpty() ||
					!rank.containsKey(totalPrice) ||
					(rank.containsKey(totalPrice) && rank.get(totalPrice).getClassification() < hotel.getClassification()))
			{
				rank.put(totalPrice, hotel);
			}
			
		}
		return rank.firstEntry().getValue();
	}
}
