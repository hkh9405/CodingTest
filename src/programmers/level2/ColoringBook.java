package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class ColoringBook {

	public int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;

		Map<Integer, Integer> size=new HashMap<Integer, Integer>();
		Map<Integer, Integer> num=new HashMap<Integer, Integer>();
		int i=0,j=0,count=0;

		

		int[] answer = new int[2];
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}

}
