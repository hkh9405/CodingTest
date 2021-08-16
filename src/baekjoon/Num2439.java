package baekjoon;

import java.util.Scanner;

public class Num2439 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++) {	
			for(int j=1;j<=T;j++) {
				if(j<=T-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
