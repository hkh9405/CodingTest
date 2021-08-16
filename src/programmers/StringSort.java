package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringSort {
	public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        List<String> list=new ArrayList<String>();
        
        for(int i=0;i<strings.length;i++) {
        	list.add(strings[i].charAt(n)+strings[i]);
        }
        
        Collections.sort(list);
        
        Iterator<String> it=list.iterator();
        
        int i=0;
        while(it.hasNext()) {
        	String str=it.next();
        	answer[i]=str.substring(1);
        	i++;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] strings= {"sun", "bed", "car"};
		int n=1;
		
		String[] answer=StringSort.solution(strings, n);
		
		for(String i:answer) {
			System.out.println(i);
		}
	}
}
