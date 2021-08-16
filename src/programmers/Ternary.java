package programmers;

import java.util.ArrayList;
import java.util.List;

public class Ternary {
	public static int solution(int n) {
        int answer = 0;
        
        List<Integer> lists=new ArrayList<Integer>();
               
        while(true) {
        	if(n/3==0) {
        		lists.add(n);
        		break;
        	}else {
        		lists.add(n%3);
        		n/=3;
        	}
        }
        
        int[] num=new int[lists.size()];
        
        for(int i=0;i<lists.size();i++) {
        	num[i]=lists.get(lists.size()-(i+1));
        	answer+=num[i]*Math.pow(3, i);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(45));
	}
}
