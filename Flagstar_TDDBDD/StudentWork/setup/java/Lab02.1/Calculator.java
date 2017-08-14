package com.ntier.util;

public class Calculator {
	
	double add(double x, double y){
		return x + y;
	}
	double subtract(double x, double y){
		return x - y;
	}
	double multiply(double x, double y){
		return x * y;
	}
	double divide(double x, double y){
		return x / y;
	}
	int integerDivide(int x, int y){
		return x / y;
	}
	int stringLength(String s){
		return s.length();
	}
	int numberCompare(Double x, Double y){
		return x.compareTo(y);
	}
}
