package baekjoon;

import java.util.Scanner;

public class Num11720 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		String[] str=sc.next().split("");
		int[] num=new int[N];
		int result=0;	
		
		for(int i=0;i<N;i++) {
			num[i]=Integer.parseInt(str[i]);
			result+=num[i];
		}
		
		System.out.println(result);
	}

}
