package programmers.level2;

public class StringCompression {

	public static int solution(String s) {
		int answer=s.length();

		int idx,count;
		String str;
		for(int i=1;i<=s.length()/2;i++) {
			idx=0;
			str="";
			count=1;

			while(true) {				
				if(idx==s.length()/i*i-(2*i)) {
					if(s.substring(idx, idx+i).equals(s.substring(idx+i,idx+(2*i)))){
						count++;
						str+=Integer.toString(count)+s.substring(idx, idx+i);
					}else {
						if(count>1) {
							str+=Integer.toString(count)+s.substring(idx, idx+i)+s.substring(idx+i,idx+(2*i));
						}else{
							str+=s.substring(idx, idx+i)+s.substring(idx+i,idx+(2*i));
						}
					}

					idx+=2*i;
					break;
				}
				
				if(s.substring(idx, idx+i).equals(s.substring(idx+i, idx+(2*i)))){
					count++;
				}else {
					if(count>1) {
						str+=Integer.toString(count)+s.substring(idx, idx+i);
					}else{
						str+=s.substring(idx, idx+i);
					}
					
					count=1;
				}
				
				idx+=i;
			}

			if(idx<s.length()) {
				str+=s.substring(idx);
			}

			if(str.length()<answer) {
				answer=str.length();
			}

			System.out.println(str.length());
			System.out.println(str);
			System.out.println("----------------------------");
		}

		return answer;
	}

	public static void main(String[] args) {
		String s="xxxxxxxxxxyyy";
		
		System.out.println(StringCompression.solution(s));
	}

}
