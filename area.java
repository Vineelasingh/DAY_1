package com.exp;
import java.util.*;

public class area {

	public static void main(String[] args) {
		System.out.println("enter the side of the square");
		System.out.println("enter the length of the rectangular");
		System.out.println("enter the breadth of the rectangular");
		System.out.println("enter the radius of a circle");
		int s,l,b;
		float r;
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		l=sc.nextInt();
		b=sc.nextInt();
		r=sc.nextFloat();
		System.out.println("the area of a square is :"+(s*s));
		System.out.println("the area of rectangular is :"+(l*b));
		System.out.println("the area of circle is :"+(3.14*(r*r)));
		
		
		

	}

}
