package com.exp;
import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {
		System.out.println("enter the amount sara borrowed is");
		System.out.println("enter the no of years :");
		System.out.println("enter the  interest is ");
		int b,y;
		float i;
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		y=sc.nextInt();
		i=sc.nextFloat();
		System.out.println("the sample interest for sara is:"+(b*y*i/100));
		
	}

}
