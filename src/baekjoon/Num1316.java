package baekjoon;

import java.util.Scanner;

public class Num1316 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		String word;
		int count=N;

		for(int i=0;i<N;i++) {
			word=sc.next();
			boolean[] checker=new boolean[26];

			for(int j=0;j<word.length()-1;j++) {
				if(word.charAt(j)!=word.charAt(j+1)) {
					if(checker[word.charAt(j+1)-97]==true) {
						count--;
						break;
					}
					
					checker[word.charAt(j)-97]=true;
				}
			}
		}

		System.out.println(count);
	}

}
