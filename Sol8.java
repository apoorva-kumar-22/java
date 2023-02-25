package stringProject;

public class Sol8 {
	
	public static void main(String args[]) {
		String p="b.v.raju college";
		String sub="raju";
		String answer="";
		int i = 0;
		if(p.contains(sub)) {
		 i=p.indexOf(sub);
		}
		String[] arr=p.split("");
		int index=0;
		int l=0;
		
		
		for(String k:arr) {
			String f="";
			if(l<4) {
			f=String.valueOf(sub.charAt(l));
			}
			
			if(index==i && l<4 && k.equals(f)) {
				i++;
				l++;
				answer=answer.concat(k.toUpperCase());
			}else {
				answer=answer.concat(k);
			}
			index++;
		}
		System.out.print(answer);
		
	}
	
}
