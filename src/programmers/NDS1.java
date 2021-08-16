package programmers;

public class NDS1 {

	public static int solution(String s) {
        int answer = 0;

        String[] ch=s.split("");
        
        for(int i=0;i<s.length();i++) {
        	if(ch[i].equals("z")) {
        		for(int j=i+1;j<s.length();j++) {
        			if(ch[j].equals("a")) {
        				if(s.substring(i+1, j).contains("a") || s.substring(i+1, j).contains("z")) {
        					break;
        				}else {
        					answer++;
        				}
        			}
        		}
        	}else if(ch[i].equals("a")) {
        		for(int j=i+1;j<s.length();j++) {
        			if(ch[j].equals("z")) {
        				if(s.substring(i+1, j).contains("a") || s.substring(i+1, j).contains("z")) {
        					break;
        				}else {
        					answer++;
        				}
        			}
        		}
        	}
        }

        return answer;
    }
	
	public static void main(String[] args) {
		String s="abcd";
		
		System.out.println(NDS1.solution(s));
		//System.out.println(s.substring(1, 2));
	}
	
}
