package com.nagarro.insurance;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		InputAccept IA=new InputAccept();
		do {
			System.out.println("\nEnter the car details:");
			String model=IA.model();
			String type=IA.type();
			Double price= IA.price();
			String InsuranceType=IA.InsuranceType();
			if(type.equals("hatchbank"))
				calculate.hatchbank(model, price,InsuranceType);
			if(type.equals("sedan"))
				calculate.sedan(model, price, InsuranceType);
			if(type.equals("suv"))
				calculate.suv(model, price, InsuranceType);
			System.out.println("Do you want to enter the details of any other car (y/n):");
			ch=sc.nextLine().charAt(0);
		}
		while ((ch=='y')||(ch=='Y'));	
	}
}
