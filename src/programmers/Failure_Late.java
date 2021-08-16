package programmers;

import java.util.HashMap;
import java.util.Map;

public class Failure_Late {

	public static int[] solution(int N, int[] stages) {
		int[] answer=new int[N];
		double[] fl=new double[N];
		
		double person=stages.length;

		double ratio;
		int num;
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=1;i<=N+1;i++) {
			map.put(i, 0);
		}
		
		for(int i=0;i<stages.length;i++) {
			map.put(stages[i], map.getOrDefault(stages[i], 0)+1);
		}
		
		for(int i=0;i<N;i++) {
			answer[i]=i+1;
			fl[i]=map.get(i+1)/person;
			person-=map.get(i+1);
			
			for(int j=i;j>0;j--) {
				if(fl[j]>fl[j-1]) {
					ratio=fl[j];
					fl[j]=fl[j-1];
					fl[j-1]=ratio;
					
					num=answer[j];
					answer[j]=answer[j-1];
					answer[j-1]=num;
				}else if(fl[j]==fl[j-1]) {
					if(answer[j]<answer[j-1]) {
						ratio=fl[j];
						fl[j]=fl[j-1];
						fl[j-1]=ratio;
						
						num=answer[j];
						answer[j]=answer[j-1];
						answer[j-1]=num;
					}
				}
			}			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int N=5;
		int[] stages= {2, 1, 2, 6, 2, 4, 3, 3};
		
		int[] answer=solution(N, stages);
		
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]+" ");
		}
	}

}
