package stringProject;

import java.util.Scanner;

public class Sol4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		String whattocheck=sc.next();
		int lengthS=string.length();
		int length=whattocheck.length();
			
		
		if(string.substring(lengthS-length, lengthS).equals(whattocheck))
			System.out.print("Exists");
		else
			System.out.print("Doesn't Exist");
			
	}

}
