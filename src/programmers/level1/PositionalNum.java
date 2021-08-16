package programmers.level1;

import java.util.*;

public class PositionalNum {

	public int solution(int n) {
        int answer = 0;

        String str=Integer.toString(n);
        String[] PN=str.split("");
        
        int num=0;
        
        for(int i=0;i<PN.length;i++) {
        	num=Integer.parseInt(PN[i]);
        	
        	answer+=num;
        }

        return answer;
    }
	
}
