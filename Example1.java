package selfExample;

import java.util.Scanner;

//at the time of project creation select 1.8 version
public class Example1 {
	
	public static void main(String args[]) {
		int i;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		if(i<0) {
			System.out.print("Negative");
		}else if(i>0){
			System.out.print("Positive");
		}else {
			System.out.print("Zero");
		}
	}

}
