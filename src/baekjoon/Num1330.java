package baekjoon;

import java.util.Scanner;

public class Num1330 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		String result = null;
		
		if(A>B)
			result=">";
		else if(A<B)
			result="<";
		else if(A==B)
			result="==";
		
		System.out.print(result);
		
	}

}
