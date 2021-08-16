package baekjoon;

import java.util.Scanner;

public class Num11653 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int i=2,result=N;
		while(i<=N) {
			if(result==1) {
				break;
			}
			
			if(result%i==0) {
				result/=i;
				System.out.println(i);
			} else {
				i++;
			}
		}
	}

}
