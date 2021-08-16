package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Num1427 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String[] str=sc.next().split("");
		Integer[] num=new Integer[str.length];
		
		for(int i=0;i<str.length;i++) {
			num[i]=Integer.parseInt(str[i]);
		}
		
		Arrays.sort(num,Collections.reverseOrder());
		
		StringBuilder answer=new StringBuilder();
		
		for(int s:num) {
			answer.append(s);
		}
		
		System.out.println(answer.toString());
	}
	
}
