import java.util.HashMap;

class Solution_h3 {
	HashMap<String, Integer> hash = new HashMap<String, Integer>();

	public int solution(int[] nums) {
		int bringNum = nums.length / 2;
		for (int i = 0; i < nums.length; i++) {
			hash.put(Integer.toString(nums[i]), nums[i]);
		}
		if (bringNum < hash.size())
			return bringNum;
		return hash.size();
	}
}
public class hash3 {

	public static void main(String[] args) {
		int[] Phonekemon = {3,1,2,3};
		Solution_h3 s = new Solution_h3();
		System.out.println(s.solution(Phonekemon));

	}

}

//출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
