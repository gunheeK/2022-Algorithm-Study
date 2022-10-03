import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution_h5 {
	HashMap<String, Integer> hash = new HashMap<String, Integer>();

	public int[] solution(String[] genres, int[] plays) {
		int[][] plist = new int[plays.length][plays.length];
		int[] tmp = new int[100];
		int[] length1 = new int [1];
		String[][] glist = new String[genres.length][genres.length];
		
		if (genres.length == 1)
			return length1;
		for(int i = 0; i < genres.length; i++) {
			if(hash.containsKey(genres[i]))
				hash.replace(genres[i], hash.get(genres[i]) + plays[i]);
			else
				hash.put(genres[i], plays[i]);
		}
		
		for (int i = 0; i < genres.length; i++) {
			glist[i][0] = genres[i];
			glist[i][1] = Integer.toString(i);
			plist[i][0] = plays[i];
			plist[i][1] = i;
		}
		List<String> list = new ArrayList<>(hash.keySet());
		Collections.sort(list, (value1, value2) -> hash.get(value2).compareTo(hash.get(value1)));
		
		Arrays.sort(plist, (o1, o2) -> {
			if(o1[0] == o2[0]) {
				return o1[1] - o2[1];
			} else {
				return o2[0] - o1[0];
			}
		});
		int c1 = 0;
		for(int i = 0; i < list.size(); i++) {
			int c2 = 0;
			for (int j = 0; j < plist.length; j++) {
				for (int k = 0; k < genres.length; k++) {
					if (list.get(i).equals(glist[k][0])) {
						if (glist[k][1].equals(Integer.toString(plist[j][1]))) {
							if(c2 == 2)
								break;
							tmp[c1] = plist[j][1];
							c1++;
							c2++;
						}
					}
				}
			}
		}
		int[] answer = new int[c1];
		for(int i = 0; i < c1; i++) {
			answer[i] = tmp[i];
		}
		return answer;
	}
}

/*public class hash5 {

	public static void main(String[] args) {
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };
		Solution_h5 s = new Solution_h5();
		System.out.println(s.solution(genres, plays));

	}

}*/

//출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
