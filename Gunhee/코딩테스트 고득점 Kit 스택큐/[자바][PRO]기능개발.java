import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution_s3 {
	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> q = new LinkedList<>();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < progresses.length; i++) {
			int workDay = 100 - progresses[i];
			if (workDay % speeds[i] == 0) {
				q.offer(workDay / speeds[i]);
			}
			else { 
				q.offer(workDay / speeds[i] + 1);
			}
		}
		int count = 1;
		int poll = q.poll();
		for (int i = 0; i < progresses.length; i++) {
			if (q.isEmpty()) {
				arr.add(count);
				break;
			}
			if (poll >= q.peek()) {
				count++;
				q.poll();
			} else {
				poll = q.poll();
				arr.add(count);
				count = 1;
			}
		}
		int[] answer = new int[arr.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = arr.get(i);
		}
		return answer;
	}
}

public class stack3 {
	public static void main(String[] args) {
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };
		Solution_s3 s = new Solution_s3();
		int[] answer = s.solution(progresses, speeds);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}

}

//출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
