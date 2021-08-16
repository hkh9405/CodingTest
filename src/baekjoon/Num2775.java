package baekjoon;

import java.util.Scanner;

public class Num2775 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int T=sc.nextInt();

		int[][] result;
		for(int i=0;i<T;i++) {
			int k=sc.nextInt();
			int n=sc.nextInt();
			result=new int[k+1][n];

			for(int a=0;a<=k;a++) {
				for(int b=0;b<n;b++) {
					if(a==0) {
						result[a][b]=b+1;
					} else if(a>0) {
						for(int c=0;c<=b;c++) {
							result[a][b]+=result[a-1][c];
						}
					}
				}
			}

			System.out.println(result[k][n-1]);
		}
	}

}
