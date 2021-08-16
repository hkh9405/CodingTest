package baekjoon;

import java.util.Scanner;

public class Num1004 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int count;

		int T=sc.nextInt();

		int x1,y1,x2,y2;

		int n,cx,cy,r;
		
		for(int j=1;j<=T;j++) {
			x1=sc.nextInt();
			y1=sc.nextInt();
			x2=sc.nextInt();
			y2=sc.nextInt();
			
			n=sc.nextInt();
			count=0;
			
			for(int i=1;i<=n;i++) {
				cx=sc.nextInt();
				cy=sc.nextInt();
				r=sc.nextInt();

				if((Math.pow(x1-cx, 2)+Math.pow(y1-cy, 2))>Math.pow(r, 2) && (Math.pow(x2-cx, 2)+Math.pow(y2-cy, 2))<Math.pow(r, 2)) {
					count++;
				} else if ((Math.pow(x1-cx, 2)+Math.pow(y1-cy, 2))<Math.pow(r, 2) && (Math.pow(x2-cx, 2)+Math.pow(y2-cy, 2))>Math.pow(r, 2)) {
					count++;
				}
			}

			System.out.println(count);
		}
	}
}



/*if(x1<-1000 || y1<-1000 || x2<-1000 || y2<-1000 || cx[i]<-1000 || cy[i]<-1000 || 
x1>1000 || y1>1000 || x2>1000 || y2>1000 || cx[i]>1000 || cy[i]>1000) {
return;
}*/