package baekjoon;

import java.util.Scanner;

public class Num1193 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long X=sc.nextLong();
		
		int i=1;
		long result=0;
		while(true) {
			result+=i;
			i++;
			
			if(result>=X) {
				break;
			}
		}
		
		long num=result-X+1;
		
		if(i==2) {
			System.out.print(1+"/"+1);
		}else if(i%2!=0) {
			System.out.print((i-num)+"/"+num);
		}else if(i%2==0) {
			System.out.print(num+"/"+(i-num));
		}
		
	}
	
}
