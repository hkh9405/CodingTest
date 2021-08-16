package programmers;

import java.util.Arrays;

public class KNum {

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		int[] num;
		int k;

		for(int i=0;i<commands.length;i++) {
			num=new int[commands[i][1]-commands[i][0]+1];
			k=commands[i][0]-1;
			
			for(int j=0;j<num.length;j++) {						
				num[j]=array[k];
				k++;
			}
			
			Arrays.sort(num);
			
			answer[i]=num[commands[i][2]-1];
		}

		return answer;
	}

	public static void main(String[] args) {
		KNum k=new KNum();
		
		int[] array= {1, 5, 2, 6, 3, 7, 4};
		int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		k.solution(array, commands);
	}
}
