package day2;

import java.util.Scanner;

public class Ques7 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a<b && a<c) {
			System.out.print(a+"is the smallest");
		}else if(b<a && b<c) {
			System.out.print(b +"is the smallest");
		}else {
			System.out.print(c+" is the smallest");
		}
	}
}
