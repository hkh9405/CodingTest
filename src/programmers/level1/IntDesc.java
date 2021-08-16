package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class IntDesc {

	public long solution(long n) {
        long answer = 0;
        String str=Long.toString(n);
        String[] num=str.split("");
        
        Arrays.sort(num,Collections.reverseOrder());
        
        str="";
        for(String s:num) {
        	str+=s;
        }
        
        answer=Long.parseLong(str);
        
        return answer;
    }
	
	public static void main(String[] args) {

	}

}
