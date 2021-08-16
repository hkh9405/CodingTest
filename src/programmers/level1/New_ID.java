package programmers.level1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class New_ID {

	public static String solution(String new_id) {
		String answer="";
        
        List<Character> word=new ArrayList<Character>();
        
        //1단계
        for(int i=0;i<new_id.length();i++) {        	        	
        	if(new_id.charAt(i)>=65&&new_id.charAt(i)<=90) {
        		word.add((char) (new_id.charAt(i)+32));
        	}else {
        		word.add(new_id.charAt(i));
        	}
        }       
        
        //2단계
        for(int i=0;i<word.size();i++) {
        	if(!(word.get(i)==45||word.get(i)==46||word.get(i)==95
        			||(word.get(i)>=97&&word.get(i)<=122)||(word.get(i)>=48&&word.get(i)<=57))) {
        		word.remove(i);
        		i--;
        	}
        }
        
        //3단계
        for(int i=0;i<word.size()-1;i++) {
        	if(word.get(i)==46 && word.get(i)==word.get(i+1)) {
        		word.remove(i);
        		i--;
        	}
        }
        
        //4단계
        while(true) {
        	if(!word.isEmpty()) {
        		if(word.get(0)==46) {
        			word.remove(0);
        		}else if(word.get(word.size()-1)==46) {
        			word.remove(word.size()-1);
        		}else {
        			break;
        		}
        	}else {
        		break;
        	}
        }
        
        //5단계
        if(word.isEmpty()) {
        	for(int i=0;i<3;i++) {
        		word.add((char)97);
        	}
        }
        
        //6단계
        while(word.size()>15) {
        	word.remove(word.size()-1);
        }
        
        while(true) {
        	if(word.get(word.size()-1)==46) {
        		word.remove(word.size()-1);
        	}else {
        		break;
        	}
        }
        
        //7단계
        while(word.size()<3) {
        	word.add(word.get(word.size()-1));
        }
        
        Iterator<Character> it=word.iterator();
        while(it.hasNext()) {
        	answer+=it.next();
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String new_id="=.=";
		
		System.out.println(New_ID.solution(new_id));
	}
	
}
