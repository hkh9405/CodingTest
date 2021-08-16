package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Num2108 {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int[] num=new int[N];
		double avg=0;
		int mode=0;
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<N;i++) {
			num[i]=Integer.parseInt(br.readLine());
			map.put(num[i], map.getOrDefault(num[i], 0)+1);
			avg+=num[i];
		}
		
		Arrays.sort(num);
		
		//산술평균 출력
		System.out.println(Math.round(avg/N));
		
		//중앙값 출력
		System.out.println(num[N/2]);
		
		//최빈값 출력
		Iterator<Integer> it=map.keySet().iterator();
		
		while(it.hasNext()) {
			int key=it.next();
			
			if(map.get(key)>mode) {
				mode=map.get(key);
				list.clear();
				list.add(key);
			}else if(map.get(key)==mode) {
				list.add(key);
			}
		}
		
		Collections.sort(list);
		
		if(list.size()>1) {
			System.out.println(list.get(1));
		}else {
			System.out.println(list.get(0));
		}
		
		//범위 출력
		System.out.println(num[N-1]-num[0]);
	}

}