package day2;

import java.util.Scanner;


public class Ques6 {
	
	
	
	
	
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 numbers you want to perform operations on");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("Enter operation\n1)Addition\n2)Subtraction\n3)Multiply\n4)Division\n5)Mod");
		int option=sc.nextInt();
		switch(option) {
		case 1:System.out.print("sum="+(a+b));
				break;
		case 2:System.out.print("difference="+(a-b));
				break;
		case 3:System.out.print("product="+(a*b));
				break;
		case 4:System.out.print("division="+(a/b));
		       break;
		case 5:System.out.print("modulus="+(a%b));
	           break;
	    default:break;
		}
	}

}
