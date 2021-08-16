package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Num10989 {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] num=new int[10001];
		
		int N=Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			num[Integer.parseInt(br.readLine())]++;
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=1;i<10001;i++) {
			while(num[i]>0) {
				sb.append(i).append("\n");
				num[i]--;
			}
		}
		
		System.out.println(sb.toString());
	}
	
}
