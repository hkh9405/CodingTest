package programmers;

public class Keypad {

	public static String solution(int[] numbers, String hand) {
		String answer="";
		
		int lnum=10;
		int rnum=12;
		int ll=0;
		int rl=0;

		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==0) {
				numbers[i]=11;
			}
			
			if(numbers[i]==1||numbers[i]==4||numbers[i]==7) {
				answer+="L";
				lnum=numbers[i];
			}else if(numbers[i]==3||numbers[i]==6||numbers[i]==9) {
				answer+="R";
				rnum=numbers[i];
			}else {
				if(Math.abs(lnum-numbers[i])==0) {
					ll=0;
				}else if(Math.abs(lnum-numbers[i])==1||Math.abs(lnum-numbers[i])==3) {
					ll=1;
				}else if(Math.abs(lnum-numbers[i])==2||Math.abs(lnum-numbers[i])==4||Math.abs(lnum-numbers[i])==6) {
					ll=2;
				}else if(Math.abs(lnum-numbers[i])==5||Math.abs(lnum-numbers[i])==7||Math.abs(lnum-numbers[i])==9) {
					ll=3;
				}else {
					ll=4;
				}
				
				if(Math.abs(rnum-numbers[i])==0) {
					rl=0;
				}else if(Math.abs(rnum-numbers[i])==1||Math.abs(rnum-numbers[i])==3) {
					rl=1;
				}else if(Math.abs(rnum-numbers[i])==2||Math.abs(rnum-numbers[i])==4||Math.abs(rnum-numbers[i])==6) {
					rl=2;
				}else if(Math.abs(rnum-numbers[i])==5||Math.abs(rnum-numbers[i])==7||Math.abs(rnum-numbers[i])==9) {
					rl=3;
				}else {
					rl=4;
				}
				
				if(ll==rl) {
					if(hand.equals("left")) {
						answer+="L";
						lnum=numbers[i];
					}else if(hand.equals("right")) {
						answer+="R";
						rnum=numbers[i];
					}
				}else if(ll<rl) {
					answer+="L";
					lnum=numbers[i];
				}else if(ll>rl) {
					answer+="R";
					rnum=numbers[i];
				}
			}
			System.out.println(answer);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] numbers= {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand="left";
		
		Keypad.solution(numbers, hand);
	}
	
}
