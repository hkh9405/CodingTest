package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class Phoneketmon {

	
	public static int solution(int[] nums) {
	        int answer = 0;
	        
	        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
	        int select=nums.length/2;
	        
	        for(int i=0;i<nums.length;i++) {
	        	map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
	        }
	        
	        if(map.size()>=select) {
	        	answer=select;
	        }else {
	        	answer=map.size();
	        }
	        
	        return answer;
	}
	
	
	public static void main(String[] args) {

	}

}
