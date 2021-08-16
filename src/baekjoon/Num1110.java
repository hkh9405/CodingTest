package baekjoon;

import java.util.Scanner;

public class Num1110 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;

		int N=sc.nextInt();

		int n=N;
		int a,b;
		while(true) {
			
			if(n<10) {
				a=0;
				b=n;
			} else {
				a=n/10;
				b=n-(a*10);
			}
			
			int c=a+b;
			
			if(c>=10) {
				c-=10;
			}
			
			n=b*10+c;
			
			count++;
			
			if(n==N)
				break;
			
		}
		
		System.out.println(count);

	}

}
