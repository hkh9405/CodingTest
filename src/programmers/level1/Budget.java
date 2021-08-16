package programmers.level1;

import java.util.Arrays;

public class Budget {

	public static int solution(int[] d, int budget) {
		int answer=0;
		int count=0;
		
		Arrays.sort(d);
		
		int i=0;
		while(i<d.length) {		
			if(answer+d[i]<=budget) {
				answer+=d[i];
				i++;
				count++;
			}else {
				break;
			}
		}
		
        return count;
	}
	
	public static void main(String[] args) {
		int[] d= {2,2,3,3};
		int budget=10;
		
		System.out.println(solution(d, budget));
	}

}
