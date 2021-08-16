package programmers.level1;

public class CaesarCipher {

	public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
        		if(s.charAt(i)+n>='a'&&s.charAt(i)+n<='z') {
        			answer+=(char)(s.charAt(i)+n);
        		}else {
        			answer+=(char)(s.charAt(i)+n-26);
        		}
        	}else if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
        		if(s.charAt(i)+n>='A'&&s.charAt(i)+n<='Z') {
        			answer+=(char)(s.charAt(i)+n);
        		}else {
        			answer+=(char)(s.charAt(i)+n-26);
        		}
        	}else {
        		answer+=" ";
        	}
        }
        
        return answer;
    }
	
}
