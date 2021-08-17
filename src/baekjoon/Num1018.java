package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Num1018 {

	private static char[][] chess;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int h=sc.nextInt();
		int l=sc.nextInt();
		
		chess=new char[h][l];
		String[] str=new String[h];
		
		for(int i=0;i<h;i++) {
			str[i]=sc.next();
			
			for(int j=0;j<l;j++) {
				chess[i][j]=str[i].charAt(j);
			}
		}
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<=h-8;i++) {
			for(int j=0;j<=l-8;j++) {
				list.add(change(i,j));
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
	}

	public static int change(int h_start,int l_start) {
		int result=0;
		
		for(int i=h_start;i<h_start+8;i++) {
			for(int j=l_start;j<l_start+8;j++) {
				if(((i-h_start)+(j-l_start))%2==0) {
					if(chess[i][j]!=chess[h_start][l_start]) {
						result++;
					}
				}else if(((i-h_start)+(j-l_start))%2==1) {
					if(chess[i][j]==chess[h_start][l_start]) {
						result++;
					}
				}
			}
		}
		
		if(64-result<result) {
			result=64-result;
		}
		
		return result;
	}
}
