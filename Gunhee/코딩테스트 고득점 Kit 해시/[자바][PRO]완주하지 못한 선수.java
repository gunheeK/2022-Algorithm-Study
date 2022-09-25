import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution_h1 {
	HashMap<String, Integer> marathon = new HashMap<String, Integer>();

	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int m = 0;
		for (int i = 0; i < participant.length; i++) {
			marathon.put(participant[i], 0);
			if (m < participant.length - 1) {
				if (participant[i].equals(completion[m])) {
					marathon.replace(participant[i], marathon.get(participant[i]) + 1);
					m++;
				}
			}
		}
		List<String> list = new ArrayList<>(marathon.keySet());
		Collections.sort(list, (value1, value2) -> marathon.get(value1).compareTo(marathon.get(value2)));

		String answer = list.get(0);
		return answer;
	}
}

/*public class hash1 {

	public static void main(String[] args) {
		String answer = null;

		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };

		Solution_h1 s = new Solution_h1();
		answer = s.solution(participant, completion);

		System.out.println(answer);

	}

}*/

//출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
