package baekjoon;

import java.util.Scanner;

public class Num2231 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int answer = 0;
		
		for(int i=1;i<N;i++) {
			int M=i;
			String[] num=Integer.toString(i).split("");
			
			for(int j=0;j<num.length;j++) {
				M+=Integer.parseInt(num[j]);
			}
			
			if(M==N) {
				answer=i;
				break;
			}
		}
		
		System.out.println(answer);
	}

}
