package com.controlflowstatements;

import java.util.Scanner;

public class Easy_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age;
		age = sc.nextInt();
		System.out.println("Enter the weight");
        int weight;
		weight = sc.nextInt();
		
		if(age>=18 && age <=55 && weight>=45) {
			System.out.println("Eligible to donate");
		}
		else {
			System.out.println("Not eligible");
		}
	}

}
