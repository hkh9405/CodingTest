package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Num9020 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		List<Integer> list;
		Map<Integer,String> sum;
		
		for(int i=0;i<T;i++) {
			list=new ArrayList<>();
			sum=new HashMap<Integer,String>();
			int n=sc.nextInt();
			
			String result;
			
			boolean[] check = new boolean[n+1];

			check[0]=check[1]=true;
			for(int j=2;j<=n;j++){
				if(check[j]==false){
					for(int k=j+j;k<=n;k+=j)
						check[k]=true;
				}
			}
			
			for(int j=n-1;j>=2;j--) {
				if(check[j]==false&&check[n-j]==false) {
					result=j+" "+(n-j);
					
					list.add(Math.abs(j-(n-j)));
					sum.put(Math.abs(j-(n-j)),result);
				}
			}
			
			Collections.sort(list);
			System.out.println(sum.get(list.get(0)));
		}
	}

}
