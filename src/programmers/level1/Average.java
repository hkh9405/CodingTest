package programmers.level1;

public class Average {

	public double solution(int[] arr) {
        double answer = 0;
        
        for(int i:arr) {
        	answer+=i;
        }
        
        answer/=arr.length;
        
        return answer;
    }
	
}
