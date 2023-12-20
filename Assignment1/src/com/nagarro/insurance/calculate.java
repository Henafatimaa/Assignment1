package com.nagarro.insurance;

public class calculate {
	public static void hatchbank(String model,Double price,String InsuranceType) {
		Double total_insurance;
		total_insurance=(price*5)/100;
		if(InsuranceType.equals("premium"))
			total_insurance=total_insurance+(total_insurance*20)/100;
		System.out.println(model+", "+price+","+total_insurance);
		
	}
	public static void sedan(String model,Double price,String InsuranceType) {
		Double total_insurance;
		total_insurance = (price*8)/100;
		if(InsuranceType.equals("premium"))
				total_insurance=total_insurance+(total_insurance*20)/100;
		System.out.println(model+", "+price+", "+total_insurance);
	}
	public static void suv(String model,Double price,String InsuranceType) {
		Double total_insurance;
		total_insurance = (price*10)/100;
		if(InsuranceType.equals("premium"))
			total_insurance=total_insurance+(total_insurance*20)/100;
		System.out.println(model+", "+price+", "+total_insurance);	
	}
}
