package com.ntier.life.insurance;

import java.util.HashMap;
import java.util.Map;

import com.thirdparty.service.MedicalRatingService;

public class LifeQuoteStarter {

	private Insurable insured;
	private static Map<String, Double> baseCost;

	double getLifeQuote() {
		double totalRate = -1.0;

		// get base rate
		totalRate = this.calcBaseCost();

		// add gender amt
		

		// add med rating


		return totalRate;

	}

	private double calcBaseCost() {
		String baseCostKey = null;
		int insuredAge = insured.getAge();
		double baseCostAmt = 0.0;

		if (insuredAge < 30) {
			baseCostKey = "29";
		} else if (insuredAge < 40) {
			baseCostKey = "39";
		} else if (insuredAge < 50) {
			baseCostKey = "49";
		} else if (insuredAge < 60) {
			baseCostKey = "59";
		}
		// TODO handle over 60
		// throw UnisurableException

		return baseCost.get(baseCostKey);
	}

	

	static {
		baseCost = new HashMap<String, Double>();
		baseCost.put("29", new Double(20));
		baseCost.put("39", new Double(25));
		baseCost.put("49", new Double(30));
		baseCost.put("59", new Double(35));

	}

}
