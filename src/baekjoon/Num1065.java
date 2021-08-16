package baekjoon;

import java.util.Scanner;

public class Num1065 {

	public static int hansu(int num) {
		String[] han=Integer.toString(num).split("");
		int [] cha=new int[han.length-1];
		int count=cha.length;
		
		for(int i=0;i<cha.length;i++) {
			cha[i]=Integer.parseInt(han[i+1])-Integer.parseInt(han[i]);
		}
		
		for(int i:cha) {
			if(i==cha[0]) {
				count--;
			}
		}
		
		if(count==0)
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=N;i++) {
			count+=hansu(i);
		}
		
		System.out.println(count);
	}

}
