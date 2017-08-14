package com.ntier.life.insurance;

public class HealthPlan {
	
	private int zip;
	private int deductable;
	private double premium;
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public int getDeductable() {
		return deductable;
	}
	public void setDeductable(int deductable) {
		this.deductable = deductable;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public long calculateDeductable() {
		// TODO Auto-generated method stub
		return Math.round((premium * 10000)/ zip) * 12;
	}
 
 
	 
}
