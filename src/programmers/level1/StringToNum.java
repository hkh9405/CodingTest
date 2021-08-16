package programmers.level1;

public class StringToNum {

	public static int solution(String s) {
		int answer = 0;
		String ans="";
		String num="";

		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				ans+=s.charAt(i);
			}else {
				num+=s.charAt(i);
			}
			
			if(num.equals("zero")) {
				ans+='0';
				num="";
			}else if(num.equals("one")) {
				ans+='1';
				num="";
			}else if(num.equals("two")) {
				ans+='2';
				num="";
			}else if(num.equals("three")) {
				ans+='3';
				num="";
			}else if(num.equals("four")) {
				ans+='4';
				num="";
			}else if(num.equals("five")) {
				ans+='5';
				num="";
			}else if(num.equals("six")) {
				ans+='6';
				num="";
			}else if(num.equals("seven")) {
				ans+='7';
				num="";
			}else if(num.equals("eight")) {
				ans+='8';
				num="";
			}else if(num.equals("nine")) {
				ans+='9';
				num="";
			}
		}

		answer=Integer.parseInt(ans);

		return answer;
	}

	public static void main(String[] args) {
		String s="one4seveneight";

		System.out.println(StringToNum.solution(s));
	}

}
