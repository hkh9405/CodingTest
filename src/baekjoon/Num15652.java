package baekjoon;

import java.util.Scanner;

public class Num15652 {

	private static int[] arr;
	private static int N,M;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		N=sc.nextInt();
		M=sc.nextInt();
		arr=new int[M];

		dfs(0);
	}

	public static void dfs(int depth) {
		if(M==depth) {
			for(int i=0;i<M;i++) {
				System.out.print(arr[i]+" ");
			}

			System.out.println();
			return;
		}

		for(int i=0;i<N;i++) {
			arr[depth]=i+1;

			if(depth==0) {
				dfs(depth+1);
			}
			
			if(depth>0 && arr[depth]>=arr[depth-1]) {
				dfs(depth+1);
			}
		}
	}

}
