package baekjoon;

import java.util.Scanner;

public class Num15649 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		StringBuilder sb;
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				sb=new StringBuilder();
				
				if(i!=j) {
					sb.append(i+" "+j);
				}
				
				System.out.println(sb);
			}
		}
	}

}
