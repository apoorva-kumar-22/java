package day2;

import java.util.Scanner;

public class Ques2 {

	int calculateDifference(int n)
	{
		int squareSum=0,sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
			squareSum+=i*i;
		}
		return sum*sum-squareSum;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input :");
		int i=sc.nextInt();
		Ques2 q=new Ques2();
		int ans=q.calculateDifference(i);
		System.out.print(ans);
	}
}
