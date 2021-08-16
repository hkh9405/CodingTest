package programmers.level1;

public class StrangeString {

	public static String solution(String s) {
		String answer = "";
		String[] str=s.split(" ",-1);

		for(int j=0;j<str.length;j++) {
			for(int i=0;i<str[j].length();i++) {
				if(i%2==0) {
					if(str[j].charAt(i)>='a' && str[j].charAt(i)<='z') {
						answer+=(char)(str[j].charAt(i)-32);
					}else {
						answer+=str[j].charAt(i);
					}
				}else {
					if(str[j].charAt(i)>='a' && str[j].charAt(i)<='z') {
						answer+=str[j].charAt(i);
					}else {
						answer+=(char)(str[j].charAt(i)+32);
					}
				}
			}

			if(j!=str.length-1) {
				answer+=" ";
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
		String s="try hello    ";
		
		System.out.println(StrangeString.solution(s));
	}

}
