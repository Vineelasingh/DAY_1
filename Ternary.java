package com.exp;
import java.util.*;

public class Ternary {

	public static void main(String[] args) {
		System.out.println("enter the value");
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		String b = (a%2==0)? "even" : "odd";
		System.out.println("the given number is :"+b);
		
		

	}

}
