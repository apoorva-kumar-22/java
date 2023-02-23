package stringProject;

import java.util.Scanner;

public class Sol6 {
	


	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		String[] arr=string.split("");
		
		for(String a:arr) {
			char c=a.charAt(0);
			if(Character.isUpperCase(c)) {
				System.out.print(a);
			}
		}
	}
}
