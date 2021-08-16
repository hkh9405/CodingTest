package programmers.level1;

public class Year2016 {

	public static String solution(int a, int b) {
		String answer = "";

		int day=0;

		for(int i=a;i>1;i--) {
			if(i==2 || i==4 || i==6 || i==8 || i==9 || i==11) {
				day+=31;
			}else if(i==5 || i==7 || i==10 || i==12) {
				day+=30;
			}else if(i==3){
				day+=29;
			}
			System.out.println("Áß°£"+day);
		}
		
		day+=b-1;
		
		if(day%7==0) {
			answer="FRI";
		}else if(day%7==1) {
			answer="SAT";
		}else if(day%7==2) {
			answer="SUN";
		}else if(day%7==3) {
			answer="MON";
		}else if(day%7==4) {
			answer="TUE";
		}else if(day%7==5) {
			answer="WED";
		}else if(day%7==6) {
			answer="THU";
		}
		
		System.out.println(day);
		System.out.println(answer);
		
		return answer;
	}

	public static void main(String[] args) {
		int a=5;
		int b=24;
		
		solution(a,b);
	}

}
