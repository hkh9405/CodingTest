package baekjoon;

import java.util.Scanner;

public class Num15650 {
 
	private static int[] arr;
	private static boolean[] visit;
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		int M = sc.nextInt();
 
		arr = new int[M];
		visit=new boolean[N];
		
		dfs(N,M,0);
	}
	
	public static void dfs(int N,int M,int depth) {
		if(M==depth) {
			for(int i:arr) {
				System.out.print(i+" ");
			}
			
			System.out.println();
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visit[i]) {
				visit[i]=true;
				arr[depth]=i+1;
				dfs(N,M,depth+1);
			}
		}
	}
 
	
}
