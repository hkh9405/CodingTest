package programmers.level1;

public class Dart {

	public static int solution(String dartResult) {
		int answer = 0;

		char[] word=new char[dartResult.length()];
		String[] score=new String[3];
		String[] bonus=new String[3];
		String[] option=new String[3];

		for(int i=0;i<word.length;i++) {
			word[i]=dartResult.charAt(i);
		}

		int count;
		int index=0;
		int[] result=new int[3];

		for(int i=0;i<3;i++) {
			count=0;
			score[i]="";
			option[i]="";

			while(true) {
				if(index==word.length) {
					break;
				}

				if(word[index]>=48 && word[index]<=57 && count<=1) {
					score[i]+=String.valueOf(word[index]);
					count++;
					index++;
				}else if(word[index]==83 || word[index]==68 || word[index]==84) {
					bonus[i]=String.valueOf(word[index]);
					count++;
					index++;
				}else if(word[index]==42 || word[index]==35) {
					option[i]=String.valueOf(word[index]);
					index++;
					break;
				}else {
					break;
				}
			}
			//System.out.println(score[i]);
			//System.out.println(bonus[i]);
			//System.out.println(option[i]);

			result[i]=Integer.parseInt(score[i]);

			if(bonus[i].equals("S")) {
				result[i]=(int) Math.pow(result[i], 1);
			}else if(bonus[i].equals("D")) {
				result[i]=(int) Math.pow(result[i], 2);
			}else if(bonus[i].equals("T")) {
				result[i]=(int) Math.pow(result[i], 3);
			}
		}

		for(int i=2;i>=0;i--) {
			if(option[i].equals("*")) {
				result[i]*=2;
				if(i>0) result[i-1]*=2;
			}else if(option[i].equals("#")) {
				result[i]*=-1;
			}
			System.out.println(result[i]);
			answer+=result[i];
		}


		return answer;
	}

	public static void main(String[] args) {
		String dartResult="1D2S3T*";

		System.out.println(solution(dartResult));
	}

}
