package com.exp;
import java.util.Scanner;

public class swap_1 {

	public static void main(String[] args) {
		System.out.println("enter two values:");
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the given value of a is :"+(a));
		System.out.println("the given value of b is :"+(b));

	}

}
