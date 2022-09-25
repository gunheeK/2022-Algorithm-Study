import java.util.Arrays;
import java.util.HashMap;

class Solution_h2 {
	HashMap<String, Integer> hash = new HashMap<String, Integer>();

	public boolean solution(String[] phone_book) {
		Arrays.sort(phone_book);
		int[] l = new int[phone_book.length];

		for (int i = 0; i < phone_book.length; i++) {
			hash.put(phone_book[i], 0);
			l[i] = phone_book[i].length();
		}

		for (int i = 1; i < phone_book.length; i++) {
			if (phone_book[i].length() > l[i - 1]) {
				if (hash.containsKey(phone_book[i].substring(0, l[i - 1]))) {
					return false;
				}
			}
		}

		return true;
	}
}

/*public class hash2 {

	public static void main(String[] args) {
		String[] phone_book = { "119", "97674223", "1195524421" };

		Solution_h2 s = new Solution_h2();
		boolean answer = s.solution(phone_book);
		System.out.println(answer);

	}

}*/

//출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges