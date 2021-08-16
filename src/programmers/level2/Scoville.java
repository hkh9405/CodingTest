package programmers.level2;

import java.util.PriorityQueue;

public class Scoville {

	public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int i:scoville) {
        	pq.add(i);
        }
        
        int sumOfScoville=0;
        while(true) {
        	if(pq.peek()>=K) {
        		return answer;
        	}
        	
        	if(pq.size()==1) {
        		return -1;
        	}
        	
        	sumOfScoville=pq.poll()+(pq.poll()*2);
        	pq.add(sumOfScoville);
        	answer++;
        }
    }
	
	public static void main(String[] args) {
		int[] scoville= {1,2,3};
		int K=11;
		
		System.out.println(Scoville.solution(scoville, K));
	}
	
}
