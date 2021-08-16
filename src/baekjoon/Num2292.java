package baekjoon;

import java.util.Scanner;

public class Num2292 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long N=sc.nextInt();
		
		int i=1,j=0;
		
		while(true) {
			i+=j*6;
			
			if(i>=N) {
				break;
			}
			
			j++;
		}
		
		j++;
		
		System.out.println(j);
		
	}
	
}
