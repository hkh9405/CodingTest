package baekjoon;

import java.util.Scanner;

public class Num4948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,n2;
		
		while(true) {
			n=sc.nextInt();
			n2=n*2;
			int count=0;
			
			if(n==0) {
				break;
			}
			
			boolean[] check = new boolean[n2+1];

			check[0]=check[1]=true;
			for(int i=2;i<=n2;i++){
				if(check[i]==false){
					if(i>n)
						count++;
					for(int j=i+i;j<=n2;j+=i)
						check[j]=true;
				}
			}
			
			System.out.println(count);
		}
	}

}
