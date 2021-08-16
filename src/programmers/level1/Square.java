package programmers.level1;

public class Square {

	public static long solution(long n) {
        long answer = 0;
        long squr=0;
        
        squr=(long)Math.sqrt(n);
        
        if(squr*squr==n) {
        	answer=(squr+1)*(squr+1);
        }else {
        	answer=-1;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		long n=5;
		
		System.out.println(Square.solution(n));
	}
	
}
