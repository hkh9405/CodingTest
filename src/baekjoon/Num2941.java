package baekjoon;

import java.util.Scanner;

public class Num2941 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		int count=0;
		
		while(str.contains("c=")) {
			str=str.replace("c=", ",");
		}
		
		while(str.contains("c-")) {
			str=str.replace("c-", ",");
		}
		
		while(str.contains("dz=")) {
			str=str.replace("dz=", ",");
		} 
		
		while(str.contains("d-")) {
			str=str.replace("d-", ",");
		} 
		
		while(str.contains("lj")) {
			str=str.replace("lj", ",");
		} 
		
		while(str.contains("nj")) {
			str=str.replace("nj", ",");
		}
		
		while(str.contains("s=")) {
			str=str.replace("s=", ",");
		}
		
		while(str.contains("z=")) {
			str=str.replace("z=", ",");
		}
		
		count+=str.split("").length;
		
		System.out.println(count);
	}

}
