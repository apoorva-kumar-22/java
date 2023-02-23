package stringProject;

public class Sol7 {
		public static void main(String args[]) {
			String s="bvrit college";
			String p="b.v.raju college";
			
			//sol 7
			String[] l=s.split("");
			int count=0;
			int index=0;
			String answer="";
			for(String i:l) {
				index++;
				
				if(i.equals("l")) {
					count++;
							//concat
					if(count==2) {
						answer= answer + i.toUpperCase();
						continue;
					}
					
				}
				//answer+=i;
				answer = answer.concat("alloo");
			}
			System.out.print(answer);
			
			
		}
}
