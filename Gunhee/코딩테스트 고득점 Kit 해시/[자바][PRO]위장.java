import java.util.HashMap;

class Solution_h4 {
	HashMap<String, Integer> hash = new HashMap<String, Integer>();

	public int solution(String[][] clothes) {
		for (int i = 0; i < clothes.length; i++) {
			if (hash.containsKey(clothes[i][1]))
				hash.put(clothes[i][1], hash.get(clothes[i][1]) + 1);
			else
				hash.put(clothes[i][1], 1);
		}
		int answer = 1;
		for(String key : hash.keySet()){
            answer = answer * (hash.get(key)+1);
        }
        
        return answer-1;
	}
}

/*public class hash4 {
	public static void main(String[] args) {
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		Solution_h4 s = new Solution_h4();
		System.out.println(s.solution(clothes));

	}

}*/

//출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
