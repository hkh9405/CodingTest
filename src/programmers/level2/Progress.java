package programmers.level2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Progress {

	public static int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> date=new LinkedList<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<progresses.length;i++) {
			System.out.println(date.peek());
			
			if(i==progresses.length-1) {
				if(date.isEmpty()) {
					list.add(1);
				}else {
					if((100-progresses[i])%speeds[i]==0) {
						if(date.peek()>=(100-progresses[i])/speeds[i]) {
							date.offer((100-progresses[i])/speeds[i]);
							list.add(date.size());
						}else {
							list.add(date.size());
							date.clear();
							list.add(1);
						}
					}else {
						if(date.peek()>=(100-progresses[i])/speeds[i]+1) {
							date.offer((100-progresses[i])/speeds[i]+1);
							list.add(date.size());
						}else {
							list.add(date.size());
							date.clear();
							list.add(1);
						}
					}
				}
			}else {
				if(date.isEmpty()) {
					if((100-progresses[i])%speeds[i]==0) {
						date.offer((100-progresses[i])/speeds[i]);
					}else {
						date.offer((100-progresses[i])/speeds[i]+1);
					}
				}else {
					if((100-progresses[i])%speeds[i]==0) {
						if(date.peek()>=(100-progresses[i])/speeds[i]) {
							date.offer((100-progresses[i])/speeds[i]);
						}else {
							list.add(date.size());
							date.clear();
							date.offer((100-progresses[i])/speeds[i]);
						}
					}else {
						if(date.peek()>=(100-progresses[i])/speeds[i]+1) {
							date.offer((100-progresses[i])/speeds[i]+1);
						}else {
							list.add(date.size());
							date.clear();
							date.offer((100-progresses[i])/speeds[i]+1);
						}
					}
				}
			}
		}
		
		int[] answer = new int[list.size()];
		Iterator<Integer> it=list.iterator();
		
		int i=0;
		while(it.hasNext()) {
			answer[i]=it.next();
			i++;
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		int[] progresses= {95, 90, 99, 99, 80, 99};
		int[] speeds= {1, 1, 1, 1, 1, 1};
		
		System.out.println(Progress.solution(progresses, speeds));
	}
	
}
