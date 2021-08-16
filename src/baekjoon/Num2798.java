package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Num2798 {

	private static int[] card;
	private static List<Integer> list=new ArrayList<Integer>();
	
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		card=new int[N];
		
		for(int i=0;i<N;i++) {
			card[i]=sc.nextInt();
		}
		
		sum(N, M);
		
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list.get(0));
	}
	
	public static void sum(int N,int M) {
		for(int i=0;i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int k=j+1;k<N;k++) {
					if(card[i]+card[j]+card[k]<=M) {
						list.add(card[i]+card[j]+card[k]);
					}
				}
			}
		}
	}

}
