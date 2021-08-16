package baekjoon;

import java.util.Scanner;

public class Num1712 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long A=sc.nextInt();
		long B=sc.nextInt();
		long C=sc.nextInt();
		
		long i;	
		
		if(B>=C) {
			System.out.println(-1);
		} else {
			i=A/(C-B);
			i++;
			
			System.out.println(i);
		}
		
	}
	
}
