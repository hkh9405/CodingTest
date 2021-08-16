package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public int[] solution(int[] answers) {
		int N=answers.length;

		List<Integer> list=new ArrayList<Integer>();

		int result = 0;
		int[] count=new int[3];

		for(int i=0;i<N;i++) {
			result=(i+1)%5;
			
			if(result==0) {
				result=5;
			}

			if(result==answers[i]) {
				count[0]++;
			}
		}
		//System.out.println(count[0]++);
		list.add(1);

		for(int i=0;i<N;i++) {
			if(i%2==0) {
				result=2;
			}else {
				if((i+1)%8==2) {
					result=1;
				}else if((i+1)%8==4) {
					result=3;
				}else if((i+1)%8==6) {
					result=4;
				}else if((i+1)%8==0) {
					result=5;
				}
			}

			if(result==answers[i]) {
				count[1]++;
			}
		}
		//System.out.println(count[1]++);
		if(count[1]>count[0]) {
			list.clear();
			list.add(2);
		}else if(count[1]==count[0]) {
			list.add(2);
		}

		for(int i=0;i<N;i++) {
			if((i/2)%5==0) {
				result=3;
			}else if((i/2)%5==1) {
				result=1;
			}else if((i/2)%5==2) {
				result=2;
			}else if((i/2)%5==3) {
				result=4;
			}else if((i/2)%5==4) {
				result=5;
			}

			if(result==answers[i]) {
				count[2]++;
			}
			//System.out.println("answer: "+answers[i]);
			//System.out.println("result: "+result);
		}
		//System.out.println(count[2]++);

		if(count[2]>count[1] && count[2]>count[0]) {
			list.clear();
			list.add(3);
		}else if(count[2]==count[0] && count[2]>count[1]) {
			list.add(3);
		}else if(count[2]==count[1] && count[2]>count[0]) {
			list.add(3);
		}else if(count[2]==count[0] && count[2]==count[1]) {
			list.add(3);
		}
		
		int[] answer = new int[list.size()];
		
		for(int i=0;i<answer.length;i++) {
			answer[i]=list.get(i);
		}
		
		Arrays.sort(answer);

		return answer;
	}
	
	public static void main(String[] args) {
		Test test=new Test();
		
		int[] answers= {2, 1, 2, 3, 2, 4, 2, 5, 5, 3, 3, 1, 1, 1, 2, 2, 5, 3, 4, 4};
		
		int[] answer=test.solution(answers);
		
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}

}
