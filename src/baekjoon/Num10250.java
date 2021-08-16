package baekjoon;

import java.util.Scanner;

public class Num10250 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		int H,W,N;
		int count,result;
		
		for(int i=0;i<T;i++) {
			H=sc.nextInt();
			W=sc.nextInt();
			N=sc.nextInt();
			
			count=0;
			result=0;
			
			for(int w=1;w<=W;w++) {
				for(int h=1;h<=H;h++) {
					count++;
					
					if(count==N) {
						result=(h*100)+w;
						break;
					}
				}
				
				if(count==N) {
					break;
				}
			}
			
			System.out.println(result);
		}
	}

}
