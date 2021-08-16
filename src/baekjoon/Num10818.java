package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Num10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> list=new ArrayList<>();
		
		int N=Integer.parseInt(br.readLine());
		
		String[] str=br.readLine().split(" ");
		
		for(int i=0;i<N;i++) {
			list.add(Integer.parseInt(str[i]));
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0)+" "+list.get(N-1));
		
		bw.close();
		br.close();
	}
	
}
