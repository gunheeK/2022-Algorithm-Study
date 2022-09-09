import java.util.HashMap;
import java.util.Map;

class Solution {
	Map<String, Integer> personalType = new HashMap<String, Integer>();
	public String solution(String[] survey, int[] choices) {
		String k = null;
		String[] elementry = { "R", "T", "C", "F", "J", "M", "A", "N" };
		
		personalType.put("R", 0);
		personalType.put("T", 0);
		personalType.put("C", 0);
		personalType.put("F", 0);
		personalType.put("J", 0);
		personalType.put("M", 0);
		personalType.put("A", 0);
		personalType.put("N", 0);
		
		for(int i = 0; i < survey.length; i++) {
			if (choices[i] < 4) {
				k = survey[i].substring(0, 1);
				score(k, choices[i]);
			}
			if (choices[i] > 4) {
				k = survey[i].substring(1);
				score(k, choices[i]);
				
			}
		}
		
		String answer = "";
		
		for (int j = 0; j < elementry.length; j += 2) {
			if (personalType.get(elementry[j]) >= personalType.get(elementry[j + 1]))
				answer += elementry[j];
			else
				answer += elementry[j + 1];
		}
		
		return answer;
	}

	private void score(String k, int i) {
		if (i == 1 || i == 7)
			personalType.replace(k, personalType.get(k) + 3);
		else if (i == 2 || i == 6)
			personalType.replace(k, personalType.get(k) + 2);
		else
			personalType.replace(k, personalType.get(k) + 1);
		
	}
}

/*public class kakao1 {

	public static void main(String[] args) {
		
		String answer = null;
		
		String[] survey1 = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices1 = {5, 3, 2, 7, 5};
		Solution solution = new Solution();
		answer = solution.solution(survey1, choices1);
		System.out.println(answer);
		
		String[] survey2 = {"TR", "RT", "TR"};
		int[] choices2 = {7, 1, 3};
		answer = solution.solution(survey2, choices2);
		System.out.println(answer);

	}

}*/

//출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges