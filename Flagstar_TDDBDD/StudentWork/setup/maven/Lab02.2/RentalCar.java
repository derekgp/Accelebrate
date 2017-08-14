package com.ntier.event.rental;

public class RentalCar {
	
	private long ID;
	private String make;
	private String model;
	RentalCar(long id, String make, String model){
		this.ID = id;
		this.make=make;
		this.model=model;
 	}

    public void setID(long ID) {
        this.ID = ID;
    }

    long getID() {
		return ID;
	}
 
	String getMake() {
		return make;
	}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
	public String toString() { 
		return this.ID + " " + this.make + " " + this.model;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentalCar rentalCar = (RentalCar) o;

        if (make != null ? !make.equals(rentalCar.make) : rentalCar.make != null) return false;
        if (model != null ? !model.equals(rentalCar.model) : rentalCar.model != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = make != null ? make.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }


}
