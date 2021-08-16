package baekjoon;

import java.util.HashMap;
import java.util.Map;

public class Num4673 {

	public static int d(int n) {
		int result=n;
		
		String str=Integer.toString(n);
		String[] num=str.split("");

		for(int i=0;i<num.length;i++) {
			result+=Integer.parseInt(num[i]);
		}
		
		return result;
	}
	
	public static void main(String[] args) {	
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=1;i<=10000;i++) {
			map.put(i, map.getOrDefault(i, 0));
			map.put(d(i), map.getOrDefault(d(i), 0)+1);
		}
		
		for(int i=1;i<=10000;i++) {
			if(map.get(i)==0) {
				System.out.println(i);
			}
		}
		
	}

}
