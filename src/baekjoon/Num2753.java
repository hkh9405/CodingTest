package baekjoon;

import java.util.Scanner;

public class Num2753 {

	public static void main(String[] args) {
		//������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
		
		Scanner sc=new Scanner(System.in);
		
		int year=sc.nextInt();
		
		if(year%4==0 && (year%100!=0||year%400==0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
