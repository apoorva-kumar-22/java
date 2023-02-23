package selfExample;

import java.util.Scanner;

public class Example3 {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		switch(i)
		{
		case 1:System.out.print("It's Monday");
		break;
		case 2:System.out.print("It's Tuesday");
		break;
		case 3:System.out.print("It's Wednesday");
		break;
		case 4:System.out.print("It's Thursday");
		break;
		case 5:System.out.print("It's Friday");
		break;
		case 6:System.out.print("It's Saturday");
		break;
		case 7:System.out.print("It's Sunday");
		break;
		
		}
	}

}
