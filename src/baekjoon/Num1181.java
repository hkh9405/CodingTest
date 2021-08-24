package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Num1181 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		List<String> list=new ArrayList<String>();

		for(int i=0;i<N;i++) {
			String s=sc.next();

			if(!list.contains(s)) {
				list.add(s);
			}
		}

		Collections.sort(list,(String o1, String o2) -> {
			if(o1.length()==o2.length()) {
				return o1.compareTo(o2);
			}else {
				return o1.length() -o2.length();
			}
		});

		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
