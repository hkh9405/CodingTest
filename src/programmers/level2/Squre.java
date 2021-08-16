package programmers.level2;

public class Squre {

	public long solution(long w, long h) {
        long answer =w*h;
        long rec=0;
        
        long mcd=Squre.maxCommonDivisor(w, h);
        
        if(mcd==1) {
        	rec=w+h-1;
        }else {
        	rec=((w/mcd)+(h/mcd)-1)*mcd;
        }
        
        answer-=rec;
        
        return answer;
    }
	
	public static long maxCommonDivisor(long n,long m) {
		long result=0;
		
		if(n<m) {
			for(long i=n;i>=1;i--) {
				if(n%i==0 && m%i==0) {
					result=i;
					break;
				}
			}
		}else {
			for(long i=m;i>=1;i--) {
				if(n%i==0 && m%i==0) {
					result=i;
					break;
				}
			}
		}
		
		return result;
	}
	
}
