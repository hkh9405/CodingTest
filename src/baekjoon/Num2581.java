package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Num2581 {

	public static int isPrime(int num){
		if(num<2) {
			return 0;
		}
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) return 0;
		}
		
		return num;	

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int result=0;
		List<Integer> min=new ArrayList<>();
		
		for(int i=num1;i<=num2;i++) {
			if(Num2581.isPrime(i)!=0) {
				min.add(i);
			}
			result+=Num2581.isPrime(i);
		}
		
		Collections.sort(min);
		
		if(min.isEmpty()) {
			System.out.println(-1);
		}else {
			System.out.println(result);
			System.out.println(min.get(0));
		}
		
	}

}
