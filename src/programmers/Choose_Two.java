package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Choose_Two {

	public int[] solution(int[] numbers) {
		Set<Integer> result=new HashSet<>();
        
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                result.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer =new int[result.size()];
        
        Iterator<Integer> it=result.iterator();
        
        int i=0;
        while(it.hasNext()) {
        	answer[i]=it.next();
        	i++;
        }
        
        Arrays.sort(answer);
        
        return answer;	
	}

}
