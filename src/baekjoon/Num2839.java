package baekjoon;

import java.util.Scanner;

public class Num2839 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();

		int answer=Num2839.result(N);

		System.out.println(answer);
	}

	public static int result(int N) {
		if(N%5==0) {
			return N/5;
		}else {
			int a=N/5,j;

			for(int i=a;i>=0;i--) {
				j=1;
				
				while(true) {				
					if((5*i)+(3*j)==N) {
						return i+j;
					}
					
					if((5*i)+(3*j)>N) {
						break;
					}
					
					j++;	
				}
			}	
			
			return -1;
		}
	}

}
