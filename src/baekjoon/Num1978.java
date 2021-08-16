package baekjoon;

import java.util.Scanner;

public class Num1978 {
	
	public static boolean isPrime(int num){
		if(num<2) return false;

		for(int i=2; i<=num/2; i++){
			if(num % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int count=0,num;
		
		for(int i=0;i<N;i++) {
			num=sc.nextInt();
			
			if(Num1978.isPrime(num)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
