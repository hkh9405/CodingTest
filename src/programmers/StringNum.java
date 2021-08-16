package programmers;

public class StringNum {
	
	public boolean solution(String s) {
		boolean answer=true;
		
		int pcount=0;
		int ycount=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==80 || s.charAt(i)==112) {
				pcount++;
			}else if(s.charAt(i)==89 || s.charAt(i)==121) {
				ycount++;
			}
		}
		
		if(pcount==ycount || (pcount==0 && ycount==0)) {
			answer=true;
		}else {
			answer=false;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {

	}

}
