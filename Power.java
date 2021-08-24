package com.exp;
import java.util.*;
import java.lang.Math;

public class Power {

	public static void main(String[] args) {
		System.out.println("enter the value of X is :");
		System.out.println("enter the value of N is :");
		Scanner sc=new Scanner(System.in);
		int X,N;
		X=sc.nextInt();
		N=sc.nextInt();
		int a=(int)Math.pow(X, N);
		System.out.println("the power of given number is :"+a);
		
		
		

	}

	

}
