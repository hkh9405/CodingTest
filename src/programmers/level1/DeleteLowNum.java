package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteLowNum {

	public static int[] solution(int[] arr) {				
		int[] answer;
		
		int[] arr2=new int[arr.length];
		
		int n=0;
		for(int num:arr) {
			arr2[n]=num;
			n++;
		}
		Arrays.sort(arr2);
		
		if(arr.length<=1) {
			answer=new int[1];
			answer[0]=-1;
		}else {
			answer=new int[arr.length-1];
			List<Integer> list=new ArrayList<Integer>();
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=arr2[0]) {
					list.add(arr[i]);
					
				}
			}
			
			for(int i=0;i<list.size();i++) {
				answer[i]=list.get(i);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr= {4,3,2,1};
		System.out.println(DeleteLowNum.solution(arr));
	}
	
}
