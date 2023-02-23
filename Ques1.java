package day2;

import java.util.Scanner;

public class Ques1 {
	
	int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input :");
		int i=sc.nextInt();
		Ques1 q=new Ques1();
		int sum=q.calculateSum(i);
		System.out.print(sum);
		sc.close();
	}
}
