package programmers.level2;

import java.util.Stack;

public class StringDelete {	
	public int solution(String s) {
		int answer=0;

		Stack<Character> str=new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			if(str.empty()) {
				str.push(s.charAt(i));
			}else {
				if(str.peek()==s.charAt(i)) {
					str.pop();
				}else {
					str.push(s.charAt(i));
				}
			}
		}
		
		if(str.empty()) {
			answer=1;
		}
		
		return answer;
	}
	
}
