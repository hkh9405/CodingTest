package programmers;

public class Absolutes {

	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        int[] real_Num=new int[absolutes.length];
        
        for(int i=0;i<absolutes.length;i++) {
        	if(signs[i]) {
        		real_Num[i]=absolutes[i];
        	}else {
        		real_Num[i]=absolutes[i]*-1;
        	}
        	
        	answer+=real_Num[i];
        }
        
        return answer;
    }
	
}
