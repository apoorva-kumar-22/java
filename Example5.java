package selfExample;

import java.util.Scanner;

public class Example5 {
	public static void main(String args[]) {
		int sum=0;
		for(int i=1;i<=5;i++) {
			Scanner sc=new Scanner(System.in);
			i=sc.nextInt();
			sum+=i;
		}
		System.out.print("Sum="+sum);
		System.out.print("Average="+ sum/5);
	}

}
