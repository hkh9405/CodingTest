package baekjoon;

import java.util.Scanner;

public class Num5622 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		char ch;
		int num,result=str.length();
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			
			if(ch==0) {
				num=1;
			}else if(ch>=65 && ch<=67) {
				num=2;
			}else if(ch>=68 && ch<=70) {
				num=3;
			}else if(ch>=71 && ch<=73) {
				num=4;
			}else if(ch>=74 && ch<=76) {
				num=5;
			}else if(ch>=77 && ch<=79) {
				num=6;
			}else if(ch>=80 && ch<=83) {
				num=7;
			}else if(ch>=84 && ch<=86) {
				num=8;
			}else if(ch>=87 && ch<=90) {
				num=9;
			}else {
				num=0;
			}
			
			result+=num;
		}
		
		System.out.println(result);
	}

}
