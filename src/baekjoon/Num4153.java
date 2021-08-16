package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Num4153 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] length=new int[3];
		
		while(true) {
			length[0]=sc.nextInt();
			length[1]=sc.nextInt();
			length[2]=sc.nextInt();
			
			Arrays.sort(length);
			
			if(length[0]==0 && length[1]==0 && length[2]==0) break;
			
			if(Math.pow(length[0], 2)+Math.pow(length[1], 2)==Math.pow(length[2], 2)) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		} 
	}

}
