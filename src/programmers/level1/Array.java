package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public int[] solution(int[] arr) {    
        List<Integer> list=new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++) {
        	if(i==0) {
        		list.add(arr[i]);
        	}else if(i>0 && (arr[i]!=arr[i-1] && arr[i]!=arr[i-1])) {
        		list.add(arr[i]);
        	}
        }
        
        int[] answer=new int[list.size()];
        
        for(int i=0;i<list.size();i++) {
        	answer[i]=list.get(i);
        }

        return answer;
    }
	
	public static void main(String[] args) {
		
	}

}
