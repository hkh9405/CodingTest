package programmers;

import java.util.*;

public class Bridge {

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int weight_add=0;
		int count=0;
		
		Queue<Integer> q=new LinkedList<>();
		
		for(int i=0;i<truck_weights.length;i++) {
			q.offer(0);
		}
		
		int i=0;
		while(!q.isEmpty()) {			
			if(weight_add+truck_weights[i]<=weight) {
				count++;
				i++;
				q.poll();
			} else {
				answer+=count+1;
			}
		}
		
		answer++;

		return answer;
	}

	public int solution2(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;

		int weight_add;
		int num;

		for(int i=0;i<truck_weights.length;i++) {
			weight_add = 0;
			num=0;

			for(int j=i;j<truck_weights.length;j++) {
				if(weight_add+truck_weights[j]>weight) {
					i+=num-1;
					break;
				}

				weight_add+=truck_weights[j];
				num++;

				if(j==truck_weights.length-1) {
					i+=num-1;
				}
			}

			answer+=bridge_length+num-1;
		}

		answer++;

		return answer;
	}
}


class Solution1 {
    class Truck {
        int weight;
        int entry;
        
        Truck(int weight, int entry){
            this.weight = weight;
            this.entry = entry;
        }
    }
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> waiting = new LinkedList<>();
        Queue<Truck> bridge = new LinkedList<>();
        
        for(int i = 0 ; i < truck_weights.length ; ++i){
            waiting.offer(new Truck(truck_weights[i], 0));
        }
        
        int time = 0;
        int totalWeight = 0;
        while(!waiting.isEmpty() || !bridge.isEmpty()){   
        	time++;
        	if(!bridge.isEmpty()) {
        		Truck t = bridge.peek();
        		if(time - t.entry >= bridge_length) {
        			totalWeight -= t.weight;
        			bridge.poll();
        		}
        	}
        	
        	if(!waiting.isEmpty()) {
        		if(totalWeight + waiting.peek().weight <= weight) {
        			Truck t = waiting.poll();
        			totalWeight += t.weight;
        			
        			bridge.offer(new Truck(t.weight, time));
        		}
        	}
        }
        return time;
    }
}
