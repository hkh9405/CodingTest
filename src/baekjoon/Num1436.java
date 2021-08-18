package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num1436 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		List<Integer> series=new ArrayList<Integer>();
		
		int i=666;
		while(true) {
			if(series.size()>=10000) {
				break;
			}
			
			if(Integer.toString(i).contains("666")) {
				series.add(i);
			}
			
			i++;
		}
		
		System.out.println(series.get(N-1));
	}

}
