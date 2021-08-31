package baekjoon;

import java.util.Scanner;

public class Num15651 {
	
	private static int[] arr;
	private static int N, M;
	private static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		N = sc.nextInt();
		M = sc.nextInt();
 
		arr = new int[M];
        
		dfs(0);
		System.out.print(sb);
 
	}
 
	public static void dfs(int depth) {
		// ���̰� M�̶� �������� ����� return
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth + 1);
		}
	}
 
}
