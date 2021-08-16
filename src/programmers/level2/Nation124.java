package programmers.level2;

public class Nation124 {

	public static String solution(int n) {
        String answer = "";
        long result=0;
        int num=n;
        int remainder=0;
        int count=0;
        
        while(true) {
        	remainder=num%3;
        	num/=3;
        	
        	if(remainder==0) {
        		result+=4*Math.pow(10, count);
        		num--;
        	}else {
        		result+=remainder*Math.pow(10, count);
        	}
        	
        	if(num<3) {
        		result+=num*Math.pow(10, count+1);
        		break;
        	}
        	
        	count++;
        }
        
        answer=Long.toString(result);
        
        return answer;
    }
	
	public static void main(String[] args) {
		int n=100;
		
		System.out.println(Nation124.solution(n));
	}
	
}
