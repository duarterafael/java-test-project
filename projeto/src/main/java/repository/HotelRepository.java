package repository;

import java.util.LinkedList;
import java.util.List;

import model.Hotel;

public class HotelRepository {

	private static HotelRepository instance;
	private List<Hotel> hotels;
	
	private HotelRepository()
	{
		hotels = new LinkedList<>();
		hotels.add(new Hotel("Palm Plaza Resor", 3, 110, 80, 90, 80));
		hotels.add(new Hotel("Elegance Haven Hotel", 4, 160, 110, 60, 50));
		hotels.add(new Hotel("Azure Horizon Retreat", 5, 220, 100, 150, 40));
	}
	
	public static HotelRepository GetInstance()
	{
		if(instance == null)
		{
			instance = new HotelRepository();
		}
		return instance;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}
	
}
