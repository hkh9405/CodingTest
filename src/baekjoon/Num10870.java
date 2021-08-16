package baekjoon;

import java.util.Scanner;

public class Num10870 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int[] F=new int[n+1];

		for(int i=0;i<=n;i++) {
			if(i==0) F[0]=0;
			else if(i==1) F[1]=1;
			else F[i]=F[i-2]+F[i-1];
		}


		System.out.println(F[n]);
	}

}
