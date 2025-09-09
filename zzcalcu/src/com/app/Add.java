package com.app;
import java.util.*;
public class Add {
	
	
	public void add()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		
		int n1 = sc.nextInt();
		
        System.out.println("Enter Second Number");
		
		int n2 = sc.nextInt();
		
		int n3 = n1 + n2;
		
		System.out.println("Add : "+n3);
		
		
	}

}
