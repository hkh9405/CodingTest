package programmers;

//두 정수 사이의 합
public class Two_Integer {

	public long solution(int a, int b) {
        long answer = 0;
        
        if(a>b) {
        	for(int i=b;i>=a;i--) {
            	answer+=i;
            }
        }else if(a<b) {
        	for(int i=a;i<=b;i++) {
            	answer+=i;
            }
        }else {
        	answer+=a;
        }
        
        return answer;
    }
	
}
