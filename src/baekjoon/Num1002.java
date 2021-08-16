package baekjoon;

import java.util.Scanner;

public class Num1002 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int T=sc.nextInt();
		
		int i=1;
		while(i<=T) {	
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int r1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			int r2=sc.nextInt();
			
			if(x1==x2 && y1==y2 && r1==r2) {
				System.out.println(-1);
			} else if (Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)>Math.pow(r1+r2, 2)) {
				System.out.println(0);
			} else if (Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)<Math.pow(r1-r2, 2)) {
				System.out.println(0);
			} else if (Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)==Math.pow(r1+r2, 2)) {
				System.out.println(1);
			} else if (Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)==Math.pow(r1-r2, 2)) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
			
			i++;
		}
	}
}