package com.ntier.event.rental;

class HotelRoom {
	
	private boolean smoke;
	private int room;
	
	HotelRoom(int room, boolean smoke){
		this.room=room;
		this.smoke=smoke;
	}
 
	@Override
	public String toString() { 
		return this.room + " " + this.smoke;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + room;
		result = prime * result + (smoke ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelRoom other = (HotelRoom) obj;
		if (room != other.room)
			return false;
		if (smoke != other.smoke)
			return false;
		return true;
	}

	 
	
	

}
