package programmers.level1;

public class Hashard {

	public boolean solution(int x) {
        boolean answer = true;
        String num=Integer.toString(x);
        int cipher=0;
        
        for(int i=0;i<num.length();i++) {
        	cipher+=Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        
        if(x%cipher==0) {
        	answer=true;
        }else {
        	answer=false;
        }
        
        return answer;
    }
	
}
