package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Num18870 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int[] num=new int[N];
		List<Integer> list=new ArrayList<Integer>();
		
		String[] str=br.readLine().split(" ");
		
		for(int i=0;i<N;i++) {
			num[i]=Integer.parseInt(str[i]);
			
			if(!list.contains(num[i])) {
				list.add(num[i]);
			}
		}
		Collections.sort(list);
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<N;i++) {
			sb.append(list.indexOf(num[i])+" ");
		}
		
		System.out.println(sb);
	}

}
