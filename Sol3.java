package stringProject;

import java.util.Scanner;

public class Sol3 {
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
		String string=sc.next();
		//sc.next takes input till there is no space
		//sc.nextLine takes input till next line. So you can include spaces in this.
		String[] arr=string.split(" ");
		System.out.print("Enter the character you want to find");
		String s=sc.next();
		int flag=0;
		for(String a:arr) {
			
			if(a.equals(s)) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.print("Exists");
		}else {
			System.out.print("Doesn't Exist");
		}
		
	}

}
