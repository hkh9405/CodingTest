package programmers;

public class Gym_clothes {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int count=lost.length;
        
        for(int i=0;i<lost.length;i++) {       	
        	for(int j=0;j<reserve.length;j++) {
        		if(lost[i]==reserve[j]) {
        			lost[i]=-1;
        			reserve[j]=-1;
        			count--;
        			break;
        		}
        	}
        }
        
        for(int i=0;i<lost.length;i++) {       	
        	for(int j=0;j<reserve.length;j++) {
        		if((lost[i]-1)==reserve[j]) {
        			reserve[j]=-1;
        			count--;
        			break;
        		}else if((lost[i]+1)==reserve[j]) {
        			reserve[j]=-1;
        			count--;
        			break;
        		}
        	}
        }
        
        answer=n-count;
        
        return answer;
    }
	
	public static void main(String[] args) {
		Gym_clothes test=new Gym_clothes();
		
		int n=5;
		int[] a={1,2,3};
		int[] b={2,3,4};
		System.out.println(test.solution(n,a,b));
	}
}
