package programmers.level1;

public class Find_MrKim {

	public String solution(String[] seoul) {        
        int n = 0;
        
        for(int i=0;i<seoul.length;i++) {
        	if(seoul[i].equals("Kim")) {
        		n=i;
        	}
        }      
        String answer = "�輭���� "+n+"�� �ִ�";
        
        return answer;
    }
	
}
