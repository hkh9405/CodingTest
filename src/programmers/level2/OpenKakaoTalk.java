package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenKakaoTalk {

	public String[] solution(String[] record) {
		List<String[]> list=new ArrayList<String[]>();
		String[] info=new String[3];
		Map<String, String> nickname=new HashMap<String, String>();
		
		for(int i=0;i<record.length;i++) {
			info=record[i].split(" ");
			
			if(info[0].equals("Enter")) {
				nickname.put(info[1], record[i].split(" ")[2]);
				list.add(info);
			}else if(info[0].equals("Leave")) {
				list.add(info);
			}else if(info[0].equals("Change")) {
				nickname.put(info[1], record[i].split(" ")[2]);
			}
		}
		
		String[] answer=new String[list.size()];
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)[0].equals("Enter")) {
				answer[i]=nickname.get(list.get(i)[1])+"´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
			}else if(list.get(i)[0].equals("Leave")) {
				answer[i]=nickname.get(list.get(i)[1])+"´ÔÀÌ ³ª°¬½À´Ï´Ù.";
			}
		}
		
		return answer;
	}
	
}
