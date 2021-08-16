package baekjoon;

import java.util.Scanner;

public class Num2588 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		Integer A=sc.nextInt();
		String B=sc.next();

		int b1=Integer.parseInt(Character.toString(B.charAt(2)));
		int b2=Integer.parseInt(Character.toString(B.charAt(1)));
		int b3=Integer.parseInt(Character.toString(B.charAt(0)));
		
		System.out.println(A*b1);
		System.out.println(A*b2);
		System.out.println(A*b3);
		System.out.println(A*b3*100+A*b2*10+A*b1);
		
	}

}
