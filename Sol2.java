package stringProject;

import java.util.Scanner;

public class Sol2 {

	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
		String string=sc.next();
		//sc.next takes input till there is no space
		//sc.nextLine takes input till next line. So you can include spaces in this.
		String[] arr=string.split(" ");
		String answer="";
		for(String a:arr) {
			System.out.print(a);
		}
		
		for(String element:arr){
			answer+=element.substring(0,1).toUpperCase()+ element.substring(1)+" ";
		}
		System.out.print(answer.trim());
	}
}
