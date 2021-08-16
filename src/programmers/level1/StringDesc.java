package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StringDesc {

	public String solution(String s) {
        String answer = "";
        
        List<Character> list=new ArrayList<Character>();
        
        for(int i=0;i<s.length();i++) {
        	list.add(s.charAt(i));
        }
        
        Collections.sort(list, Comparator.reverseOrder());
        
        Iterator<Character> it=list.iterator();
        
        while(it.hasNext()) {
        	answer+=it.next().toString();
        }
        
        return answer;
    }
	
}
