package programmers.level2;

import java.util.HashMap;

class SpyCloth {
    public int solution(String[][] clothes) {
       int answer = 0;
		HashMap<String,Integer> m=new HashMap<>();
		int count=1;
		
		for(int i=0;i<clothes.length;i++) {
			m.put(clothes[i][1], m.getOrDefault(clothes[i][1], 0)+1);
		}
		
		for(String key:m.keySet()) {
			count*=(m.get(key)+1);
		}
			
		answer=count-1;

		return answer;
    }
}
