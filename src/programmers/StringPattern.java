package programmers;

public class StringPattern {
	 
	public StringBuffer solution(int n) {
        StringBuffer answer = new StringBuffer();
	        
	    for(int i=1;i<=n;i++) {
	        if(i%2==0) {
	        	answer.append("��");
	        }else{
	        	answer.append("��");
	        }
        }
	        
	    return answer;
    }
	
}
