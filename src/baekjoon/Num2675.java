package baekjoon;

import java.util.Scanner;

public class Num2675 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int T=sc.nextInt();

		for(int t=0;t<T;t++) {
			int R=sc.nextInt();

			String[] str=sc.next().split("");

			for(int i=0;i<str.length;i++) {
				for(int j=0;j<R;j++) {
					System.out.print(str[i]);
				}
			}
			
			System.out.println();
		}
	}

}
