package baekjoon;

import java.io.*;
import java.util.*;

public class Num18870 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int[] num=new int[N];
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		String[] str=br.readLine().split(" ");
		
		for(int i=0;i<N;i++) {
			num[i]=Integer.parseInt(str[i]);
		}
		
		int[] sortNum=num.clone();
		Arrays.sort(sortNum);
		
		StringBuilder sb=new StringBuilder();
		int index=0;
		
		for(int i:sortNum) {
			if(!map.containsKey(i)) {
				map.put(i, index++);
			}
		}
		
		for(int i:num) {
			sb.append(map.get(i)+" ");
		}
		
		System.out.println(sb);
	}

}
