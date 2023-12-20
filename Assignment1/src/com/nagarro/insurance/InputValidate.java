package com.nagarro.insurance;

public class InputValidate {
	public static boolean checkDouble(String str) {
		try {
			Double.parseDouble(str);
		}catch (NumberFormatException e) {
			System.out.println("Enter the price again in double format:");
			return false;
			}
		return true;
	}
	public static boolean checkItemType(String str) {
		if(str.equals("hatchbank")||str.equals("sedan")||str.equals("suv")) {
	//		System.out.println(str);
		
			return true;
		}else {
		
		System.err.print("You entered wrong car type. kindly enter again");
		return false;}
	}
	public static boolean checkInsuranceType(String str) {
		if(str.equals("basic")||str.equals("premium"))
			return true;
		System.err.print("You entered wrong insurance type. Kindly enter again");
		return false;
	}

}
