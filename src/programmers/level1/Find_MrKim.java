package programmers.level1;

public class Find_MrKim {

	public String solution(String[] seoul) {        
        int n = 0;
        
        for(int i=0;i<seoul.length;i++) {
        	if(seoul[i].equals("Kim")) {
        		n=i;
        	}
        }      
        String answer = "김서방은 "+n+"에 있다";
        
        return answer;
    }
	
}
