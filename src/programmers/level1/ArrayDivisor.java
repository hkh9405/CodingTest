package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//나누어 떨어지는 숫자 배열
public class ArrayDivisor {

	public static int[] solution(int[] arr, int divisor) {
		List<Integer> list=new ArrayList<Integer>();
		
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]%divisor==0) {
        		list.add(arr[i]);
        	}
        }
        int[] answer;
        
        if(list.size()==0) {
        	answer = new int[1];
        	answer[0]=-1;
        	return answer;
        }else {
        	answer = new int[list.size()];
        	
        	Iterator<Integer> it=list.iterator();
            int i=0;
            
            while(it.hasNext()) {
            	answer[i]=it.next();
            	i++;
            }
            
            Arrays.sort(answer);
            
            return answer;
        }
    }
	
	public static void main(String[] args) {
		int[] arr= {5,9,7,10};
		int divisor=5;
		
		int[] answer=ArrayDivisor.solution(arr, divisor);
		
		for(int i:answer) {
			System.out.println(i);
		}
	}

}
