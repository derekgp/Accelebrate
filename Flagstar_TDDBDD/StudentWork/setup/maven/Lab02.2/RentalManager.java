package com.ntier.event.rental;

import java.util.ArrayList;
import java.util.List;

public class RentalManager {
	
	private List<RentalCar> rentalCars;
	private List<HotelRoom> hotelRooms;
	private int count = 1;
	
	public RentalManager(){
		init();
	}
	private void init() {
		rentalCars = new ArrayList<RentalCar>();
		hotelRooms = new ArrayList<HotelRoom>();
		rentalCars.add(new RentalCar(count++, "Toyota", "Matrix"));
		rentalCars.add(new RentalCar(count++, "Honda", "Civic"));
		rentalCars.add(new RentalCar(count++, "Nissan", "Quest"));
		rentalCars.add(new RentalCar(count++, "Ford", "Explorer"));
		rentalCars.add(new RentalCar(count++, "Mazda", "Mazda3"));
		hotelRooms.add(new HotelRoom(16, false));
		hotelRooms.add(new HotelRoom(12, true));
		hotelRooms.add(new HotelRoom(4, false));
		hotelRooms.add(new HotelRoom(42, true));		 
	}
	
	public int displayCars(){
		int count = 0;
		for (RentalCar car : rentalCars) {
			count++;
			 
		}
		return count;
	}
	
	public int displayHotelRooms(){
		int count = 0;
		for (HotelRoom room : hotelRooms) {
			count++;
			System.out.println(room);
		}
		return count;
	}
	
	public RentalCar getRentalCar(long id){
		RentalCar rentalCar = null;
		for (RentalCar car : rentalCars) {
			if(car.getID() == id){
				rentalCar = car;
				break;
			}
		}
		return rentalCar;
	}

    public long addRentalCar(RentalCar car){
		long id = count++;
        car.setID(id);
		rentalCars.add(car);
	    return id;
	}
	
	public long addRentalCar(String make, String model){
		long id = count++;
		rentalCars.add(new RentalCar(id, make, model)); 
	    return id; 
	}
	
	public List<RentalCar> getRentalCarByMake(String make){
		List<RentalCar> selectedCars = new ArrayList<RentalCar>();		
		for (RentalCar car : rentalCars) {
		 	if(car.getMake().contains(make)){
				selectedCars.add(car);
			}
		}
		return selectedCars;
	}

	public List<RentalCar> getRentalCars() {
		return rentalCars;
	}

	public List<HotelRoom> getHotelRooms() {
		return hotelRooms;
	}

	public int getCount() {
		return count;
	}
 	
}
