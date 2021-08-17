package baekjoon;

import java.util.Scanner;

public class Num7568 {

	private static int[] height;
	private static int[] weight;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		height=new int[N];
		weight=new int[N];
		
		for(int i=0;i<N;i++) {
			height[i]=sc.nextInt();
			weight[i]=sc.nextInt();
		}
		
		StringBuilder answer=new StringBuilder();
		
		for(int i=0;i<N;i++) {
			int order=i;
			
			if(i!=N-1) {
				answer.append(lanking(N,order,height[i],weight[i])+" ");
			}else {
				answer.append(lanking(N,order,height[i],weight[i]));
			}
		}
		
		System.out.println(answer);
	}
	
	public static int lanking(int N,int order,int h,int w) {
		int lank=1;
		
		for(int i=0;i<N;i++) {
			if(i!=order) {
				if(h<height[i] && w<weight[i]) {
					lank++;
				}
			}
		}
		
		return lank;
	}

}
