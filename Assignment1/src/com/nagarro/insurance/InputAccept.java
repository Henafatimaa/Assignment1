
package com.nagarro.insurance;
import java.util.*;

public class InputAccept {
	public String model() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the car model:");
		return sc.nextLine();	
	}
	public String type() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the car type:");
		String str;
		boolean valid;
	//	do {
			str=sc.nextLine();
			valid = InputValidate.checkItemType(str.toLowerCase());
		//}
	//	while(!valid);
		return str.toLowerCase();
		
		}
	public Double price() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the car price");
		String str;
		boolean valid;
	//	do {
			str=sc.nextLine();
			valid=InputValidate.checkDouble(str);
	//	}while(!valid);
		return Double.parseDouble(str);
	}
	public String InsuranceType() {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the car insurance");
	    String str;
	    boolean valid;
	  //  do {
	    	str=sc.nextLine();
	    	valid = InputValidate.checkInsuranceType(str.toLowerCase());	
	 //   }while(!valid);
	    return str.toLowerCase();
	}
	
}
