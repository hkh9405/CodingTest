package programmers.level1;

public class CMCD {

	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0]=CMCD.maxCommonDivisor(n, m);
        answer[1]=CMCD.minCommonMultiple(n, m);
        
        return answer;
    }
	
	public static int maxCommonDivisor(int n,int m) {
		int result=0;
		
		if(n<m) {
			for(int i=n;i>=1;i--) {
				if(n%i==0 && m%i==0) {
					result=i;
					break;
				}
			}
		}else {
			for(int i=m;i>=1;i--) {
				if(n%i==0 && m%i==0) {
					result=i;
					break;
				}
			}
		}
		
		return result;
	}
	
	public static int minCommonMultiple(int n,int m) {
		int result=0;
		
		int min=CMCD.maxCommonDivisor(n, m);
		
		if(n<m) {
			if(m%n==0) {
				result=m;
			}else {
				result=n*m/min;
			}
		}else {
			if(n%m==0) {
				result=n;
			}else {
				result=n*m/min;
			}
		}
		
		return result;
	}
	
}
