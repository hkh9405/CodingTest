package programmers.level1;

public class Lotto {

	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];

		int z_count=0;
		int count=0;

		for(int i=0;i<lottos.length;i++) {
			for(int j=0;j<win_nums.length;j++) {
				if(lottos[i]==0) {
					z_count++;
					break;
				}else if(lottos[i]==win_nums[j]) {
					count++;
					break;
				}
			}
		}


		if(count+z_count==6) {
			answer[0]=1;
		}else if(count+z_count==5) {
			answer[0]=2;
		}else if(count+z_count==4) {
			answer[0]=3;
		}else if(count+z_count==3) {
			answer[0]=4;
		}else if(count+z_count==2) {
			answer[0]=5;
		}else {
			answer[0]=6;
		}
		
		if(count==6) {
			answer[1]=1;
		}else if(count==5) {
			answer[1]=2;
		}else if(count==4) {
			answer[1]=3;
		}else if(count==3) {
			answer[1]=4;
		}else if(count==2) {
			answer[1]=5;
		}else {
			answer[1]=6;
		}

		return answer;
	}

}
