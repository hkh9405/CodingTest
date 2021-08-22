package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num1181 {

	private static List<String> list;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		list=new ArrayList<String>();
		
		for(int i=0;i<N;i++) {
			String s=sc.next();
			
			if(!list.contains(s)) {
				list.add(s);
			}
		}
		
		for(int i=0;i<list.size();i++) {
			String s="";
			
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).length()>list.get(j).length()) {
					s=list.get(i);
					list.set(i, list.get(j));
					list.set(j, s);
				}else if(list.get(i).length()==list.get(j).length()) {
					sort(0,i,j,list.get(i),list.get(j));
				}
			}
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static void sort(int n,int i,int j,String a,String b) {
		String s="";
		
		if(a.charAt(n)>b.charAt(n)) {
			s=list.get(i);
			list.set(i, list.get(j));
			list.set(j, s);
		}else if(a.charAt(n)==b.charAt(n)) {
			sort(n+1,i,j,a,b);
		}
	}

}
