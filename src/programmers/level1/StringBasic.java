package programmers.level1;

public class StringBasic {

	public boolean solution(String s) {
		boolean answer = true;
		
		if(s.length()==4 || s.length()==6) {
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)>=48 && s.charAt(i)<=57) {
					answer=true;
				}else {
					answer=false;
					break;
				}
			}
		}else {
			answer=false;
		}
		
		return answer;
	}
	
}
