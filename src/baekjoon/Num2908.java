package baekjoon;

import java.util.Scanner;

public class Num2908 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String[] a=sc.next().split("");
		String[] b=sc.next().split("");
		
		int A=Integer.parseInt(a[2]+a[1]+a[0]);
		int B=Integer.parseInt(b[2]+b[1]+b[0]);
		
		if(A>B) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
	}

}
