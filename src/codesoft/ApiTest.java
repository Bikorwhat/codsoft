package codesoft;

import java.util.Scanner;

public class ApiTest {
	
	public static void main(String[] args) {
		
		Scanner src=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=src.nextInt();
		for(int i=0;i<=a;i++) {
			System.out.println("5*"+i+"="+(5*i));
			
		}
	}



}
