package programmers;

import java.util.HashMap;
import java.util.Map;

public class MultiLevel {

	public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
		int[] answer = new int[enroll.length];

		String ref;
		int level;

		Map<String, String> relation=new HashMap<String, String>();
		Map<String, Integer> num=new HashMap<>();

		for(int i=0;i<enroll.length;i++) {
			relation.put(enroll[i], referral[i]);
			num.put(enroll[i], i);
		}

		for(int i=0;i<seller.length;i++) {
			ref=relation.get(seller[i]);
			level=0;

			while(true) {				
				if(ref.equals("-")) {
					if(level==0) {
						answer[num.get(seller[i])]+=(amount[i]*100)-(amount[i]*100/10);
						break;
					}else {
						answer[num.get(seller[i])]+=(amount[i]*100/(int)(Math.pow(10, level)))-(amount[i]*100/(int)(Math.pow(10, level+1)));
						break;
					}
				}else {
					if(level==0) {
						answer[num.get(seller[i])]+=(amount[i]*100)-(amount[i]*100/10);
					}else {
						answer[num.get(seller[i])]+=(amount[i]*100/(int)(Math.pow(10, level)))-(amount[i]*100/(int)(Math.pow(10, level+1)));
						
						if(amount[i]*100/(int)(Math.pow(10, level+1))==0){
							break;
						}
					}
									
					level++;
					seller[i]=ref;
					ref=relation.get(seller[i]);
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] enroll= {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[] referral= {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
		String[] seller= {"young", "john", "tod", "emily", "mary"};
		int[] amount= {12, 4, 2, 5, 10};

		int[] answer=solution(enroll, referral, seller, amount);

		for(int result:answer) {
			System.out.print(result+" ");
		}
	}

}
